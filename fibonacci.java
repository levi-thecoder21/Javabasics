import java.util.Scanner;
public class Primitives{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for :");
        int inp = in.nextInt();
        int n = inp;
        int count = 0;
        while(n>0){
            int rem=n%10;
            if(rem==3){
              count++;
            }
            n= (int) (n/10);
          } System.out.print(count);
        }
    } 
