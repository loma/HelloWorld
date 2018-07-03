import java.io.*;
import java.util.*;

public class HelloWorld {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    while (!name.equals("0")) {
      System.out.println("Hello, " + name);
      name = sc.next();
    }
  }
}
