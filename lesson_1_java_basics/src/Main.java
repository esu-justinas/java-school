public class Main {

    public static void main(String[] args) {
        // Primitive types:
        boolean type1;          // Possible values: true, false
        byte type2;             // Possible values: -128 to 128
        short type3;            // Possible values: -32768 to 32767
        int type4;              // Possible values: -2147483648 to 2147483647
        long type5;             // Possible values: -9223372036854775808 to 9223372036854775807
        float type6;            // Possible values: decimal type, up to 7 decimal digits
        double type7;           // Possible values: decimal type, up to 16 decimal digits
        char type8;             // Possible values: different letter representations, like 'a', 'b', 'c', etc.

        // Reference types:
        String type9;           // Actually is an array of char variables, with some helper methods, for easier manipulation of text.
        // All Objects uses reference type variables, but that will be explained during Object oriented programming (OOP) lesson.

        // Arrays:
        int[] myNumberArray = {111, 222, 333, 444, 555};
        char[] myCharArray = {'a', 'b', 'c', 'd', 'e'};
        String[] myStringArray = {"Hello", "World", "This", "Is", "Me"};

        System.out.println("Here we are printing value of index 2 from each array: ");
        System.out.println("myNumberArray: " + myNumberArray[2]);
        System.out.println("myCharArray: " + myCharArray[2]);
        System.out.println("myStringArray: " + myStringArray[2]);
        System.out.println("-----------------------------------------------------------");

        // Loops - great way to go through every element in an array.
        // Here we are using length of myNumberArray, to limit this loop, so that it runs the same amount of times as there are elements in an array. In this case it will be 5.
        for (int i = 0; i < myNumberArray.length; i++) {
            System.out.println("FIRST LOOP! This is running inside of a loop and i from this iteration is equals to: " + i);
            System.out.println("Value from myNumberArray which is at i place is equals to: " + myNumberArray[i]);
            System.out.println();
        }

        System.out.println("End of a FIRST loop");
        System.out.println("-----------------------------------------------------------");
        System.out.println();

        // We can also break loops to exit them early
        for (int i = 0; i < myNumberArray.length; i++) {
            System.out.println("SECOND LOOP! i from this iteration is equals to: " + i);
            System.out.println("Value from myNumberArray which is at i place is equals to: " + myNumberArray[i]);
            System.out.println();
            if (i == 2) {
                System.out.println("We reached i == 2!!! Time to exit this loop, so we press BREAK!");
                System.out.println();
                break;
            }
        }

        System.out.println("End of SECOND loop");
        System.out.println("-----------------------------------------------------------");

        // Also lets run while loop so we know how it works, very convenient for never ending loops!
        int i = 0;
        while (i < myNumberArray.length) {
            System.out.println("THIRD LOOP! This is while loop, where i now is: " + i);
            System.out.println("Value from myNumberArray which is at i place is equals to: " + myNumberArray[i]);
            System.out.println();

            i++;
        }

        System.out.println("End of THIRD loop");
        System.out.println("-----------------------------------------------------------");

        // Also possible to do something like this:
        i = 0;
        while (true) {
            System.out.println("FOURTH LOOP! This is while loop, where i now is: " + i);
            System.out.println("Value from myNumberArray which is at i place is equals to: " + myNumberArray[i]);
            System.out.println();

            i++;
            if (i == myNumberArray.length) {
                System.out.println("We are BREAKING!!! Even though while loop condition is still 'true', we can break to exit this loop");
                break;
            }
        }

        System.out.println("WE ARE FREE AND OUT OF LOOP!");
        System.out.println("End of FOURTH loop");
        System.out.println("-----------------------------------------------------------");
    }
}