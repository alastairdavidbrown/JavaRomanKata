package numerals;
import java.util.HashMap;

public class Arabify
{

	HashMap<String, Integer> numeralMap = new HashMap<String, Integer>();

	Arabify()
	{
		numeralMap.put("I",1);
		numeralMap.put("V",5);
		numeralMap.put("X",10);
		numeralMap.put("L",50);
		numeralMap.put("C",100);
		numeralMap.put("D",500);
		numeralMap.put("M",1000);
	}


	public int toArab(String r)
	{

			// Iterate through the string applying the rules
			// Convert the current character and the next character to a value
			// If the next value is smaller than the current value subtract the current from the next
			// and sum the result to the running total
			int n = 0;
			for (int i = 0; i < r.length(); i++){
				 String crd = r.substring(i,i+1); //Current Roman Digit
				 int cav = numeralMap.get(crd);		//Current Arabic Value
				 if (i < r.length() - 1){ // There's more in the "string"
					 String nrd = r.substring((i+1),(i+2));	// Next Roman Digit
					 int nav = numeralMap.get(nrd);		//Next Arabic Value
					 if (nav > cav){
						 n += (nav - cav);
						 i++; // OMG that's dangerous
					 }else{
						 n += cav;
					 }
				}else{
					n += cav;
				}
			}
			return n;
	}


}
