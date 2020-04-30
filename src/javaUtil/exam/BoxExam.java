package javaUtil.exam;

public class BoxExam {
	
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("Hello");
//		String str = (String) box.getObj();
//		
//		System.out.println( ">>>> "+ str);
//		
//		box.setObj(1);

		Box<Object> box1 = new Box<>();
		box1.setObj("Hello");
		String str1 = (String) box1.getObj();
		
		Box<String> box2 = new Box<>();
		box2.setObj("Hello");
		String str2 = box2.getObj();

		Box<Integer> box3 = new Box<>();
		box3.setObj(3);
		Integer int3 = box3.getObj();
		
	}

}
