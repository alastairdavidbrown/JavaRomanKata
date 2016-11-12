package numerals;
import java.util.HashMap;

public class NumberMap
{

	private HashMap<String, Integer> numberMap = new HashMap<String, Integer>();
    
	NumberMap()
	{
		numberMap.put("I",1);
		numberMap.put("V",5);
		numberMap.put("X",10);
		numberMap.put("L",50);
		numberMap.put("C",100);
		numberMap.put("D",500);
		numberMap.put("M",1000);
	}
    
    public int get(String r){return numberMap.get(r);}
    

}
