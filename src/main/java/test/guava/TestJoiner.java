package test.guava;

import java.util.Map;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;

public class TestJoiner {
	
	public String testMapJoiner() {
		//Using LinkedHashMap so that the original order is preserved

		Map<String,String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C","Redskins");
		testMap.put("New York City","Giants");
		testMap.put("Philadelphia","Eagles");
		testMap.put("Dallas","Cowboys");
		String returnedString = Joiner.on("#").
		withKeyValueSeparator("=").join(testMap);
		return returnedString;
		}
}
