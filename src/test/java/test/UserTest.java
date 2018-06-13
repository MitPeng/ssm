package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oracle.dao.IUserDao;
import com.oracle.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:application.xml"})
public class UserTest {

	@Autowired
	private IUserDao iud;
	
	@Test
	public void user() {
		User u = iud.queryUserByPhone("15616198427");
		System.out.println(u.getSalt());
	}
}
