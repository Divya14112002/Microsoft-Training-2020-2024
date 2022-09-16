import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		int len=str.length();
		String revstr="";
		int i=len-1;
		while(i>=0){
		    revstr+=str.charAt(i);
		    i--;
		}
		if(str.equals(revstr)){
		    System.out.print(str+" is a palindromic string");
		}
		else{
		    System.out.print(str+" is not a palindromic string");
		}
		
		
	}
}
