package �迭;

//�޼��忡 �迭 ����, �������� �ʴ� �� (void)
public class Selection_sort_method_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3,2,5,9,7 =>��������
		int []a=new int[] {3,2,5,9,7};
		do_selection_sort(a);
		//���
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		  }
	
   } //end main 
	public static int[] do_selection_sort(int a[]) {
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
		return a;
		}
}
