package �迭;
//1+4+6+8.....100������ ���� ���Ͻÿ� 
//a[i]=(i+1)*2 ���� 

public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[50];
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
				a[i]=(i+1)*2;
				sum+=a[i];
		  }
		System.out.println(sum);
		
	}

}

