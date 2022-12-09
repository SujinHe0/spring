package ex04;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml") //ctx 선언해서 불러올 필요없이 바로사용
public class App {
	
	@Autowired TV tv;
	@Test
	public void test() {
		//xml 에 등록된 객체? 들을 불러서 사용할 수 있도록 하는것이 ctx~~
		//이거안쓰고 대체할 수 있는게 -> spring test 
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		//new Tv()이렇게 선언할 필요 없이 getBean
		
//		TV tv = ctx.getBean(TV.class); autowired붙이고 불러오면된다.. 따로 선언필요없이 메소드바로
		tv.on();
	}
}
