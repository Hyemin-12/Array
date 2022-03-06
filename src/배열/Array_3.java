package 배열;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 a[10] 에 1~10까지 저장
		//a[0]~a[9]까지 합을 구하기 
		int[] a =new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		int[] b = new int[] {3,5,7,9,4,13,54,76,98,323,52,22,5,6,7,4};  //숫자 6개여서 0부터 5까지
		for(int i=0;i<b.length;i++ ) {  //인덱스 0~15 , 길이 16
			sum+= b[i];
		}
		System.out.println(sum);
	}

}
