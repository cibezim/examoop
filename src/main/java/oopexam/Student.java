package oopexam;

public class Student extends Customer implements Discountable {
    @Override
    public double calculateDiscount(Clothing clothing) {
        double studentDiscount = 0.05;
        return clothing.getPrice() * studentDiscount;
    }
}
