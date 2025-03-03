import java.util.Scanner;

public class Hellman {
    public static void main (String args[]){
        Scanner S= new Scanner(System.in);
        System.out.println("Enter the first prime value");
        int P= S.nextInt();
        System.out.println("Enter the G primitive root Number");
        int G=S.nextInt();
        System.out.println("Enter the private key of user  A");
        int A=S.nextInt();
        System.out.println("Enter the  private key of user B");
        int B=S.nextInt();

        int YA=(int)Math.pow(G, A)%P;
        int YB=(int)Math.pow(G, B)%P;

        int KAB= (int)Math.pow(YB,A)%P;
        int KABB=(int)Math.pow(YA,B)%P;

        if(KAB==KABB){
            System.out.println("both are same");
        }
        
        System.out.println(KAB);
        System.out.println(KABB);
        }
}
