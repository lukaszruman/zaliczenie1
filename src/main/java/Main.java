import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Napisz pierwszą liczbe: ");
        int liczba1 = scanner.nextInt();

        System.out.print("Napisz druga liczbe: ");
        int liczba2 = scanner.nextInt();

        int nww = obliczNWW(liczba1, liczba2);
        System.out.println("Najwieksza wspolna wielekrotnościa tych liczb jest: " + nww);
    }

    public static int obliczNWW(int a, int b) {
        int temp = a;
        while (temp % b != 0) {
            temp += a;
        }
        return temp;
    }
}