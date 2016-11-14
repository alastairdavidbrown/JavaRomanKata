package numerals;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;



public class NumberMap
{

	private Map<String, Integer> numberMap = new HashMap<String, Integer>();
    public static boolean ASC = true;
    public static boolean DESC = false;

    
	NumberMap()
	{
		numberMap.put("I",1);
		numberMap.put("IV",4);
        numberMap.put("V",5);
        numberMap.put("IX",9);
		numberMap.put("X",10);
        numberMap.put("XL",40);
		numberMap.put("L",50);
		numberMap.put("C",100);
        numberMap.put("CD",400);
		numberMap.put("D",500);
        numberMap.put("CM",900);
		numberMap.put("M",1000);
        
	}
    
    public int get(String r){return numberMap.get(r);}
    public void sortDesc(){numberMap = sortByComparator(numberMap, DESC);}
    public Map getMap(){return(numberMap);}
    
    
    
    private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
    {
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());
        // Sorting the list based on values
        Collections.sort(list, new Comparator<Entry<String, Integer>>()
        {
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2)
            {
                if (order)
                    return o1.getValue().compareTo(o2.getValue());
                else
                    return o2.getValue().compareTo(o1.getValue());

            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : list)
            sortedMap.put(entry.getKey(), entry.getValue());
    
        
        return sortedMap;
    }
    
    
    

}
