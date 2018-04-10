package test.question3;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;

public class TimeCount {

	public static <T> T printTime(Callable<T> task) {
		T call = null;
		try {
			Instant start = Instant.now();
			call = task.call();
			Instant end = Instant.now();
			System.out.println("Executed in " + Duration.between(start, end).getSeconds() + "s.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return call;
	}
}