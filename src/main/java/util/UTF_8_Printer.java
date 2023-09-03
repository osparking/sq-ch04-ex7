package util;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class UTF_8_Printer {
	public static PrintStream printStream;
	static {
		printStream = new PrintStream(System.out, true, UTF_8);
	}
}
