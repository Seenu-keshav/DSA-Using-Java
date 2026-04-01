public class _01_DecimalToAnyBase {
  public static void main(String[] args) {
    decimalToAnyBase(5, 2);
  }

  static void decimalToAnyBase(int decimalNum, int base) {
    int resNum = 0;
    int power = 0;
    while (decimalNum > 0) {
      int rem = decimalNum % base;
      decimalNum /= base;
      resNum += rem * Math.pow(10, power);
      power++;
    }
    System.out.println("Result is " + resNum);
  }
}