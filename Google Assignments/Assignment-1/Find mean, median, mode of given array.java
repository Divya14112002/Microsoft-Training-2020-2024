import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,count=0,max=0,mode=0,median=0;
		int[] arr=new int[n];
		int left=0,right=n-1;
		int mid=left+(right-left)/2;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    sum+=arr[i];
		 }
		 Arrays.sort(arr);
		 for(int i=0;i<n;i++){
		     median=arr[mid];
		 }
		 for(int i=0;i<n;i++){
		     for(int j=i+1;j<n;j++){
		         if(arr[i]==arr[j]){
		             count++;
		         }
		     }
		     if(max<count){
		         max=count;
		         mode=arr[i];
		     }
		 }
		 
		System.out.println(sum/n);
		System.out.println(median);
		System.out.print(mode);
	}
}

		
