package fund;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;


public class sorting {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = { 2, 5, 6, 5, 4, 8, 7, 1 };
		ArrayList<int> arr= new ArrayList<int>();

//		Arrays.sort(a);
		 for(int i=0;i<a.length;i++){
		 int temp;
		 for(int j=i+1;j<a.length;j++){
		 if(a[i]>a[j]){
		 temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 }
		 }
		 arr.add(a[i]);
		 }
		
		 
//		List<Integer> list =	Arrays.asList(a);
//		Collections.sort(list);
//		//Collections.reverse(list);
//		
//		//list.stream().forEach(s->System.out.println(s));
//		System.out.println(list.get(list.size()-2));
//		
	
		/*Supplier
		Consumer
		
		Predicate
		Funcation*/
		
		
		
	}

}
