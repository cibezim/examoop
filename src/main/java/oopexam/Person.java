package oopexam;

public abstract class Person {
    private String name;
    private String personName;
    private Size size;
    private List<Clothing> clothingItems;

    public Person(String name, String personName, Size size, List<Clothing> clothingItems) {

        this.name = name;
        this.personName = personName;
        this.size = size;
        this.clothingItems = clothingItems;
    }

}
