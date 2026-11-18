public class AnimalTest 
{
    public static void main(String[] args) 
    {
        Dog dog = new Dog("Pablo",11);
        System.out.println("-Dog Information-");
        dog.displayInfo();
        dog.makeSound();
        dog.displayType();

        System.out.println();

        Cat cat = new Cat("Garf", 7);
        System.out.println("-Cat Information-");
        cat.displayInfo();
        cat.makeSound();
        cat.displayType();
    }
}
