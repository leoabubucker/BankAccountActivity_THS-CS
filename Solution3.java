class Solution3 {
  static String bankName = "Bank of America";
  static String accnName = "Bob";
  static int accnID = 204031;
  static double balance = 0;
  
  static double addBalance(double balanceToAdd){
    balance += balanceToAdd;
    return balance;
  }

  static String addToName(String nameToAdd){
    accnName += (" " + nameToAdd);
    return accnName;
  }
  
  static int incrementID(){
    accnID++;
    return accnID;
  }

  static void checkStatus(){
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

  static void printDetails(){
    System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");
  }
  
  public static void main(String[] args) {
    addBalance(Double.parseDouble(args[0]));
    // String bankName = "Bank of America";
    // String accnName = "Bob";
    // int accnID = 204031;
    // double balance = 562.50;
    
    // System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");
    // balance += 240.40;
    // accnName += " Smith";
    // accnID++;
    // System.out.println(accnName + "'s " + bankName + " account (ID: " + accnID + ") currently has $" + balance + " in it.");

    // if(balance > 1000){
    //   System.out.println("You're Rich!");
    // }
    // else if(balance > 500){
    //   System.out.println("You're Middle Class!");
    // }
    // else{
    //   System.out.println("You're Poor!");
    // }
    printDetails();
    System.out.println("You're new balance is $" + addBalance(240.40));
    System.out.println("You're new account name is " + addToName("Smith"));
    System.out.println("You're new account ID is " + incrementID());
    printDetails();
    checkStatus();
  }
}