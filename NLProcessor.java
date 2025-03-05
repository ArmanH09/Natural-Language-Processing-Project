import java.util.*;

public class NLProcessor {

  // Data representing elements and keywords for the processor to look out for
  private ArrayList<element> data;
  private ArrayList<String> keywords;

  // Parameterized constructor for the NLProcessor class
  public NLProcessor(ArrayList<element> data) {
    this.data = data;
    keywords = FileReader.toStringList("keywords.txt");
  }

  /**
   * Return the keyword in a sentence for the class to use
   *
   * Precondition: keywords arraylist must be defined in constuctor
   * Postcondition: Method must return a string value
   *
   * @param String input sentence that will be broken up and compared to the keywords to see if the sentence has keywords
   * @return String value representing the found keyword in the sentence.
   */
  public String getKeyword(String input) {
    String[] words = input.split(" ");
    for (int i = 0; i < words.length; i++) {
      for (int j = 0; j < keywords.size(); j++) {
        if (words[i].equals(keywords.get(j))) {
          return words[i];
        }
      }
    }
    return null;
  }

  /**
   * Return the index and mass of the heaviest element as double values
   *
   * Precondition: Element data must be defined in constructor
   * Postcondition: Method must return an ArrayList<Double>
   *
   * @param None
   * @return ArrayList<Double> with 1st element being the index and 2nd element being the mass
   */
  public ArrayList<Double> getHighest() {
    ArrayList<Double> names = new ArrayList<Double>();
    double max = Double.MAX_VALUE * -1.0;
    double maxn = 0.0;

    for (int i = 0; i < data.size(); i++) {
      if (data.get(i).getWeight() > max) {
        max = data.get(i).getWeight();
        maxn = (double) i;
      }
    }
    names.add(maxn);
    names.add(max);
    return names;
  }

  /**
   * Return the index and mass of the lightest element as double values
   *
   * Precondition: Element data must be defined in constructor
   * Postcondition: Method must return an ArrayList<Double>
   *
   * @param None
   * @return ArrayList<Double> with 1st element being the index and 2nd element being the mass
   */
  public ArrayList<Double> getLowest() {
    ArrayList<Double> names = new ArrayList<Double>();
    double max = Double.MAX_VALUE;
    double maxn = 0.0;

    for (int i = 0; i < data.size(); i++) {
      if (data.get(i).getWeight() < max) {
        max = data.get(i).getWeight();
        maxn = (double) i;
      }
    }
    names.add(maxn);
    names.add(max);
    return names;
  }

  /**
   * Return the average mass of all elements defined
   *
   * Precondition: Element data must be defined in constructor
   * Postcondition: Method must return a double value
   *
   * @param None
   * @return double value representing average mass of all elements
   */
  public double getAverage() {
    double avg = 0.0;
    double count = 0.0;

    for (int i = 0; i < data.size(); i++) {
      avg += data.get(i).getWeight();
      count += 1.0;
    }

    avg /= count;
    return avg;
  }

  /**
   * Convert a Double wrapper class to primitive int type
   *
   * Precondition: Double vlaue must be a wrapper class
   * Postcondition: Method must return a primitive type int
   *
   * @param Double object representing the double value
   * @return int value representing the casted double value
   */
  public int DoubleToInt(Double num) {
    double num1 = num;
    int retnum = (int) num1;
    return retnum;
  }

  /**
   * Print out a response based on the inputed sentence
   *
   * Precondition: All methods in the class must be working properly
   * Postcondition: Method must only 1 sentence
   *
   * @param String input that is representing the sentence inputed by the user, code will then identify keyword and print response based on keyword
   * @return None
   */
  public void process(String input) {
    String word = getKeyword(input);
    double mass = 0.0;
    int index = 0;
    if (word.equals("average")) {
      mass = getAverage();
      System.out.println("The average mass of all elements is " + mass + " atomic mass units.");
    } else if (word.equals("highest")) {
      ArrayList<Double> high = getHighest();
      mass = high.get(1);
      index = DoubleToInt(high.get(0));
      System.out.println("The element with the highest mass is " + data.get(index).getName() + " at " + mass + " atomic mass units.");
    } else if (word.equals("lowest")) {
      ArrayList<Double> low = getLowest();
      mass = low.get(1);
      index = DoubleToInt(low.get(0));
      System.out.println("The element with the lowest mass is " + data.get(index).getName() + " at " + mass + " atomic mass units.");
    }
  }
}
