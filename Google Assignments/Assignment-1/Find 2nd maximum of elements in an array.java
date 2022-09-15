import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0]>arr[1]?arr[0]:arr[1];
        int seclargest=arr[0]<arr[1]?arr[0]:arr[1];
        for(int i=2;i<n;i++){
            if(arr[i]>largest){
                seclargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclargest){
                seclargest=arr[i];
            }
        }
        System.out.print(seclargest);
	}
}
