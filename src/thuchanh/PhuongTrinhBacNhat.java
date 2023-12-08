package thuchanh;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("PT: ax + b = c");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Nghiem cua phuong trinh la: " + x);
        }
        else {
            if (b == c) {
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
