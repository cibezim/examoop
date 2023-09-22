package oopexam;

public class HourlyEmployee extends Customer implements Discountable {

    @Override
    public double calculateDiscount(Clothing clothing) {
        double baseDiscount = 0.10;
        return clothing.getPrice() * baseDiscount;
    }
}