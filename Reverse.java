//package server_test;

public class Reverse {
	
	public static String reverse(char[] arrData)
	{
		int nLen = arrData.length;
		for(int i = 0; i < nLen / 2; ++i)
		{
			char temp = arrData[i];
			arrData[i] = arrData[nLen - i - 1];
			arrData[nLen - i - 1] = temp;
		}
		
		return new String(arrData);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char test1[] = "1234".toCharArray();
	    System.out.println(reverse(test1).equals("4321") ? "PASS": "FAIL");

	    char test2[] = "aBc".toCharArray();
	    System.out.println(reverse(test2).equals("cBa") ? "PASS": "FAIL");
	    
	    char test3[] = "z3".toCharArray();
	    System.out.println(reverse(test3).equals("3z") ? "PASS": "FAIL");

	    char test4[] = "q".toCharArray();
	    System.out.println(reverse(test4).equals("q") ? "PASS": "FAIL");

	    char test5[] = "vtdqj2".toCharArray();
	    System.out.println(reverse(test5).equals("2jqdtv") ? "PASS": "FAIL");
	}

}
