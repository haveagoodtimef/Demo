package tmss.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fhz.dao.ProjectDao;
import com.fhz.entity.Project;

public class Demo {

	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProjectDao pd = ac.getBean("projectDao",ProjectDao.class);
		Project p =  pd.findObjects();
		System.out.println(p.toString());
	}
}
