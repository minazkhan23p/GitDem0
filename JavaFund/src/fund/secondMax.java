package fund;

import java.util.ArrayList;

public class secondMax {

	public static void main(String[] args) {
		
		int [] arr= {2,5,4,3,6,7,9,0,8};
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=0;i<arr.length/2;i++) {
			al.add(arr[i]);
			if(i<arr.length/2) {
				al.add(arr[((arr.length)-1)-i]);
			}
			System.out.println(al);
		}
		
		// TODO Auto-generated method stub
//int [] a={2,4,5,1,3,6};
//int min=a[0];
//int secMin=a[0];
//int max=a[0];
//for(int i=0;i<a.length;i++){
//	if(a[i]>max){
//		max=a[i];
//	}
//}
//System.out.println(max);
//for(int i=0;i<a.length;i++){
//	int temp;
//	for(int j=i+1;j<a.length;j++){
//		if(a[i]>a[j]){
//			temp=a[i];
//			a[i]=a[j];
//			a[j]=temp;
//		}
//	}
//	System.out.println(a[i]);
//}

//for(int i=0;i<a.length;i++){
//	if(a[i]<=min){
//		
//		min=a[i];
//		secMin=a[i+1];
//		
//	}
//	else if (a[i]<=secMin) {
//		secMin=a[i];
//		
//	}
//	
//}


	}

}
