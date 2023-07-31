public class Main {
    public static void main(String[] args) {
        programmer programmerLunch = new programmer();


    }
    static void printProgrammer( programmer programmer){
        programmer.name = "Alice";
        programmer.age = 28;
        programmer.wearsGlasses = true;

        programmer.drinkCoffee();
        programmer.printDetails();

        programmer.name = "Bob";
        programmer.age = 32;
        programmer.wearsGlasses = false;

        programmer.printDetails();
        programmer.hasGlasses();
    }
}
