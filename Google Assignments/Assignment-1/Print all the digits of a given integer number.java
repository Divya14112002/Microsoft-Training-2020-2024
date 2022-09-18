import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=Integer.toString(n);
		for(int i=0;i<str.length();i++){
		    System.out.println(str.charAt(i));
		}
		
		
	}
}

//Recursive method:
/*import java.util.*;
public class Main
{
    public static int f(int n){
        if(n==0){
            return 0;
        }
        else{
            f(n/10);
            System.out.println(n%10);
            
        }
        return 0;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		f(n);
		
		
	}
}
*/


