package section01;
/*
 * 주
 */


public class Comment {
	public static void main(String[] args) {
		//한줄 주
		System.out.println("Hello, JAVA!");
		
		getArea(10);
	}
	
	public static void getArea(int r) {
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이: " + area);
	}
}
