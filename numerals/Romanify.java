package numerals;

public class Romanify
{

	NumberMap numberMap = new NumberMap();
    MutableBoolean mb = new MutableBoolean(false);
    
    public String toRoman(int a)
	{
                
            String r = new String();
            while (a > 0)
            {
                a = a/10;
                r += "X";
            }
            return (r);
	}

}
