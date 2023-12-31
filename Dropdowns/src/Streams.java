import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
	public static void main(String[] args) {
		String[] names = { "MINAZ", "Abhijith", "ram", "Adam", "alekhya" };
		int i = 0;
		//to create a list 
		//List<String> a=new ArrayList<String>();
		//a.add("a")
		List<String> nameList = Arrays.asList(names);
		for (String name : nameList) {
			if (name.startsWith("A")) {
				i++;

			}
		}
		System.out.println(i);
		Streams.Stream(nameList);
	}
	
	public static void Stream(List<String> nameList){
		long CNT=nameList.stream().filter(s->s.startsWith("A")).count();
		//or {s.startsWith("A");
		//return false;}
		System.out.println(CNT);
		//nameList.stream().forEach(s->System.out.println(s));
		//with filter
		nameList.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		nameList.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
	}

}
