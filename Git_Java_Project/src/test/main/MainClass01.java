package test.main;

import java.util.Optional;
import java.util.Scanner;

public class MainClass01 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String test = Optional.ofNullable(new Scanner(System.in).skip("[\t]*").skip("\\w").nextLine()).orElse("");
		System.out.println("결과:"+test);
	}
}
