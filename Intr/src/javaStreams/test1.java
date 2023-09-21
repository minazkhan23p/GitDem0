package javaStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("abhi");
		list.add("pabhi");
		list.add("andh");
		list.add("dev");
		list.add("syc");
		list.add("adam");
//		int count=0;
//		for(String name:list) {
//		String acttual = name;
//		if(acttual.startsWith("a")) {
//			count++;
//			
//		}
//	}
//		System.out.println(count);
		
		//using streams
		long c = list.stream().filter(s->s.startsWith("a")).count();
		System.out.println(c);
		//to operate on every element use foreach()
		list.stream().forEach(s->System.out.println(s));
		list.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		//to limit the rsults 
		list.stream().filter(s->s.length()>3).limit(2).forEach(s->System.out.println(s));
		//to create streams
//		Stream.of("abhi","pabhi","andh","dev","syc","adam").filter(s->
//		//we can have many conditions
//		{
//			s.startsWith("a");
//		return false;
//		}).count();
		

}
	
}
