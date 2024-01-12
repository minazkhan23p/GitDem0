package progPractice;

public class walmart {

	public static void main(String[] args) {		int[] nums = {1,2,3};
	int count =0;
	int k=3;
	for(int i=0;i<nums.length;i++) {
		int sum=0;
		sum=nums[i];
		if(sum==k) {
			count++;
		}
		if(sum<k) {
			for(int j=i+1;j<nums.length;j++) {
				sum=sum+nums[j];
				if(sum==k) {
					count++;
					break;
				}
				
			}
		}
	}
	System.out.println(count);

//
//	String input = "abcdababcdefghcbb";
//	int maxCount=0;
//	int count=0;
//	ArrayList<Character> lst = new ArrayList<Character>();
//	for(Character a:input.toCharArray()) {
//		
//		if(!lst.contains(a)) {
//			lst.add(a);
//			count++;
//		}
//		else if (lst.contains(a)) {
//			lst.clear();
//			count=1;
//			lst.add(a);
//		}
//		if(count>maxCount) {
//			maxCount=count;
//		}
//	}
//	System.out.println(maxCount);
	}

}
