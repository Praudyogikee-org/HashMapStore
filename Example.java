import java.util.concurrent.ConcurrentHashMap;
import Core.*;
public class Example {
	public static void main(String[] args) {
		/**
		 * This is a test, After the 4 lines are executed successfully, [text] must equal [test].
		 * @param text The data text
		 * @param test The HashmapToText output
		 * @param HM The HashMap
		 */
		String text = "K1,V1:K2,V2:K3,V3";
		ConcurrentHashMap<String,String> HM = new ConcurrentHashMap<String,String>();
		HM = TextToHashmap.Convert(text, ":",","); // Text to HashMap
		String test = HashmapToText.Convert(HM,":",","); // HashMap to Text
		if(test.equals(text)) System.out.println("Successful Test");
	}
}
