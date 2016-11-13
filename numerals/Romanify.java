package numerals;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;


public class Romanify
{

	NumberMap numberMap = new NumberMap();
    
    public String toRoman(int a)
	{
            numberMap.sortDesc();
            String r = new String();
            Set set = numberMap.getMap().entrySet();
            Iterator iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry me = (Map.Entry)iterator.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
                while (a >= (Integer) me.getValue())
                {
                    a = a - (Integer) me.getValue();
                    r += me.getKey();
                    System.out.println("a:" + a + " r:" + r);
                }
            }    
            

            return (r);
	}

}
