class Solution2 {
  public static void main(String[] args) {
    String bankName = "Bank of America";
    String accnName = "Bob";
    int accnID = 204031;
    double balance = Double.parseDouble(args[0]);

    System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");
    balance += 240.40;
    accnName += " Smith";
    accnID++;
    System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");

    if(balance > 1000){
      System.out.println("You're Rich!");
    }
    else if(balance > 500){
      System.out.println("You're Middle Class!");
    }
    else{
      System.out.println("You're Poor!");
    }
  }
}