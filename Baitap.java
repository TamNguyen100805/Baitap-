package pheptinh;
import java.util.Scanner;
public class Baitap {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //nhap
        System.out.println("Nhap ho va ten: ");
        String a = keyboard.nextLine();
        System.out.print("Nhap tuoi: ");
        int b = keyboard.nextInt();
        System.out.println("Nhap nam sinh: ");
        int c = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String d = keyboard.nextLine();
        System.out.println("Nhap chuyen nganh: ");
        String e = keyboard.nextLine();
        System.out.println("Nhap GPA: ");
        float f = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Nhap que quan: ");
        String g = keyboard.nextLine();
        //xuat
        System.out.println("\n----------In ra---------\n");
        System.out.println("Ho va ten: " + a + "\n" +
                           "Tuoi: " + b + "\n" +
                           "Nam sinh: " + c + "\n" +
                           "Gioi tinh: " + d + "\n" +
                           "Chuyen nganh: " + e + "\n" +
                           "GPA: " + f + "\n" +
                           "Que quan: " + g);
    }
}
