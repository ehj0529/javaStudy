package javaUtil.exam;

public class RamdaExam {

	public static void main(String[] args) {
		
		
/*//AS IS 방식 // 기존에는 메소드를 객체로 생성을 하여 파람으로 넘길수가 있었음.)
		  new Thread(new Runnable() { 
			  
			   @Override 
			   public void run() { 
			   	for(int i =0; i<10; i++) {
			   		System.out.println(i+":: hello"); 
			   	}
			   }
		 }).start();
 */
		
		//[람다식] 으로 전달 하는 방법  자바 8.0 에서 지원 되는 방식
		new Thread(()->{
			   	for(int i =0; i<10; i++) {
			   		System.out.println(i+":: hello"); 
			   	}
		}).start();
		
	}

}
