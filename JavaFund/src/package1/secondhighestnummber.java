package package1;

public class secondhighestnummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,6,5,4,8,7,1};
//		int arrsize=a.length;
//		int temp;
//		for(int i=0;i<a.length;i++){
//			
//			for(int j=i+1;j<a.length;j++){
//				if(a[i]>a[j]){
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//					
//				}
//			}
//	}
//		System.out.println(a[arrsize-2]);
		
		int max=a[0];
		int seccmax=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				seccmax=max;
				max=a[i];
				
			}
			else if (a[i]>seccmax) {
				seccmax=a[i];
				
			}
		}
		System.out.println(seccmax);

}
}
