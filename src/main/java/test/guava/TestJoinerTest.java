package test.guava;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestJoinerTest {

	@Test
	public void test() {
		String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
		String testMapJoiner = new TestJoiner().testMapJoiner();
		assertThat(testMapJoiner,is(expectedString));
	}

}
