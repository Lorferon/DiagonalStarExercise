//Write a method named printSquareStar with one parameter of type int named number.
//
//        If number is < 5, the method should print "Invalid Value".
//
//        The method should print diagonals to generate a rectangular pattern composed of stars (*).
//        This should be accomplished by using loops (see examples below).
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        EXAMPLE 1
//
//        printSquareStar(5); should print the following:
//
//        → NOTE: For text in Code Blocks below, use code icon {...}  on Udemy
//
//        *****
//        ** **
//        * * *
//        ** **
//        *****
//
//
//        Explanation:
//
//        *****   5 stars
//        ** **   2 stars space 2 stars
//        * * *   1 star space 1 star space 1 star
//        ** **   2 stars space 2 stars
//        *****   5 stars
//
//
//        EXAMPLE 2
//
//        printSquareStar(8); should print the following:
//
//        ********
//        **    **
//        * *  * *
//        *  **  *
//        *  **  *
//        * *  * *
//        **    **
//        ********
//
//
//        The patterns above consist of a number of rows and columns (where number is the number of rows to print).
//        For each row or column, stars are printed based on four conditions (Read them carefully):
//
//        * In the first or last row
//
//        * In the first or last column
//
//        * When the row number equals the column number
//
//        * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
//
//
//        HINT: Use a nested loop (a loop inside of a loop).
//
//        HINT: To print on the same line, use the print method instead of println, e.g. System.out.print(" ");
//        prints a space and does not "move" to another line.
//
//        HINT: To "move" to another line, you can use an empty println call, e.g. System.out.println(); .
//
//        NOTE: The method printSquareStar should be defined as public static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.



//
public class DiagonalStar {
    public static void printSquareStar(int number) {

        if(number < 5){                             // IF THE VALUE IS LESS THAN 5 PROGRAM MUST END
            System.out.println("Invalid Value");
        }
        else {


            // PRINTING FIRST LINE

            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }

            System.out.print("\n");

            int currentrow = 2;     // Because first line is already printed we will start from line(row) 2
            int currentcolumn;


            while (currentrow < number) {       // PRINTING OUT EVERY ROW EXCEPT FIRST AND LAST WHICH ARE FULL OF *
                currentcolumn = 1;              // FOR EACH ROW COLUMN POSITION WILL BE RESET TO 1 (LIKE 'TYPING MACHINE'

                while (currentcolumn <= (number + 1)) {     // LAST COLUMN IS 'INVISIBLE' AND WILL BE USED AS NEW LINE

                    // THESE ARE ALL THE RULES WHEN IT WILL GIVE ME STAR OR SPACE
                    if ((currentcolumn == 1) || (currentcolumn == number)) {        // FIRST AND LAST COLUMN
                        System.out.print("*");
                    } else if ((currentcolumn == currentrow) || (number - currentrow + 1) == currentcolumn) {
                        System.out.print("*");
                    } else if (currentcolumn == (number + 1)) {     // AT NUMBER + 1 COLUMN NEW LINE WILL BE ADDED SO
                        System.out.print("\n");                     // ... I CAN START FROM COLUMN NO.1
                    } else {
                        System.out.print(" ");          // EVERYWHERE ELSE I WANT EMPTY SPACE
                    }

                    currentcolumn++;
                }

                currentrow++;
            }

            for (int i = 0; i < number; i++) {          // PRINTING OUT LAST LINE WHICH IS FULL
                System.out.print("*");
            }

        }
    }
}