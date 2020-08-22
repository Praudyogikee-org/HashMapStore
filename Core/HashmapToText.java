package Core;
import java.util.concurrent.ConcurrentHashMap;
public class HashmapToText {
	public static String Convert(ConcurrentHashMap<String,String> input, String EDelimiter, String KVDelimiter) {
		/**
		 * This function Converts the HashMap to a String/Text
		 * @param input The HashMap to be converted
		 * @param EDelimiter The Delimiter between every element
		 * @param KVDelimiter The Delimiter between every Key and Value in one element
		 */
		String out = "";
		int size = input.size();
		int init = 0;
		for (Object entry : input.entrySet()) {
			String key = entry.toString().substring(0,entry.toString().indexOf("="));
			String value = entry.toString().substring(entry.toString().indexOf("=")+1,entry.toString().length());
			if(init+1 == size) {
				out+= key+KVDelimiter+value;
			}else {
				out+= key+KVDelimiter+value+EDelimiter;
				init = init + 1;
			}
		}
		return out;
	}
}
