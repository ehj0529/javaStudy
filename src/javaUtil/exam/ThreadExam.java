package javaUtil.exam;

public class ThreadExam {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1("*");
		MyThread1 t2 = new MyThread1("-");

		//�����带 ȣ�� �Ҷ� run�� ȣ�� �ϴ� ���� �ƴϰ� start �� ���� ȣ���ؾߵ�.
		t1.start();//main �� �߰��� ����� run�� ���� �ϹǷ� �����帧�� �߰� �ȴ�. 
		t2.start();
		
		System.out.println("main end !!!");
	}

}
