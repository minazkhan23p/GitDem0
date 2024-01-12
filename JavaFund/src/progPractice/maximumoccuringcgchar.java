package progPractice;

import java.util.ArrayList;

public class maximumoccuringcgchar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="minazkhanabaa";
		int k=0;
		int m=0;
		int n=0;
		int max=0;
		String maxOCC="";
		
		ArrayList<String> arr= new ArrayList<String>();
		ArrayList<String> arr2= new ArrayList<String>();
		for(int i=0;i<a.length();i++){
		k=0;
		String charac = null;
		
			if(!arr.contains(Character.toString(a.charAt(i)))){
				arr.add(Character.toString(a.charAt(i)));
				k++;
				for(int j=i+1;j<a.length();j++){
					if(Character.toString(a.charAt(i)).equals(Character.toString(a.charAt(j)))){
						k++;
					}
				}
//				if(k>m){
//					m=k;
//					charac=Character.toString(a.charAt(i));
//					System.out.println(charac +""+m);
//					arr2.add(charac +""+m);
//				}
//				else{
//					n=k;
//					charac=Character.toString(a.charAt(i));
//					System.out.println(charac +""+n);
//					arr2.add(charac +""+n);
//				}
			}
			if(k>max) {
			max=k;
			maxOCC=Character.toString(a.charAt(i));
			
			}
			
		
		
		}
		System.out.println("max char "+maxOCC );
		for(int l=0;l<arr2.size();l++){
			if(Integer.parseInt(arr2.get(l).substring(1))>1){
				System.out.println("---------");
				System.out.println(arr2.get(l));
			}
		}
		
		
		

	}

}

//
//
//package pack;
//
//import java.util.ArrayList;
//
//public class One {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		String a="minazkhzzzzzaaan";
//int max=0;
//String maxOCC="";
//
//		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<String> list1 = new ArrayList<String>();
//		for(int i=0;i<a.length();i++) {
//			int count=0;
//			if(!list.contains(Character.toString(a.charAt(i)))) {
//				count++;
//				list.add(Character.toString(a.charAt(i)));
//				for(int j=i+1;j<a.length();j++) {
//					if(Character.toString(a.charAt(i)).equals(Character.toString(a.charAt(j)))) {
//						count++;
//						
//					}
//				}
//
//if(count>max) {
//max=k;
//maxOCC=Character.toString(a.charAt(i));
//
//}
//				list1.add(Character.toString(a.charAt(i))+" "+count);
//		}
//			
//
//	}
//System.out.println("max char "+maxOCC );
//		
//	}
//}


//Scanner sc = new Scanner(System.in);
//int n1=0,n2=1,n3;
//int number = Integer.parseInt(sc.nextLine());
//for(int i=1;i<=number;i++) {
//	
//	n3=n1+n2;
//	System.out.println(n3+" ");
//	n1=n2;
//	n2=n3;
//	
//}



