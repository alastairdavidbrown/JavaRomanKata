package numerals;
import numerals.Arabify;
import numerals.Romanify;

public class TestNumeralConverter
{
    private static Arabify a = new Arabify();
    private static Romanify r = new Romanify();

	TestNumeralConverter(){}

	public static void main(String[] args)
	{
        testInt("I is 1", a.toArab("I"), 1);
        testInt("V is 5", a.toArab("V"), 5);
        testInt("X is 10", a.toArab("X"), 10);
        testInt("L is 50", a.toArab("L"), 50);
        testInt("C is 100", a.toArab("C"), 100);
        testInt("D is 500", a.toArab("D"), 500);
        testInt("M is 1000", a.toArab("M"), 1000);
        testInt("IV is 4", a.toArab("IV"), 4);
        testInt("VI is 6", a.toArab("VI"), 6);
        testInt("VX is 5", a.toArab("VX"), 5);
        testInt("MCMLXVIII is 1968", a.toArab("MCMLXVIII"), 1968);
        testInt("MMMMXXXVII is 4037", a.toArab("MMMMXXXVII"), 4037);      
        testString("1968 is MCMLXVIII", r.toRoman(1968), "MCMLXVIII");
        
        testString("1 is I", r.toRoman(1), "I");
        testString("5 is V", r.toRoman(5), "V");
        testString("10 is X", r.toRoman(10), "X");
        testString("50 is L", r.toRoman(50), "L");
        testString("100 is C", r.toRoman(100), "C");
        testString("500 is D", r.toRoman(500), "D");
        testString("1000 is M", r.toRoman(1000), "M");
        testString("4 is IV", r.toRoman(4), "IV");
        testString("6 is VI", r.toRoman(6), "VI");
        testString("1968 is MCMLXVIII", r.toRoman(1968), "MCMLXVIII");
        testString("4037 is MMMMXXXVII", r.toRoman(4037), "MMMMXXXVII"); 
        
	}

  private static boolean testInt(String d, int a, int b){
    System.out.println(((a==b)? "PASS:" : "FAIL:") + " Test: " + d + ": results is " + a + " expected " + b);
    if (a==b){
      return true;
    }else
      return false;
  }
    
   private static boolean testString(String d, String a, String b){
    System.out.println((a.equals(b)? "PASS:" : "FAIL:") + " Test: " + d + ": results is " + a + " expected " + b);
    if (a.equals(b)){
      return true;
    }else
      return false;
  }

}
