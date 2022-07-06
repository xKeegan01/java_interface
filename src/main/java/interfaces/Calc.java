package interfaces;

public class Calc {
    public static void main(String[] args) {
        Phone phone1 = new Phone(45, 6);
        Rate phone2 = new Phone(78, 11);
        System.out.println("PHONE MONTHLY RATE");
        phone1.printInfo();
        phone2.printInfo();

        Laptop laptop1 = new Laptop(125, 14);
        Rate laptop2 = new Laptop(354, 56);
        System.out.println("LAPTOP MONTHLY RATE");
        laptop1.printInfo();
        laptop2.printInfo();

    }
}
