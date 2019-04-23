package snackBar;

public class Snack
{
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private Vending vending;

  public Snack(
    String name,
    int quantity,
    double cost,
    Vending vending
  )
  {
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vending = vending;
  }

  public void setId(int id)
  {
    this.id = id;
  }
  public int getId()
  {
    return id;
  }

  public void setName(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return name;
  }

  public void setCost(int cost)
  {
    this.cost = cost;
  }
  public double getCost()
  {
    return cost;
  }

  public void setVending(Vending vending)
  {
    this.vending = vending;
  }
  public int getVendingId()
  {
    return this.vending.getId();
  }

  public int getQuantity()
  {
    return quantity;
  }
  public void addQuantity(int quantity)
  {
    this.quantity = this.quantity + quantity;
  }
  public void buySnack(int quantity)
  {
    this.quantity = this.quantity - quantity;
  }
  public double getTotalCost(int quantity)
  {
    return this.cost * quantity;
  }
  @Override
  public String toString()
  {
    return "Name: " + this.name + ", Vending Name: " + this.vending.getName() + ", Quantity on hand: " + this.quantity + ", Total cost: $" + this.quantity * this.cost;
  }
}