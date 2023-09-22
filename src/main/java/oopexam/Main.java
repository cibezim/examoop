package oopexam;

public class Main {
    public static void main(String[] args) {

        Clothing jeans = new Clothing("Blue Jeans", 20.0, Size.M);
        Clothing tShirt = new Clothing("White T Shirt", 5.0, Size.S);
        Clothing buttonUp = new Clothing("Button Up Shirt", 30.0, Size.L);


        Clothing[] managerCart = {jeans, tShirt, buttonUp};
        Clothing[] hourlyEmployeeCart = {jeans, tShirt, buttonUp};
        Clothing[] studentCart = {jeans, tShirt, buttonUp};


        Manager manager = new Manager();
        manager.setSize(Size.S);

        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        hourlyEmployee.setSize(Size.L);

        Student student = new Student();
        student.setSize(Size.M);


        double managerTotalPrice = ShopApp.calculateTotalPrice(managerCart, manager);
        System.out.println("Manager's Cart Total Price: $" + managerTotalPrice);


        boolean jeansFitHourlyEmployee = ShopApp.checkFit(jeans, hourlyEmployee);
        System.out.println("Jeans Fit Hourly Employee: " + jeansFitHourlyEmployee);


        double hourlyEmployeeDiscount = ShopApp.calculateDiscount(jeans, hourlyEmployee);
        double hourlyEmployeePriceAfterDiscount = jeans.getPrice() - hourlyEmployeeDiscount;
        System.out.println("Hourly Employee's Price after Discount: $" + hourlyEmployeePriceAfterDiscount);


        double managerDiscount = ShopApp.calculateDiscount(jeans, manager);
        double managerPriceAfterDiscount = jeans.getPrice() - managerDiscount;
        System.out.println("Manager's Price after Discount: $" + managerPriceAfterDiscount);


        double studentDiscount = ShopApp.calculateDiscount(jeans, student);
        System.out.println("Student's Discount on Jeans: $" + studentDiscount);


        manager.printCustomerName();
        hourlyEmployee.printCustomerName();
        student.printCustomerName();


        Clothing[] clothingItems = {jeans, tShirt, buttonUp};


        ShopApp.sortAndPrintClothingItemsByPrice(clothingItems);


        double buttonUpDiscountManager = ShopApp.calculateDiscount(buttonUp, manager);
        double buttonUpDiscountHourlyEmployee = ShopApp.calculateDiscount(buttonUp, hourlyEmployee);
        double buttonUpDiscountStudent = ShopApp.calculateDiscount(buttonUp, student);

        System.out.println("Manager's Discount on Button Up Shirt: $" + buttonUpDiscountManager);
        System.out.println("Hourly Employee's Discount on Button Up Shirt: $" + buttonUpDiscountHourlyEmployee);
        System.out.println("Student's Discount on Button Up Shirt: $" + buttonUpDiscountStudent);
    }
}
