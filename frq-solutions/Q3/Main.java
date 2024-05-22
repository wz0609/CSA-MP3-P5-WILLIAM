import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    ArrayList<String> list = new ArrayList<String>();
    list.add("catch");
    list.add("bobcat");
    list.add("catchacat");
    list.add("cat");
    WordChecker w1 = new WordChecker(list);
    System.out.println(w1.isWordChain());
    System.out.println(w1.creatList("cat"));
  }
