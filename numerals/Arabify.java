package numerals;

public class Arabify
{

	NumberMap numberMap = new NumberMap();
    
    public int toArab(String r)
	{
            int n = 0, i=0;
            MutableBoolean isSubtractivePair = new MutableBoolean(false);
			while (i < r.length()){
                
                String rp = getRomanPair(r,i);
                int arabicValue = getArabicValueForRomanPair(rp, isSubtractivePair);
                n += arabicValue;
                if (isSubtractivePair.get() == true)
                    i=i+2;
                else
                    i++;
            }
            return n;
	}
    
    private String getRomanPair(String r, int i)
    {
        if(i < r.length() - 1)
            return (r.substring(i,i+2));
        else
            return (r.substring(i,i+1));
    }
    
    
    private int getArabicValueForRomanPair(String rp, MutableBoolean s) 
    {
        
        if (rp.length() == 1)
            return numberMap.get(rp.substring(0,1));
        
        int thisArabicValue = numberMap.get(rp.substring(0,1));
        int nextArabicValue = numberMap.get(rp.substring(1,2));
        
        //System.out.println(":thisArabicValue:" + thisArabicValue + "nextArabicValue:" + nextArabicValue );
        if (nextArabicValue > thisArabicValue){
            s.set(true);
            return nextArabicValue - thisArabicValue;
        } else {
            s.set(false);
            return thisArabicValue;
        }
    }

}
