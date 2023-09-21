package package1;

import java.util.ArrayList;

public class uniqueletter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String A[]={"A","B","C","A","C","D","D"};
ArrayList<String>alist=new ArrayList<String>();
int k=0;
for(int i=0;i<A.length;i++){

	if(!alist.contains(A[i])){
		alist.add(A[i]);
		k++;
		for(int j=i+1;j<A.length;j++){
			if(A[i].equals(A[j])){
				k++;
			}
		}
		
		}
	if(k<=1){
		System.out.println(A[i]);
	
	}

}
	}

}
