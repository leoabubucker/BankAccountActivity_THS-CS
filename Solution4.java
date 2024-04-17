class Solution4 {
  public static void main(String[] args) {
    String[] names = {"Arham Akhyare", "Kevin Xie", "Daksh Sangar", "Raymond Chen", "Justin Park", "Sushanta Subedi", "Joseph Espino", "Ryan Tabet", "Leo Abubucker", "Jack Deise", "Ankit Wagle", "Monika Subedi", "Julie Cao", "Cindy Guo", "Danielle Ozobodo", "Sampada Ranjitkar"};
    
    System.out.println("Tradtional For Loop\n");
    for(int i = 0; i < names.length; i++){
      System.out.println(i + ": " + names[i]);
    }
    System.out.println("\nFor-each Loop\n");
    for(String name : names){
      System.out.println(name);
    }

    System.out.println("\nUsing a while loop to change odd indexed names to all uppercase and even indexed names to all lowercase\n");
    int iter = 0;
    System.out.print("New Names: ");
    while(iter < names.length){
      if(iter % 2 == 0){
        names[iter] = names[iter].toLowerCase();
      }
      else{
        names[iter] = names[iter].toUpperCase();
      }
      if(iter != names.length - 1){
        System.out.print(names[iter] + ", ");
      }
      else{
        System.out.print(names[iter]);
      }
      iter++;
    }
    
    System.out.println("\nUsing a for loop to create a new String that has the first character of each name in it. Then calculate the length of that string\n");
    String firstCharacters = "";
    for(int i = 0; i < names.length; i++){
      firstCharacters += names[i].substring(0, 1);
    }
    System.out.println(firstCharacters + " has a length of: " + firstCharacters.length());

    System.out.println("\nFinally, let's combine the names into one String with a for loop, then split that String into an Array by every 'a' that appears, and print the array with a for-each loop\n");
    String concatNames = "";
    for(int i = 0; i < names.length; i++){
      concatNames += names[i];
    }
    System.out.println(concatNames + "\nbecomes:\n");
    String[] splitNames = concatNames.split("a");
    for(String characters : splitNames){
      System.out.print(characters + ", ");
    }
  }


  
}