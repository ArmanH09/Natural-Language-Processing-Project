import java.util.*;

public class NLPRunner {
  public static void main(String[] args) {

  // 1D arrays from text files representing characteristics of the elements
  String[] names = FileReader.toStringArray("names.txt");
  double[] weights = FileReader.toDoubleArray("weight.txt");


  // New arrayList of element objects to convert the 1D arrays into arrayLists
  ArrayList<element> elements = new ArrayList<element>();

  // Use corresponding name and mass on index to create new element object for each index
  for (int i = 0; i < names.length; i++) {
    elements.add(new element(names[i], weights[i]));
  }

  // Instantiate new NLProcessor using the ArrayList
  NLProcessor NLPelement = new NLProcessor(elements);

  // Variable for the while loop to keep the program running
  int close = 0;

  // Program will keep repeating until the variable is set to 1
  while (close != 1) {
    // Create new scanner class and prompt user
    Scanner input = new Scanner(System.in);
    System.out.println("Enter prompt: ");

    // Log user input in string
    String choice1 = input.nextLine();

    // Use user input to run the process method in NLProcessor
    NLPelement.process(choice1);

    // Prompt user to keep continuing and store user value
    System.out.println("Continue? (y/n)");
    String choice2 = input.nextLine();

    // If user doesnt want to continue, scanner object is closed and variable is set to 1 stoping the while loop
    if (choice2.equals("n")) {
      close = 1;
      input.close();
    // If user wants to continue, scanner object is closed and variable is set to 0 letting the while loop continue running
    } else if (choice2.equals("y")) {
      close = 0;
      input.close();
    }
  }



    
    
    
    
  }
}