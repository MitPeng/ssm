package test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oracle.dao.IRoleDao;
import com.oracle.dao.IUserDao;
import com.oracle.model.Menu;
import com.oracle.model.Role;
import com.oracle.model.User;
import com.oracle.service.IMenuService;
import com.oracle.service.IRoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:application.xml","classpath:spring-mybatis.xml"})
public class UserTest {

	@Autowired
//	private IUserDao iud;
//	private IRoleService rsi;
	private IMenuService msi;
	
	@Test
	public void user() {
//		User u = iud.queryUserByPhone("15616198427");
//		System.out.println(u.getSalt());
//		List<Role> roles = rsi.findRoleByUid(4);
//		System.out.println(roles);
		List<Menu> menus = msi.findMenuByPid(0);
		System.out.println(menus);
	}
}
