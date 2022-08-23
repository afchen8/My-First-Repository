// Athena Chen
// 8.23.22
// Chapter 1 Notes
// Description: Notes from class.
// Who helped me: ?

// need to import the Scanner and Random class - java library located in utils, the class is Scanner/Random:
import java.util.Scanner;
import java.util.Random;

public class Ch1Notes
{
    // this is code notes for Chapter 1.
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        // creates keyboard variable in the scanner class with input coming from system in (default keyboard)
        
        // BASIC DATA TYPES:
        int x = 9,y, z;
        boolean choice = false;
        char letter = 'A'; // single character
        double numberr = 1.0; // double is similar to floats. double takes up 8 bytes, float takes up 4, so they use double more often.
        float number2 = 9;
        short num = 6; // less memory
        long numberrrrrrrrrrrrrrr = 1000; // more memory
        
        // these are objects
        // class id      memory     constructor
        String word    = new        String("Athena Chen"); // collection of chars
        Integer number = new        Integer (47);
        Double anumber = new        Double(8.11);
        
        System.out.print (word);
    }
}
