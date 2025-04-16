package MedianFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veri akışına sayı eklemek için bir sayı giriniz: ");

        while (true) {
            System.out.print("Sayı girin: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                medianFinder.addNum(num);
                System.out.println("Medyan: " + medianFinder.findMedian());
            } catch (NumberFormatException e) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
            }
        }

        scanner.close();
    }
}
