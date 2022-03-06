package 배열;

public class Array_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초기화 연습 
		
		//1. 10개 정수 배열, 1,2,3,4........10(초기화)
		int num[]=new int[10];
		num[0] =1; num[1] =2; num[2] =3; num[3] =4; num[4] =5;
		num[6] =7; num[7] =3; num[8] =3; num[9] =3; num[10] =3;
		
		//2.5개 실수 배열 1.2, 1.3, 1.4, 1.5, 1.6
		double num1[]= new double[] {1.2, 1.3, 1.4, 1.5, 1.6};
		//중괄호 => 리터널 방식 
		
		//3. 프로그램 => 10개 정수 배열, 1,2,3,4.....10(초기화)
		int num2[]=new int[10];
		for(int i=0; i<10; i++) {  //초기화 
			num2[i]=i+1;
		}
		for(int i=0;i<10;i++) {   //출력
			System.out.println(num2[i]);
		}
		
	}
}

