import java.util.*;
import java.math.BigInteger;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		BigInteger fact=new BigInteger("1");
		for(int i=2;i<=n;i++){
		    fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.print(fact);
	}
}
