package 배열;

public class Array_01 {
	public static void main(String args[]) {
		//배열 선언 연습 
		//1. 정수 10개 저장 배열
		
		int num[]; //선언
		num = new int[10];    //메모리에 공간을 만들어주는 것 new 	
		System.out.println(num[5]); //초기값 없는 int형이므로 0이다.

		//2.실수 5개 배열
		
		double num2[];
		num2=new double[5];   // new는 메모리에 실수 5개 공간을 만들어주는 것 
		System.out.println(num2[4]);  //초기값이 없는 double형이므로 0.0
		
		//3.실수 12개 배열
		
		double num3[];
		num3=new double[12];
		System.out.println(num3[11]);
		
		//4.한줄로 실수 12개 배열 
		double num3_2[]=new double[12];
     }
}
