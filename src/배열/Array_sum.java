package ¹è¿­;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =new int[100];  //
		
		int sum =0;
		
		for(int i=0; i<=a.length; i++) {
			if(i%2==0) {
				sum-=i;
			}else {
				sum+=i;
		}
		}
		System.out.println(sum);
		
	}

}
