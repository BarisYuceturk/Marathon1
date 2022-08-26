// İlk kurgudan ayrı çözüm

package marathon.baris;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		ShapeTest shapeTest = new ShapeTest();
		shapeTest.readInput();
		System.out.println("Bye...");
	}

	public static void readInput() {
		int perimeter;
		int area;
		int i = 1;
		int[] lengthShape = new int[4];

		while (true) {

			System.out.println(
					"Lütfen hesaplamak istediğiniz şeklin (en fazla 4 kenar) kenar uzunluklarını giriniz ( -1 ile çıkış): ");
			Scanner scan = new Scanner(System.in);

			System.out.println("Lütfen 1. kenar uzunluğunu giriniz (0 ile sonlandır): ");
			lengthShape[0] = scan.nextInt();
			if (lengthShape[0] < 0 && lengthShape[0] != -1) {
				System.out.println("Negatif uzunluk girmeyiniz!");
				continue;
			}
			if (lengthShape[0] == -1) {
				break;
			}
			if (lengthShape[0] == 0) {
				System.out.println("İlk kenarı girmediniz. ");
				continue;
			}
			System.out.println("Lütfen 2. kenar uzunluğunu giriniz (0 ile sonlandır): ");
			lengthShape[1] = scan.nextInt();
			if (lengthShape[1] < 0 && lengthShape[1] != -1) {
				System.out.println("Negatif uzunluk girmeyiniz!");
				continue;
			}
			if (lengthShape[1] == -1) {
				break;
			}
			if (lengthShape[1] == 0) {
				System.out.println("İkinci kenarı girmediniz. ");
				continue;
			}

			System.out.println("Lütfen 3. kenar uzunluğunu giriniz (0 ile sonlandır): ");
			lengthShape[2] = scan.nextInt();

			if (lengthShape[2] < 0 && lengthShape[2] != -1) {
				System.out.println("Negatif uzunluk girmeyiniz!");
				continue;
			}

			if (lengthShape[2] == -1) {
				break;
			}

			if (lengthShape[2] == 0) {
				System.out.println("İkinci kenarı girmediniz. ");
				continue;
			}

			System.out.println("Lütfen 4. kenar uzunluğunu giriniz (0 ile sonlandır): ");
			lengthShape[3] = scan.nextInt();

			if (lengthShape[3] < 0 && lengthShape[3] != -1) {
				System.out.println("Negatif uzunluk girmeyiniz!");
				continue;
			}
			if (lengthShape[3] == -1) {
				break;
			}
			if (lengthShape[3] == 0) {
				perimeter = lengthShape[0] + lengthShape[1] + lengthShape[2];
				area = lengthShape[0] * lengthShape[1] / 2;

				System.out.println(+i + ". şeklin çevresi: " + perimeter);
				System.out.println(+i + ". şeklin alanı: " + area);

				i++;

			} else if (lengthShape[3] != 0) {
				perimeter = lengthShape[0] + lengthShape[1] + lengthShape[2] + lengthShape[3];
				area = lengthShape[0] * lengthShape[1];

				System.out.println(+i + ". şeklin çevresi: " + perimeter);
				System.out.println(+i + ". şeklin alanı: " + area);
				i++;
			}
		}
	}
}
