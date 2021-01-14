// Figure 4.18 : PanelPainter.java
// Programmer-declared method maximum with three double parameters.

package jhtpeo.ed10.chapter06.fig0603;

import java.util.Scanner;


public class MaximumFinder {

  /*
   * Returns the maximum value out of three double-type parameters.
   */
  public static double findMaximum(double x, double y, double z) {
    // Initialize returned value.
    var maximumValue = 0.0;
    // Determine if 'x' is larger than 'y'. Assign 'maximumValue' accordingly.
    if (x > y) {
      maximumValue = x;
    } else if (x < y) {
      maximumValue = y;
    }
    // Determine if 'z' is larger than 'maximumValue'. Assign 'maximumValue' accordingly.
    if (z > maximumValue) {
      maximumValue = z;
    }
    // Return 'maximumValue'.
    return maximumValue;
  } // [END_METHOD : findMaximum]

  /*
   * Returns the maximum value out of three double-type parameters.
   */
  public static double findMaximumVersion2(double x, double y, double z) {
    // Initialize returned value.
    var maximumValue = 0.0;
    // Determine the maximum value out of the there provided by the user.
    maximumValue = Math.max(z, (Math.max(x, y)));
    // Return 'maximumValue'.
    return maximumValue;
  } // [END_METHOD : findMaximumVersion2]

  /*
   * Obtains three floating-point values and identifies the one with the maximum value.
   */
  public static void main(String[] args) {
    // Create "Scanner" that receives input from the terminal.
    var input = new Scanner(System.in);
    // Prompt user for three floating-point values.
    System.out.print("Enter three floating-point values separated by spaces: ");
    // Read three floating-point values from the terminal.
    var number01 = input.nextDouble();
    var number02 = input.nextDouble();
    var number03 = input.nextDouble();
    // Determine maximum value of the three input numbers.
    var result = findMaximum(number01, number02, number03);
    var resultVersion2 = findMaximumVersion2(number01, number02, number03);
    // Display the maximum value.
    System.out.println("Maximum is: " + result + " and " + resultVersion2);
  } // [END_METHOD : main]


} // [END_CLASS : MaximumFinder]
