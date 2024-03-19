import java.util.Scanner;

abstract class calc {
  abstract public double add(double a, double b);

  abstract public double subtract(double a, double b);

  abstract public double multiply(double a, double b);

  abstract public double divide(double a, double b);

  abstract public String add(String a, String b);

  abstract public String sub(String a, String b);
}

class Solution extends calc {
  public double add(double a, double b) {
    return a + b;
  }

  public double subtract(double a, double b) {
    return a - b;
  }

  public double multiply(double a, double b) {
    return a * b;
  }

  public double divide(double a, double b) {
    if (b == 0) {
      throw new IllegalArgumentException("Division by zero is not allowed");
    }
    return a / b;
  }

  public String add(String a, String b) {
    return a + b;
  }

  public String sub(String a, String b) {
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < a.length(); i++) {
      char c = a.charAt(i);
      if (b.indexOf(c) == -1)
        res.append(c);
    }
    return res.toString();
  }
}

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution solution = new Solution();

    System.out.println("Enter two integer numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(solution.add(a, b));
    System.out.println(solution.subtract(a, b));
    System.out.println(solution.multiply(a, b));
    System.out.println(solution.divide(a, b));

    System.out.println("Enter two floating point numbers: ");
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    System.out.println(solution.add(c, d));
    System.out.println(solution.subtract(c, d));
    System.out.println(solution.multiply(c, d));
    System.out.println(solution.divide(c, d));
    System.out.println("Enter two strings: ");
    String str1 = sc.next();
    String str2 = sc.next();
    System.out.println(solution.add(str1, str2));
    System.out.println(solution.sub(str1, str2));

    sc.close();
  }
}
