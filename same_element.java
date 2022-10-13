import java.util.*;
public class same_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first array length : ");
        int a = sc.nextInt();
        System.out.print("Enter second array length : ");
        int b = sc.nextInt();
        int[] harsh=new int [a];
        System.out.println("Enter elements of 1st array :");
        for(int i=0;i<a;i++){
            harsh[i] =sc.nextInt();
        }
        
        System.out.println("Enter elements of 2nd array :");
        int[] sr=new int [b];
        for(int i=0;i<b;i++){
                sr[i] =sc.nextInt();
         }
         System.out.println("Same elements are : ");        
         for(int i=0; i<harsh.length;i++){
             for(int j=0;j<sr.length;j++){
                 if(harsh[i]==sr[j]){
                     System.out.print(harsh[i]+" ");
                 }
             }
         }
    }
}
