package numerals;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;


public class Romanify
{

	NumberMap numberMap = new NumberMap();
    
    public String toRoman(int arabicValue)
	{
            numberMap.sortDesc();
            String romanNumber = new String();
            Set set = numberMap.getMap().entrySet();
            Iterator iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry thisValueMap = (Map.Entry)iterator.next();
                while (arabicValue >= (Integer) thisValueMap.getValue())
                {
                    arabicValue -= (Integer) thisValueMap.getValue();
                    romanNumber += thisValueMap.getKey();
                }
            }    
            return (romanNumber);
	}

}
