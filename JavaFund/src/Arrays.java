import java.lang.reflect.Array;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a[]= new int[5];
a[0]=1;
a[1]=10;
a[2]=12;
a[3]=145;
a[4]=14;*/
		//another way
		 int a[]={1,10,20,30,40};
	
for(int i=0;i<a.length;i++){
	System.out.println(a[i]);
}
//multidimensional array
int b[][]= new int[2][3];
b[0][0]=15;
b[0][1]=12;
b[0][2]=14;
b[1][0]=16;
b[1][1]=12;
b[1][2]=11;
//or int b[][]={{1,2,3},{4,5,6}};
System.out.println(b[1][2]);

for(int j=0;j<2;j++){
	for(int k=0;k<=2;k++){
		System.out.println(b[j][k]);
	}
}
//List<int> d=Arrays.asList(a);
System.out.println(d);

	}

	


}
