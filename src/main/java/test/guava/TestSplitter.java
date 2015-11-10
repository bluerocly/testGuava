package test.guava;

import java.util.Map;

import com.google.common.base.Splitter;

public class TestSplitter {
	public Map<String, String> testSplitter(String startString) {
		
		Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
		Map<String,String> splitMap = mapSplitter.split(startString);
		return splitMap;
	}
}
