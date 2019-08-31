import java.util.Scanner;

class test{
  public static void main(String[] args) {
    Scanner test = new Scanner(System.in);
    String s = test.nextLine();
    String[] words = s.split("\\W+");
    System.out.println(words[0]);

  }
}
