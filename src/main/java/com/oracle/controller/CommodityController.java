package com.oracle.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oracle.model.CateComm;
import com.oracle.model.CateList;
import com.oracle.model.Commodity;
import com.oracle.service.ICommodityService;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

	@Autowired
	private ICommodityService cosi;
	
	@RequestMapping("/addCommodity")
	@ResponseBody
	public Map<String,Object> addCommodity(Commodity c, String commImgOne, String commImgTwo, String commImgThree, String commImgFour, String commImgFive) {
		Map<String,Object> map = new HashMap<String,Object>();
		c.setMainImg(commImgOne);
		int res = cosi.addCommodity(c,commImgOne,commImgTwo,commImgThree,commImgFour,commImgFive);
		if(res==1) {
			map.put("code", 200);
		}else {
			map.put("code", 500);
		}
		return map;
	}
	
	@RequestMapping(value="/categorys",method = RequestMethod.POST)
    @ResponseBody
    public List<CateList> queryCategoryByPid(Integer pid) {
        return cosi.queryCategoryByPid(pid);
    }
	
	@RequestMapping(value="/queryCommByCateLimitTen",method = RequestMethod.POST)
    @ResponseBody
    public List<CateComm> queryCommByCateLimitTen() {
        return cosi.queryCommByCateLimitTen();
    }
}
