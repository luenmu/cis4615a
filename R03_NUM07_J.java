/******************************************************************************
3. Rule 03. Numeric Types and Operations (NUM)
NUM07-J. Do not attempt comparisons with NaN
Given the non-compliant code below:
 ******************************************************************************/

public class NaNComparison {
  public static void main(String[] args) {
    double x = 0.0;
    double result = Math.cos(1/x); // Returns NaN if input is infinity
    if (result == Double.NaN) { // Comparison is always false!
      System.out.println("result is NaN");
    }
  }
}
