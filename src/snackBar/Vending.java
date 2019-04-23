package snackBar;

public class Vending
{
  private static int maxId = 0;
  private int id;
  private String name;

  public Vending(String name)
  {
    maxId++;
    id = maxId;
    this.name = name;
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

  @Override
  public String toString()
  {
    return "id: " + this.id + " name: " + this.name;
  }
}