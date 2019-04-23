package snackBar;

public class Customer
{
  private static int maxId = 0;
  private int id;
  private String name;
  private double cashOnHand;

  public Customer(
    String name,
    double cashOnHand
  )
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.cashOnHand = cashOnHand;
  }

  public void addCash(double cash)
  {
    this.cashOnHand = this.cashOnHand + cash;
  }

  public double getCashOnHand()
  {
    return this.cashOnHand;
  }

  public void buy(double totalCost)
  {
    if (totalCost > this.cashOnHand) {
      System.out.println("Does not have enough cash on hand");
    } else {
      this.cashOnHand = this.cashOnHand - totalCost;
    }
  }

  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }

  @Override
  public String toString()
  {
    return "id: " + this.id + " name: " + this.name + " cash on hand: $" + this.cashOnHand;
  }
}