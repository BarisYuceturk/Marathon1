// Method içinde methodu tekrar çağırarak yaptığım deneme

package marathon.baris;

import java.util.Scanner;

public class ShapeTestTry {

	public static void main(String[] args) {
		ShapeTestTry shapeTest = new ShapeTestTry();
		shapeTest.readInput();
		System.out.println("Bye...");
	}

	public static void readInput() {
		double perimeter;
		double area;
		double a, b, c, d;
		int i = 1;
		ShapeTestTry shapeTest = new ShapeTestTry();

		while (true) {

			System.out.println(
					"Lütfen hesaplamak istediğiniz şeklin (en fazla 4 kenar) kenar uzunluklarını giriniz ( -1 ile çıkış): ");
			Scanner scan = new Scanner(System.in);

			System.out.println("Lütfen 1. kenar uzunluğunu giriniz (0 ile sonlandır): ");

			a = scan.nextDouble();

			if (a == -1) {
				break;
			}

			if (a < 0 && a != -1) {
				System.out.println("Negatif kenar girmeyiniz");
				shapeTest.readInput();
			}

			switch ((int) a) {
			case (0):

				System.out.println("Kenarsız şekil olamaz!");
				shapeTest.readInput();

			}

			System.out.println("Lütfen 2. kenar uzunluğunu giriniz (0 ile sonlandır): ");

			b = scan.nextDouble();

			if (b < 0) {
				System.out.println("Negatif kenar girmeyiniz");
				shapeTest.readInput();
			}

			switch ((int) b) {
			case (0):

				System.out.println("Tek kenarlı şekil olamaz! ");
				shapeTest.readInput();

			}

			System.out.println("Lütfen 3. kenar uzunluğunu giriniz (0 ile sonlandır): ");

			c = scan.nextDouble();

			if (c < 0) {
				System.out.println("Negatif kenar girmeyiniz");
				shapeTest.readInput();
			}

			switch ((int) c) {
			case (0):

				System.out.println("2 kenarlı şekil olamaz! ");
				shapeTest.readInput();

			}

			System.out.println("Lütfen 4. kenar uzunluğunu giriniz (0 ile sonlandır): ");

			d = scan.nextDouble();

			if (d < 0) {
				System.out.println("Negatif kenar girmeyiniz");
				shapeTest.readInput();
			}

			if (d == 0) {

				perimeter = (a + b + c);
				area = ((a) * (b)) / 2;

				System.out.println(+i + ". şeklin çevresi: " + perimeter);
				System.out.println(+i + ". şelin alanı: " + area);

				i++;

			} else if (d > 0) {

				perimeter = (a + b + c + d);
				area = a * b;

				System.out.println(+i + ". şeklin çevresi: " + perimeter);
				System.out.println(+i + ". şeklin alanı: " + area);

				i++;

			}
		}
	}
}
