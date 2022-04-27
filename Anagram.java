package week2.day1;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	
	String str1 = "racea";
	
	String str2 = "caree";
	
	char[] str1Arr = str1.toCharArray();
	char[] str2Arr = str2.toCharArray() ;
	
	boolean flag =false;
	
	Arrays.sort(str1Arr);
	Arrays.sort(str2Arr);
	
	if(str1.length()==str2.length())
	{		
		for (int i=0;i<=str1.length()-1;i++)
		{	
			if (str1Arr[i]==str2Arr[i] )
			
				flag = true;
			
			else
			{
				flag = false;
				break;
			}
		}
		
		if (flag)
		{
			System.out.println("It's a anagram string");
		}
		else
		{
			System.out.println("It's not a anagram string");
		}
	}
	else
	{
		System.out.println("The string lengths are not same to check anagram word");
	}
}
}
