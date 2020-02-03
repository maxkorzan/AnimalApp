import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

//        System.out.print("Enter animal name: ");
//        System.out.print("Enter animal type: ");
//        System.out.print("Enter animal description: ");
//        System.out.print("Enter animal price: ");
//        System.out.print("Enter animal in stock (true/false): ");

        a.setName("Sparky");
        a.setType("Dog");
        a.setDescription("A small, but loud, happy puppy");
        a.setPrice(399.95);
        a.setInStock(true);

        System.out.println("Animal name: "+ a.getName());
        System.out.println("Animal type: " + a.getType());
        System.out.println("Animal description: " + a.getDescription());
        System.out.println("Animal price: " + a.getPrice());
        System.out.println("Animal in stock: " + a.getInStock());


    }
}
