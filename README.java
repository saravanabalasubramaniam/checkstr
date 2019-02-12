import java.io.*;
import java.util.*;
class Checkstr
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	char c[]=a.toCharArray();
	int flag=0;
	for(int i=0;i<a.length();i++)
	{
		if((c[i]>='0')&&( c[i]<='9')||(c[i]>='a')&&( c[i]<='z')||(c[i]>='A')&&( c[i]<='Z'))
		{
			flag=1;		
		}
	}
	if(flag==1)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
  }
}
