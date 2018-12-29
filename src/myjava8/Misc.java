package myjava8;

import java.util.Arrays;
import java.util.stream.IntStream;
public class Misc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//IntStream.range(1, 10).filter(i->i>6).forEach(x->System.out.println(x));
		String[] names = {"jack","jone","james","tom","donald"};
		Arrays.stream(names).sorted().filter(x->x.startsWith("ja")).forEach(System.out::println);

	}

}
