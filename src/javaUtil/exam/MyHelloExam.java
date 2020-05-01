package javaUtil.exam;

import java.lang.reflect.Method;

public class MyHelloExam {
	
	
	public static void main(String[] args) {
				
		MyHello hello = new MyHello();
		try {
			//메소드의 정보를 호출 함.
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Count100.class)) { //어노테이션이 적용이 되어 있는지 확인함.
				for ( int i=0; i < 100; i++ ) {
					hello.hello();
				}
			} else {
				hello.hello();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
