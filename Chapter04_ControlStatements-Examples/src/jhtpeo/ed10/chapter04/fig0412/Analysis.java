package jhtpeo.ed10.chapter04.fig0412;

import java.util.Scanner;


public class Analysis
{

  public static void main(String[] args) {
    var input = new Scanner(System.in);
    var passes = 0;
    var failures = 0;
    var studentCounter = 1;

    while (studentCounter <= 10) {
      System.out.printf("Enter result #%d  [ 1 = PASS / 2 = FAIL ]: ", studentCounter);
      var result = input.nextInt();
      if (result == 1) {
        passes = passes + 1;
      } else {
        failures = failures + 1;
      }
      studentCounter = studentCounter + 1;
    }

    System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

    if (passes > 8) {
      System.out.println("Bonus to instructor!");
    }
  }

}
