package snackBar;

public class Main 
{
  private static void runSnackBar()
  {
    System.out.println("test running snack bar");

    // Instantiate 2 customers
    Customer customer1 = new Customer("Jane", 45.25);
    Customer customer2 = new Customer("Bob", 33.14);

    // Instantiate 3 Vending Machine
    Vending vending1 = new Vending("Food");
    Vending vending2 = new Vending("Drink");
    Vending vending3 = new Vending("Office");

    // Instantiate 5 snacks
    Snack snack1 = new Snack("Chip", 36, 1.75, vending1);
    Snack snack2 = new Snack("Chocolate Bar", 36, 1.00, vending1);
    Snack snack3 = new Snack("Pretzel", 30, 2.00, vending1);
    Snack snack4 = new Snack("Soda", 24, 2.50, vending2);
    Snack snack5 = new Snack("Water", 20, 2.75, vending2);

    // Processing
    // 1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    customer1.buy(snack4.getTotalCost(3));
    snack4.buySnack(3);
    System.out.println(customer1.getCashOnHand());// 
    System.out.println(snack4.getQuantity());

    // 2. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.

    customer1.buy(snack3.getTotalCost(1));
    snack3.buySnack(1);
    System.out.println(customer1.getCashOnHand());
    System.out.println(snack3.getQuantity());

    // 3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
    customer2.buy(snack4.getTotalCost(2));
    snack4.buySnack(2);
    System.out.println(customer1.getCashOnHand());
    System.out.println(snack4.getQuantity());

    // 4. Customer 1 finds $10. Print Customer 1 Cash on Hand.
    customer1.addCash(10.00);
    System.out.println(customer1.getCashOnHand());

    // 5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
    customer1.buy(snack2.getTotalCost(1));
    snack2.buySnack(1);
    System.out.println(customer1.getCashOnHand());
    System.out.println(snack2.getQuantity());

    // 6. Add 12 more items to snack 3. Print quantity of snack 3.
    snack3.addQuantity(12);
    System.out.println(snack3.getQuantity());

    // 7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
    customer2.buy(snack3.getTotalCost(3));
    snack3.buySnack(3);
    System.out.println(customer2.getCashOnHand());
    System.out.println(snack3.getQuantity());

    // Stretch Goals
    System.out.println(snack1.toString());
    System.out.println(snack2.toString());
    System.out.println(snack3.toString());
    System.out.println(snack4.toString());
    System.out.println(snack5.toString());
  }
  public static void main(String[] args)
  {
    runSnackBar();
  }
}