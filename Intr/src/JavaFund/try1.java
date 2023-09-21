package JavaFund;

public class try1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={2,4,5,1,3,6};
		int min=a[0];
		int secMin=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
