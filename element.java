import java.util.*;

public class element {

  // Key characteristics of each element, stored as 2 instance variables
  private String name;
  private double weight;

  // Parameterized constructor for each element
  public element(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  /**
   * Return the name of an element
   *
   * Precondition: Element object must exist 
   * Postcondition: Method must return a String value
   *
   * @param None
   * @return String value representing the name of the element
   */
  public String getName() {
    return name;
  }

  /**
   * Return the weight of an element (AMUs)
   *
   * Precondition: Element object must exist 
   * Postcondition: Method must return a double value
   *
   * @param None
   * @return double value representing the weight of the element in AMUs
   */
  public double getWeight() {
    return weight;
  }
}