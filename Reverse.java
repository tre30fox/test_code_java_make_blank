//package server_test;

public class Reverse {
	/*
	입력받은 캐릭터 배열을 역순으로 뒤집어 반환한다.
	1234 => 4321
	1 => 1
	zda => adz
	*/
	public static String reverse(char[] arrData)
	{
		int nLen = arrData.length;
		//문자열의 길이
		
		//결과
		String result = "";
		
		// 구현
		for(int i=0; i<nLen; i++) {
			
			result += arrData[nLen-i-1];
			System.out.println("result = " + result);
		}
		
		return new String(result);
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
