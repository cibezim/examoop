package oopexam;

import java.util.Arrays;

public class Shop {
    public static double calculateTotalPrice(Clothing[] cart, Customer customer) {
        double totalPrice = 0.0;
        for (Clothing item : cart) {
            double itemPrice = item.getPrice();
            double itemDiscount = calculateDiscount(item, customer);
            itemPrice -= itemDiscount;
            totalPrice += itemPrice;
        }
        return totalPrice;
    }

    public static boolean checkFit(Clothing clothing, Customer customer) {
        Size customerSize = customer.getSize();
        Size clothingSize = clothing.getSize();
        return customerSize == clothingSize;
    }

    public static double calculateDiscount(Clothing clothing, Customer customer) {
        double baseDiscount = 0.10;
        double additionalDiscount = 0.0;

        if (customer instanceof Manager) {
            additionalDiscount = 0.05;
        } else if (customer instanceof Student) {
            additionalDiscount = - 0.05;
        }

        return clothing.getPrice() * (baseDiscount + additionalDiscount);
    }

    public static void sortAndPrintClothingItemsByPrice(Clothing[] clothingItems) {
        Arrays.sort(clothingItems, (a, b) -> Double.compare(a.getPrice(), b.getPrice()));
        System.out.println("Clothing Items Sorted by Price:");
        for (Clothing item : clothingItems) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }
}
