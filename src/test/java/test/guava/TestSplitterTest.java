package test.guava;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.Maps;

public class TestSplitterTest {

	@Test
	public void testTestSplitter() {
		String startString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
		Map<String,String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C","Redskins");
		testMap.put("New York City","Giants");
		testMap.put("Philadelphia","Eagles");
		testMap.put("Dallas","Cowboys");
		Map<String, String> splitMap = new TestSplitter().testSplitter(startString);
		assertThat(testMap,is(splitMap));
	}

}
