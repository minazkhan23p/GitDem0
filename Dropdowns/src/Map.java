import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Map {
	
	public static void main(String[] args)  {
		String[] names = { "MINAZ", "Abhijith", "ram", "Adam", "Alekhya" };
		
		List<String> nameList = Arrays.asList(names);
		List<String> nameList1=nameList;
		//nameList.stream().filter(s->s.endsWith("m")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//for sorting 
		nameList.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		Stream<String> newList=Stream.concat(nameList.stream(), nameList1.stream());
		//newList.sorted().forEach(s->System.out.println(s));
		//boolean b=newList.anyMatch(s->s.equalsIgnoreCase("adam"));
		//Assert.assertTrue(b);
		streamCollect(nameList,newList);

	}
	
	public static void streamCollect(List<String> nameList,Stream<String> newList){
		List<String>namelist1=nameList.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		namelist1.stream().forEach(s->System.out.println(s));
		namelist1.stream().limit(1).forEach(s->System.out.println(s));
		System.out.println(namelist1.get(0));
		newList.distinct().forEach(s->System.out.println(s));
	}
}
