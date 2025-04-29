package com.anonymous;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
public class Lambda {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> bifun = (a,b) ->  a+b;
		System.out.println(bifun.apply(10,20));
		Supplier<String> sup=() -> "Processing complete";
		System.out.println(sup.get());
		Predicate<Integer> pred= n -> n%2==0;
		System.out.println(pred.test(10));
		Function<String, Integer> fun= str -> str.length();
		System.out.println(fun.apply("Rashee"));
		Consumer<Float> consumer= n -> System.out.println((n>0)?"Positive":"Negative");
		consumer.accept(9.0F);
	}

}
