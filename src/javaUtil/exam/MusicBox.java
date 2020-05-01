package javaUtil.exam;

//¾²·¹µå¿Í °øÀ¯°´Ã¼

public class MusicBox {
	public void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("¾°³ª´Â À½¾Ç~~!");
			
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
			System.out.println("½½ÇÂ À½¾Ç~~!");
			
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
			System.out.println("±î¿R À½¾Ç~~!");
			
			try {
				Thread.sleep( (long) (Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
