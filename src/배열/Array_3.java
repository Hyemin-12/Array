package �迭;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 a[10] �� 1~10���� ����
		//a[0]~a[9]���� ���� ���ϱ� 
		int[] a =new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		int[] b = new int[] {3,5,7,9,4,13,54,76,98,323,52,22,5,6,7,4};  //���� 6������ 0���� 5����
		for(int i=0;i<b.length;i++ ) {  //�ε��� 0~15 , ���� 16
			sum+= b[i];
		}
		System.out.println(sum);
	}

}
