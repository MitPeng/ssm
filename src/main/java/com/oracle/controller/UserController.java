package com.oracle.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.model.Menu;
import com.oracle.model.User;
import com.oracle.service.IMenuService;
import com.oracle.service.IUserService;
import com.oracle.utils.MessageUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService usi;
	@Autowired
    private IMenuService msi;
	
	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping(value="/admin/index",method = RequestMethod.GET)
    public String aindex(){
        return  "admin/index";
    }
	
	@RequestMapping("/menu")
    @ResponseBody
    public Map<String,Object> findMenuByPid(Integer pid){
        List<Menu> menus = msi.findMenuByPid(pid);
        Map<String,Object> res = new HashMap<String,Object>();
        Map<String,Object> r = new HashMap<String,Object>();
        r.put("children",menus);
        res.put("code",100);
        res.put("msg","菜单获取成功");
        res.put("extend",r);
        System.out.println(res);
        return res;
    }
	
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String phone,String passWord) {
		Map<String, Object> map = new HashMap<String, Object>();
		Subject subject = SecurityUtils.getSubject();
		if(subject.isAuthenticated()==false) {
			UsernamePasswordToken token = new UsernamePasswordToken(phone, passWord);
//			System.out.println("token:"+token);
			try {
				subject.login(token);
				System.out.println("用户："+subject.getSession().getAttribute("CURRENT_USER"));
				map.put("status", 1);
			}catch(Exception e) {
				e.printStackTrace();
				map.put("status", 0);
			}
		}else {
//			User user = usi.queryUserByPhone(phone);
//			String salt = user.getSalt();
//			SimpleHash sh = new SimpleHash("MD5", passWord,ByteSource.Util.bytes(salt) , 1024);
//			User u = usi.login(phone,sh.toString());
//			System.out.println(phone+"/"+sh.toString());
//			session.setAttribute("CURR_USER", u);
//			if(u==null) {
//				map.put("status", 0);
//				return map;
//			}
			map.put("status", 1);
		}
		String roleCode = "";
        if(subject.hasRole("admin")){
            roleCode = "admin";
        }
        map.put("roleCode",roleCode);
        return map;
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Object add(String phone,String passWord,String passWord2,String message,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		User u1 = usi.queryUserByPhone(phone);
		String message2 = (String) session.getAttribute("message");
		if(u1!=null) {
			map.put("status", 0);
			return map;
		}
		if(!message.equals(message2)) {
			map.put("status", 1);
			return map;
		}
		if(!passWord.equals(passWord2)) {
			map.put("status", 2);
			return map;
		}
		Random rd = new Random();
		int salt = rd.nextInt(100000);
		User user = new User( passWord,phone);
		SimpleHash sh = new SimpleHash("MD5", user.getPassWord(),ByteSource.Util.bytes(salt+"") , 1024);
		user.setPassWord(sh.toString());
		user.setSalt(salt+"");
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String regDate = df.format(day);
		user.setRegDate(regDate);
		usi.addUser(user);
		map.put("status", 3);
		return map;
	}
	
	@RequestMapping("/message")
	@ResponseBody
	public Object message(String phone,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		String message = MessageUtil.getMessage(phone);
		session.setAttribute("message", message);
		if(message!=null) {
			map.put("status", 1);
		}else {
			map.put("status", 2);
		}
		return map;
	}
	
	@RequestMapping("/exit")
	public String exit(HttpSession session) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
//		session.removeAttribute("CURRENT_USER");
		return "redirect:/login.html";
	}
	
	@RequestMapping("/getUser")
	@ResponseBody
	public Object getUser(HttpSession session) {
		User u = (User) session.getAttribute("CURRENT_USER");
//		System.out.println(u);
		return u;
	}
	
	@RequestMapping("/findAllUser")
	@ResponseBody
	public Object findAllUser() {
		return usi.findAllUser();
	}
}
