package server_test;

public class Rotate {
	
	public static boolean rotate(String strSrc, String strRotated)
	{
		
		char[] arrSrc = strSrc.toCharArray();
		char[] arrRotated = strRotated.toCharArray();
		
		if(arrSrc.length != arrRotated.length)
		{
			return false;
		}
		
		int nLen = arrSrc.length;
		
		for(int nShift = 0; nShift < nLen; ++nShift)
		{
			boolean bResult = true;
			for(int nCol = 0; nCol < nLen; ++nCol)
			{
				if(arrSrc[nCol] != arrRotated[(nCol + nShift) % nLen])
				{
					bResult = false;
					break;
				}
			}
			if(bResult)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotate("abc", "cab") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "bca") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "abc") == true ? "PASS": "FAIL");
		System.out.println(rotate("abc", "bac") == false ? "PASS": "FAIL");
		System.out.println(rotate("abc", "acb") == false ? "PASS": "FAIL");

		System.out.println(rotate("1324", "1324") == true ? "PASS": "FAIL");
		System.out.println(rotate("1324", "4132") == true ? "PASS": "FAIL");
		System.out.println(rotate("1324", "2413") == true ? "PASS": "FAIL");
		System.out.println(rotate("1324", "3241") == true ? "PASS": "FAIL");
		System.out.println(rotate("1324", "1234") == false ? "PASS": "FAIL");
		System.out.println(rotate("1324", "2314") == false ? "PASS": "FAIL");
		
	}

}
