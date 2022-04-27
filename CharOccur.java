package week2.day1;

public class CharOccur {
	
	public static void main(String[] args) {
		
		String str = "Welcome to Chennai";
		
		char[] strarr = str.toCharArray();
		
		int count =0;
		
		for (int i =0; i<strarr.length;i++)
		{	
			if (strarr[i] == 'e'|| strarr[i] == 'E')
			{
				count = count+1;			
			}
		}	
		System.out.println ("The letter 'e' in the string : "+count);	
	}

	}