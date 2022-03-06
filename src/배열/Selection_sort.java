package 배열;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3,2,5,9,7 =>오름차순
		int []a=new int[] {3,2,5,9,7};
		int temp;
		
		for(int i=0; i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
