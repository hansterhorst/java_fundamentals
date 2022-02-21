package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_06 {

   public static void main(String[] args) {

      // write code here
      double height = 5.0;
      double radius = 3.14;
      double diameter = radius * 2;
      double areaCirkel = 3.14 * (radius * radius);
      double volume = radius * height;
      double surface = (2 * 3.14 * (radius * radius)) + (3.14 * diameter * height);

      System.out.println("The volume of the cylinder is " + volume);
      System.out.println("The surface of the cylinder is " + surface);

   }
}