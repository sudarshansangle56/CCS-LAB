import java.math.BigInteger;
import java.util.Scanner;
public class RSA {
    public static int gcd(int e, int phi) {
        if (phi == 0)
            return e;
        return gcd(phi, e % phi);
    }
    public static int findE(int phi) {
        int e = 2;
        while (e < phi) {
            if (gcd(e, phi) == 1) {
                return e;
            }
            e++;
        }
        return -1;}
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime P");
        int P = sc.nextInt();
        System.out.print("Enter prime Q");
        int Q = sc.nextInt();
        System.out.print("Enter message");
        int M = sc.nextInt();
        sc.close();

        int N = P * Q;
        int phi = (P - 1) * (Q - 1);
        int e = findE(phi);
        BigInteger eB = BigInteger.valueOf(e);
        BigInteger phB = BigInteger.valueOf(phi);
        int d = eB.modInverse(phB).intValue();
     
        BigInteger MB = BigInteger.valueOf(M);
        BigInteger NB = BigInteger.valueOf(N);
        BigInteger C = MB.modPow(eB, NB); 
      
        BigInteger DBig = BigInteger.valueOf(d);
        BigInteger decrypM = C.modPow(DBig, NB); 
        System.out.println("Encrypted msg: " + C);
        System.out.println("Decrypted msg: " + decrypM);
    }
}