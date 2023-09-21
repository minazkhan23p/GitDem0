package javaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("abhi");
		list.add("pabhi");
		list.add("andh");
		list.add("dev");
		list.add("syc");
		list.add("adam");
		//ptint names >4 and convert ton upper case 
		Stream.of("abhi","pabhi","andh","dev","syc","adam").filter(s->s.length()>3).forEach(s->System.out.println(s.toUpperCase()));
		//or 
		Stream.of("abhi","pabhi","andh","dev","syc","adam").filter(s->s.length()>3).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//to sort 
		Stream.of("abhi","pabhi","andh","dev","syc","adam").sorted().forEach(s->System.out.println(s));
		List<String> list2 = Arrays.asList("qccd","cwee","evw","btrbtr","bteve","ccw");
		
		
		//merge two lists 
		Stream<String> str = Stream.concat(list.stream(), list2.stream());
		//anymatch gievs a boolean and filter gives subset of results 
		boolean a=list.stream().anyMatch(s->s.equalsIgnoreCase("abhi"));
		Assert.assertTrue(a);
	}

}
