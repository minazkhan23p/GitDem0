package javaStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list= new ArrayList<String>();
		list.add("abhi");
		list.add("pabhi");
		list.add("andh");
		list.add("dev");
		list.add("syc");
		list.add("adam");
		//Collections.sort(list)
		//Collections.sort(list,Collections.reverseOrder());
		List<String> a =list.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).collect(Collectors.toList());
		//TO GET FIRST ELEMT 
		System.out.println(a.get(0));
		//to print unique no's
		Stream.of(1,3,5,2,45,1,3,5).distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> b = Stream.of(1,3,5,2,45,1,3,5).distinct().sorted().collect(Collectors.toList());
	}

}
