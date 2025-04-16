package ConsecutiveNumbersSum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Bir sayı girin: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            try {
                int n = Integer.parseInt(input);


                int result = ConsecutiveNumbersSum.findConsecutiveSums(n);
                System.out.println("Toplam çözüm sayısı: " + result);

                System.out.println("Geçerli ardışık sayı dizileri:");
                ConsecutiveNumbersSum.printConsecutiveSums(n);

            } catch (NumberFormatException e) {
                System.out.println("Geçerli bir sayı girin.");
            }
        }

        scanner.close();
    }
}
