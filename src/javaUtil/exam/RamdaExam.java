package javaUtil.exam;

public class RamdaExam {

	public static void main(String[] args) {
		
		
/*//AS IS ��� // �������� �޼ҵ带 ��ü�� ������ �Ͽ� �Ķ����� �ѱ���� �־���.)
		  new Thread(new Runnable() { 
			  
			   @Override 
			   public void run() { 
			   	for(int i =0; i<10; i++) {
			   		System.out.println(i+":: hello"); 
			   	}
			   }
		 }).start();
 */
		
		//[���ٽ�] ���� ���� �ϴ� ���  �ڹ� 8.0 ���� ���� �Ǵ� ���
		new Thread(()->{
			   	for(int i =0; i<10; i++) {
			   		System.out.println(i+":: hello"); 
			   	}
		}).start();
		
	}

}
