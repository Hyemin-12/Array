package 배열;

public class Array_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 1+2+3+4+5 =? 
		int a[] = new int[5]; //길이 (length=5),인덱스 (0~4)
		int sum=0;
		for(int i=0; i<a.length; i++) {
			a[i]=i+1;
		}
		for(int i=0;i<a.length;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		//2. 국, 영, 수 , 자바 점수 => 국,영,수 합 구하기 
		int [] score =new int[] {98,75,56,92};
		for(int i=0;i<score.length-1;i++) {
			sum += score[i];
		}
		System.out.println(sum+"점");
	}

}
