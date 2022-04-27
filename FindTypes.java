package week2.day1;

public class FindTypes {
	
public static void main(String[] args) {
	
	
	String str = "$$ Welcome to 2nd Class of Automation $$ ";
	
	char[] strArr = str.toCharArray();
	
	int  letter = 0, space = 0, num = 0, specialChar = 0;
	
	for (int i=0; i< str.length()-1; i++)
	{
		if(Character.isLetter(strArr[i]))
		
			letter = letter+1 ;
		
		else if(Character.isDigit(strArr[i]))
			
			num = num + 1;
	
		else if(Character.isSpaceChar(strArr[i]))
		
			space = space+1;
		
		else
		
			specialChar = specialChar+1; 
	}
	
	System.out.println("letter: " + letter);
	
	System.out.println("space: " + space);
	
	System.out.println("number: " + num);
	
	System.out.println("specialCharcter: " + specialChar); 
		
}
}
