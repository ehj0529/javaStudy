package javaUtil.exam;


//wait�� ���� �� ��� ������ notify�� ȣ�� �Ͽ� �ش� �����带 ������ ������ �ȴ�.
// ThreadB���� for�� ���� �Ϸ� �� notify�� ȣ�� �Ͽ� main��  wait�� ���� ������ �����Ѵ�.
/*��� 
B�� �Ϸ� �ɶ� ���� ��ٸ��ϴ�. 
0�� ���մϴ�.
1�� ���մϴ�.
2�� ���մϴ�.
3�� ���մϴ�.
4�� ���մϴ�.
Total is :5
*/
public class ThreadA {
	public static void main(String[] args) {
		
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) {
			try {
				System.out.println("B�� �Ϸ� �ɶ� ���� ��ٸ��ϴ�. ");
				b.wait();
				
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is :"+b.total);
		}
		
	}
}
