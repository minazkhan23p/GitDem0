package JavaFund;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//first way 
		int[] arr =  new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[2]);
		
		//second way 
		int [] arr1 = {1,3,4,5,6};
		System.out.println(arr1[2]);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		//for loops
		for(int array:arr) {
			if(array%2==0) {
			System.out.println(array);
			break;
			}
			else {
				System.out.println(array+" not multiple");
			}
		}
		
	}

}
