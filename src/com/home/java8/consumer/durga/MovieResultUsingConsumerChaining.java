package com.home.java8.consumer.durga;

import java.util.function.Consumer;

import com.home.java8.utility.durga.Movie;

public class MovieResultUsingConsumerChaining {

	public static void main(String[] args) {
		
		Consumer<Movie> c1 = m -> System.out.println("Movie :" + m.name + " is release");
		Consumer<Movie> c2 = m -> System.out.println("Movie :"+ m.name + " is "+ m.result);
		Consumer<Movie> c3 = m -> System.out.println("Movie :"+ m.name +" information stored in DB \n");
		
		Consumer<Movie> chaningC = c1.andThen(c2).andThen(c3);
		Movie m1 = new Movie("Bahubali", "Flop");
		chaningC.accept(m1);
		
		Movie m2 = new Movie("Spider", "Hit");
		chaningC.accept(m2);
	}

}
