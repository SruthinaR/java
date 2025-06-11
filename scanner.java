import java.util.Scanner;
class Main {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the size of an a array:");
         int n=in.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++)
         {
             System.out.println("Enter the value");
             arr[i]=in.nextInt();
         }
         
    }
}