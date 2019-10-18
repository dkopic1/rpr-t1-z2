package ba.unsa.etf.rpr.predavanje03;
import java.util.Scanner;

public class Main {

    public static int sumaCifara (int broj) {
        int suma = 0;
        while (broj != 0) {
            suma += broj%10;
            broj /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i = 0; i < n; i++) {
            if (((i + 1) % sumaCifara(i+1)) == 0)
                System.out.println(i+1);
        }
	// write your code here
    }
}
