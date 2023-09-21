package fund;

import java.util.ArrayList;

public class maximumoccuringcgchar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="minazkhan";
		int k=0;
		int m=0;
		int n=0;
		
		
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
				if(k>m){
					m=k;
					charac=Character.toString(a.charAt(i));
					System.out.println(charac +""+m);
					arr2.add(charac +""+m);
				}
				else{
					n=k;
					charac=Character.toString(a.charAt(i));
					System.out.println(charac +""+n);
					arr2.add(charac +""+n);
				}
			}
			
		
		
		}
		for(int l=0;l<arr2.size();l++){
			if(Integer.parseInt(arr2.get(l).substring(1))>1){
				System.out.println("---------");
				System.out.println(arr2.get(l));
			}
		}
		
		
		

	}

}

