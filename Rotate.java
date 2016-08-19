//package server_test;

public class Rotate {
	
	/*
	주어진 data 와 rotated 가 circular rotate(순환 회전) 관계인지 여부 반환
	즉, 전체 문자열이 좌/우로 이동한 상태, 이동한 문자열이 한쪽 끝에 다다르면 반대편 끝에서 나타남.
	ex)
	  data == "abc" and rotated == "cab"  => true
	  data == "abc" and rotated == "acb"  => false
	*/
	public static boolean rotate(String strSrc, String strRotated)
	{
		
		char[] arrSrc = strSrc.toCharArray();
		char[] arrRotated = strRotated.toCharArray();

		// 구현

		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate("abc", "cab") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "bca") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "abc") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "bac") == false ? "PASS": "FAIL");
		System.out.println(rotate("abc", "acb") == false ? "PASS": "FAIL");

		System.out.println(rotate("13234", "13234") == true ? "PASS": "FAIL");
		System.out.println(rotate("13234", "41323") == true ? "PASS": "FAIL");
		System.out.println(rotate("13234", "23413") == true ? "PASS": "FAIL");
		System.out.println(rotate("13234", "32341") == true ? "PASS": "FAIL");
		System.out.println(rotate("13234", "12343") == false ? "PASS": "FAIL");
		System.out.println(rotate("13234", "23314") == false ? "PASS": "FAIL");
	}
}
