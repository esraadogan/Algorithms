package BestTimeToBuyAndSellStock;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaxProfitCalculator calculator = new MaxProfitCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hisse fiyatlarını boşluk bırakarak giriniz: ");
        String[] input = scanner.nextLine().split(" ");
        int[] prices = new int[input.length];

        try {
            for (int i = 0; i < input.length; i++) {
                prices[i] = Integer.parseInt(input[i]);
            }

            int result = calculator.maxProfit(prices);
            System.out.println("Maksimum kâr: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Geçersiz giriş! Lütfen sadece sayıları girin.");
        }

        scanner.close();
    }
}
