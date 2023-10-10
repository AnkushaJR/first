import java.util.*;
class Palindrome  
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s=sc.nextLine();
		int i,j,flag=0;
		j=s.length()-1;
		for(i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag=1;
				break;
			}
			j--;
		}
		if(flag==1)
		{
			System.out.println("string is not palindrome");
		}
		else{
			System.out.println("is palindrome");
		}
	}
}
