package kr.co.ezenac.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezenac.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml 파일을 로딩한다.
		// 그것을 담당하는 클래스가 ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("kr/co/ezenac/config/beans.xml");
			//beans.xml의 bean 태그 안 "id" 값을 호출하여 가져옴 (가져올때는 Object 타입이기 때문에 캐스팅 / 다형성 구조이기떄문에 추상메서드가 있는 클래스 타입으로)
			//getBean이 하는 역할 : beans.xml에 정의한 bean객체의 주소값을 가져온다.
		HelloWorld hello1= (HelloWorld)ctx.getBean("hello");
		callMethod(hello1);
		
		//(방식2)컴파일 되어 class 파일이 되는 행위를 미리 해준 방식.
		HelloWorld hello2=ctx.getBean("hello",HelloWorld.class);
			callMethod(hello2);
		
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
