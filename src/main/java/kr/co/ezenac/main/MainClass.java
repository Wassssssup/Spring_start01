package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml 파일을 로딩한다.
		// 그것을 담당하는 클래스가 ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
		
		

	}

}
