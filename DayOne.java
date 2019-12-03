
public class DayOne {
  
 public static void main(String[] args) {
   double total=0;
   
   //take its mass, divide by three, round down, and subtract 2.
  try {   //mechanism to read file
  File myObj = new File("file.txt");
  Scanner scan = new Scanner(myObj);
    while (scan.hasNext()) {
      String data = scan.nextLine();
      total += (Math.floor(data/3) -2);
    }  //close the while loop
    scan.close();   //close scanner, then //build the attendees
    System.out.print("\n " + total); //close of inner for, add libe break
    } //end try
  catch (FileNotFoundException e){
    System.out.println("error");
    e.printStackTrace();
  }
  /*
   //for each item in file
   //  mass = current line
   //read in a value from a file, assuming a mass, 
   //then add to a total the floor(mass/3) -2
     total += (Math.floor(mass/3) -2);
   //end for
   
  //print or return total
    //System.out.println(total);
  */
   
   
}
