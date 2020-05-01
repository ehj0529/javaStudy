package javaUtil.exam;

//������� ������ü
//synchronized �� �پ� ���� ��� ��������� �޼ҵ尡 �켱������ ������ ����͸��� ���°� �ȴ�. ����ȭ ó��
public class MusicBox {
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("������ ����~~!");
			
			try {
				Thread.sleep( (long) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void playMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("���� ����~~!");
			
			try {
				Thread.sleep( (long) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void playMusicC() {
		for(int i=0; i<10; i++) {
			
			synchronized (this) {
				System.out.println("��R ����~~!");
			}
			
			try {
				Thread.sleep( (long) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
