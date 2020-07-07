package Core;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapToText {
	public static String Convert(HashMap<String,String> input, String EDelimiter, String KVDelimiter) {
		/**
		 * This function Converts the HashMap to a String/Text
		 * @param input The HashMap to be converted
		 * @param EDelimiter The Delimiter between every element
		 * @param KVDelimiter The Delimiter between every Key and Value in one element
		 */
		String out = "";
		int size = input.size();
		int init = 0;
		for (Entry<String, String> entry : input.entrySet()) {
			if(init+1 == size) {
				out+= entry.getKey()+KVDelimiter+entry.getValue();
			}else {
				out+= entry.getKey()+KVDelimiter+entry.getValue()+EDelimiter;
				init = init + 1;
			}
		}
		return out;
	}
}
