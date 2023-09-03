package util;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class Util {
	public static PrintStream System_out;
	static {
		System_out = new PrintStream(System.out, true, UTF_8);
	}
}
