import java.util.*;

public class findsumpair {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int a =sc.nextInt();
	   int b= sc.nextInt();
	   int sum= sc.nextInt();
	   int[][] arr=new int[a][b];
	   for(int i=0;i<a;i++){
	     for(int j=0;j<b;j++){
	       arr[i][j]=sc.nextInt();
	     }  
	   }
	   for(int i=0;i<a;i++){
	     for(int j=0;j<b;j++){
	         if(arr[i]+arr[j]==sum){
	             System.out.println(arr[i]+arr[j]);
	         }
	     }
	   }
	}
}


