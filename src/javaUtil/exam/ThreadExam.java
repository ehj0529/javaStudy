package javaUtil.exam;

public class ThreadExam {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");

		//쓰레드를 호출 할때 run을 호출 하는 것이 아니고 start 를 먼저 호출해야됨.
		t1.start();//main 과 추가로 선언된 run을 실행 하므로 수행흐름이 추가 된다. 
		t2.start();
		
		System.out.println("main end !!!");
	}

}
