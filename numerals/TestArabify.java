package numerals;
import numerals.Arabify;

public class TestArabify
{
  private static Arabify a = new Arabify();

	TestArabify(){}

	public static void main(String[] args)
	{
    test("I is 1", a.toArab("I"), 1);
    test("V is 5", a.toArab("V"), 5);
    test("X is 10", a.toArab("X"), 10);
    test("L is 50", a.toArab("L"), 50);
    test("C is 100", a.toArab("C"), 100);
    test("D is 500", a.toArab("D"), 500);
    test("M is 1000", a.toArab("M"), 1000);
    test("IV is 4", a.toArab("IV"), 4);
    test("VI is 6", a.toArab("VI"), 6);
    test("VX is 5", a.toArab("VX"), 5);
    test("MCMLXVIII is 1968", a.toArab("MCMLXVIII"), 1968);
    test("MMMMXXXVII is 4037", a.toArab("MMMMXXXVII"), 4037);
    test("MMMMXXVXII is 4027", a.toArab("MMMMXXVXII"), 4027);

	}

  private static boolean test(String d, int a, int b){
    System.out.println(((a!=b)? "FAIL:" : "PASS:") + " Test: " + d + ": results is " + a + " expected " + b);
    if (a!=b){
      return false;
    }else
      return true;
  }

}
