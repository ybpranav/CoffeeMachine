import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner keyboard = new Scanner(System.in);

        // TODO 25: Create the object of CoffeeMaker Class
        CoffeeMaker cafeCoffeeMaker=new CoffeeMaker();
        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            // Read user's choice
            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    // Initialize the name of Espresso
                    String espressoName = "Espresso";

                    // Initialize the price of Espresso per serving
                    double espressoPrice = 2.50;

                    // Ask the user for the type of roast and store it in espressoRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String espressoRoast = keyboard.next();

                    // Ask the user for the number of shots and store it in numberOfShots
                    System.out.print("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();


                    // Pass the espressoName, espressoRoast, espressoPrice, and numberOfShots as arguments in the correct order
                    Espresso myFavEspresso=new Espresso(espressoName,espressoRoast,espressoPrice,numberOfShots);

                    // myFavEspresso.grindBeans();

                    //  myFavEspresso.brewCoffee();

                    // myFavEspresso.printInfo();
                    //  Call the prepareCoffee() method and pass the Espresso object as argument
                    cafeCoffeeMaker.prepareCoffee(myFavEspresso);
                    //  Call the printInfo() method on the Espresso object
                    myFavEspresso.printInfo();
                    break;
                case 2:

                    // Initialize the name of Latte
                    String latteName = "Latte";

                    // Initialize the price of Latte
                    double lattePrice = 3.50;

                    // Ask the user for the type of roast and store it in latteRoast
                    System.out.print("What Roast would you like? (light, medium, dark): ");
                    String latteRoast = keyboard.next();

                    // Ask the user for the milk type and store it in milkType
                    System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                    String milkType = keyboard.next();

                    // Ask the user if they want syrup or not
                    System.out.print("Would you like syrup? (yes/ no): ");
                    String syrupWanted = keyboard.next();

                    String syrupFlavor = "no";
                    // if syrupWanted is yes, Ask the user for the syrup flavor and store it in syrupFlavor
                    if(syrupWanted.equals("yes")){
                        System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                        syrupFlavor = keyboard.next();
                    }


                    // Pass the latteName, latteRoast, lattePrice, milkType, and syrupFlavor as arguments in the correct order
                    Latte myFavLatte=new Latte(latteName,latteRoast,lattePrice,milkType,syrupFlavor);
                    // Call the grindBeans() method on the Latte object
                    //  myFavLatte.grindBeans();
                    //  Call the brewCoffee() method on the Latte object
                    //   myFavLatte.brewCoffee();
                    //  Call the printInfo() method on the Latte object
                    //myFavLatte.printInfo();
                    // Call the prepareCoffee() method and pass the Latte object as argument
                    cafeCoffeeMaker.prepareCoffee(myFavLatte);
                    // Call the printInfo() method on the Latte object
                    myFavLatte.printInfo();
                    break;
                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
