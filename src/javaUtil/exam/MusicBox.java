package javaUtil.exam;

//������� ������ü

public class MusicBox {
	public void playMusicA() {
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

	public void playMusicB() {
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
			System.out.println("��R ����~~!");
			
			try {
				Thread.sleep( (long) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
