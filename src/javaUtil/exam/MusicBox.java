package javaUtil.exam;

//쓰레드와 공유객체
//synchronized 가 붙어 있을 경우 먼저실행된 메소드가 우선순위가 잡히고 모니터링락 상태가 된다. 동기화 처리
public class MusicBox {
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("쒼나는 음악~~!");
			
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
			System.out.println("슬픈 음악~~!");
			
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
				System.out.println("까풰 음악~~!");
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
