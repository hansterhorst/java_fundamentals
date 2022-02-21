package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below

       int addValue = 5 + 5;
       int subValue = 9 - 3;
       int mulValue = addValue * subValue;
       double divValue = addValue / (double) mulValue;
       int modValue = addValue % subValue;

       System.out.println(addValue);
       System.out.println(subValue);
       System.out.println(mulValue);
       System.out.println(divValue);
       System.out.println(modValue);
    }

}
