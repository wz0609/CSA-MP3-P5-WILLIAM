public class Feeder {
  private int currentFood;

  public Feeder(int f) {
    currentFood = f;
  }

  public void simulateOneDay(int numBirds) {
    boolean normal = (int)(Math.random()*100+1) <= 95; 
    System.out.println("Is a normal day: " + normal);
    if(normal) {
      int gramsEaten = (int)(Math.random()*(50-10+1)+10);
      System.out.println("Each birds eats " + gramsEaten);
      int totalEaten = gramsEaten * numBirds;
      System.out.println("Total eaten: " + totalEaten);
      if(totalEaten > currentFood) {
        currentFood = 0;
      } else {
        currentFood -= totalEaten;
      }
    } else {
      currentFood = 0;
    } 
  }

  public int simulateManyDays(int numBirds, int numDays) {
    int day = 0;
    while(currentFood > 0 && day < numDays) {
      day++;
      simulateOneDay(numBirds);
      System.out.println("Food left: " + getCurrentFood());
      System.out.println();
    }
    return day;
  }

  public int getCurrentFood() {
    return currentFood;
  }

}
