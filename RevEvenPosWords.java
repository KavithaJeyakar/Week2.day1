package week2.day1;

public class RevEvenPosWords {

	public static void main(String[] args)
	{
		
	String str="I am a software tester";
	String[] split = str.split(" ");
	
	
	for(int i=0;i<split.length;i++)
	{

		if(i%2!=0)
		{
			char[] SplitArr=split[i].toCharArray();
			String rev="";
			
			for(int j=(SplitArr.length-1);j>=0;j--)
			{
				rev=rev+SplitArr[j];	
			}
			
			split[i]=rev;
			System.out.print(split[i]+" ");
		}
		
		else 
			System.out.print(split[i]+" ");

	}
}

}