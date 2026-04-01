public class _02_AnyBaseToDecimal {
  public static void main(String[] args) {

  }

  static void anyBaseToDecimal(int binaryNum, int base) {
    int resNum = 0;
    int power = 0;
    while (binaryNum > 0) {
      int rem = binaryNum % 10;
      binaryNum /= 10;
      resNum += rem * Math.pow(base, power);
      power++;
    }
    System.out.println("Result is " + resNum);
  }
}
