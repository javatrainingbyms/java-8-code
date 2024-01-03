package in.serosoft;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> cities=Arrays.asList("indore","bhopal","delhi","mumbai");
		//Consumer<String> consumer=System.out::println;
		//cities.forEach(consumer);
		cities.forEach(System.out::println);
		//cities.forEach(item->System.out.println(item));
		
		/*
		Consumer<String> consumer=new Consumer<String>() {

			@Override
			public void accept(String item) {
				System.out.println(item);
			}
		};
		cities.forEach(consumer);
		*/
		/*
		for(String city:cities) {
			System.out.println(city);
		}
		*/
		/*
		for(int i=0; i<cities.size();i++) {
			System.out.println(cities.get(i));
		}
		*/
	}
}
