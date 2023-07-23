public class Main {
    public static void main(String[] args) {

class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    void drinkCoffee() {
        System.out.println("Espresso è il segreto!");
    }

    void printDetails() {
        System.out.println(name + " è un programmatore di " + age + " anni");
    }

    // Metodo per stampare se il programmatore indossa gli occhiali nella console
    void hasGlasses() {
        System.out.println("Indossa " + name + " gli occhiali? " + wearsGlasses);


        Programmer programmer1 = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer1.name = "Alice";
        programmer1.age = 28;
        programmer1.wearsGlasses = true;

        programmer1.drinkCoffee();
        programmer1.printDetails();

        programmer2.name = "Bob";
        programmer2.age = 32;
        programmer2.wearsGlasses = false;

        programmer2.printDetails();
        programmer2.hasGlasses();
    }
}}}
