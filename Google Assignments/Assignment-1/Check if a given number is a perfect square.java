import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++){
		    if(i*i==n){
		        count++;
		    }
		    
		}
		if(count>0){
		    System.out.print(n+" is a perfect square");
		}
		else{
		    System.out.print(n+" is not a perfect square");
		}
	}
}
