
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil;
        char operator;

        System.out.print("Masukan Angka pertama: ");
        angka1 = input.nextInt();
        System.out.print("Masukan operator (+, -, *, /)");
        operator = input.next().charAt(0);
        System.out.print("Masukan Angka kedua: ");
        angka2 = input.nextInt();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " x " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang dimasukan salah!");
                break;
        }
    }
}