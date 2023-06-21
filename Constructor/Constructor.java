public class Constructor{
  private String name;
  public Constructor(String name) {
    if (name == null || name.isEmpty()) {
      this.name = "Unknown";
    } else {
      this.name = name;
    }
  }
  public void printName() {
    System.out.println("The name of the student is " + this.name);
  }
}

Constructor c1 = new Constructor("ARSHVIR");
Constructor c2 = new Constructor("YASH");
c1.printName();
c2.printName();