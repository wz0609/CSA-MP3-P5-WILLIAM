public class Main {
  public static void main(String[] args) {
    System.out.println("2024 FRQ Q1");

    Feeder f1 = new Feeder(2400);
    System.out.println(f1.getCurrentFood());
    int day = f1.simulateManyDays(10,5);
    System.out.println(day);
    System.out.println(f1.getCurrentFood());
  }


}
