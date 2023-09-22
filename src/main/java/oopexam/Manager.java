package oopexam;

public class Manager extends Customer implements Discountable {

    @Override
    public double calculateDiscount(Clothing clothing) {
        double baseDiscount = 0.10;
        double managerDiscount = 0.05;
        double totalDiscount = baseDiscount + managerDiscount;
        return clothing.getPrice() * totalDiscount;
    }
}