class Solution1 {
  public static void main(String[] args) {
    String bankName = "Bank of America";
    String accnName = "Bob";
    int accnID = 204031;
    double balance = 562.50;

    System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");
    balance += 240.40;
    accnName += " Smith";
    accnID++;
    System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");
  }
}