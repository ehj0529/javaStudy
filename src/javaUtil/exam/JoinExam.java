package javaUtil.exam;

public class JoinExam {

	public static void main(String[] args) {
		
		MyThread5 thread5 = new MyThread5();
		
		thread5.start();
		
		System.out.println("start !!");

		try {
			thread5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end!!");

	}

}
