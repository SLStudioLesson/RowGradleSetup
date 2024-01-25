/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rowgradlesetup;



import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

	private final InputStream systemIn = System.in;
	private final PrintStream systemOut = System.out;
	private ByteArrayOutputStream testOut;

	@BeforeEach
	public void setUpOutput() {
		testOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(testOut));
	}

	private void provideInput(String data) {
		ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}

	private String getOutput() {
		return testOut.toString();
	}

	@AfterEach
	public void restoreSystemInputOutput() {
		System.setIn(systemIn);
		System.setOut(systemOut);
	}

	@Test
	public void testCase1() {
        // System.out.println("---------------------------------------------------------------------------");
        // System.out.println(System.getProperty("java.version"));
        // System.out.println(System.getProperty("java.home"));
		String input = "ああああ";
		provideInput(input);

		App.main(new String[0]);

	    Assertions.assertThat(getOutput().trim()).isEqualTo(input);
		
	}
}
