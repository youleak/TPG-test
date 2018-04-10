package test.question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class IPValidationRegex {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\user\\Desktop\\ip.txt";
		Predicate<String> ipFilter = Pattern
                .compile("(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)")
                .asPredicate();
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.filter(ipFilter).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
