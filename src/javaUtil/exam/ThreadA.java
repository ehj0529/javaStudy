package javaUtil.exam;


//wait를 실한 한 경우 누군가 notify를 호출 하여 해당 쓰래드를 깨워야 실행이 된다.
// ThreadB에서 for문 실행 완료 후 notify를 호출 하여 main의  wait를 깨워 다음을 실행한다.
/*결과 
B가 완료 될때 까지 기다립니다. 
0를 더합니다.
1를 더합니다.
2를 더합니다.
3를 더합니다.
4를 더합니다.
Total is :5
*/
public class ThreadA {
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("B가 완료 될때 까지 기다립니다. ");
				b.wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is :"+b.total);
		}
		
	}
}
