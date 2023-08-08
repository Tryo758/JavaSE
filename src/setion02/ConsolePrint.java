package setion02;
/*
 * 출력
 * prinln은 데이터화면출력후 행바꿈
 * prin는 행바꿈안함
 * printf 서식코
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("welcome. ");
		System.out.println("JAVA World");
		
		System.out.printf("오늘은 %d월 %d일 입니다. \n", 8, 5);
		
		System.out.printf("%d은 첫번쨰, %f은 두번쨰, %s은 세번째", 1,2.0,"셋");
	}
}
