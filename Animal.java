public abstract class Animal 
{
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species)
    {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public void displayInfo()
    {
        System.out.println("Animal Name: "+name);
        System.out.println("Animal Age: "+age);
        System.out.println("Animal Species: "+species);
    }

    public abstract void makeSound();

}

