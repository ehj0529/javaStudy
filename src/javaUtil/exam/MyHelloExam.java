package javaUtil.exam;

import java.lang.reflect.Method;

public class MyHelloExam {
	
	
	public static void main(String[] args) {
				
		MyHello hello = new MyHello();
		try {
			//�޼ҵ��� ������ ȣ�� ��.
			Method method = hello.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Count100.class)) { //������̼��� ������ �Ǿ� �ִ��� Ȯ����.
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
