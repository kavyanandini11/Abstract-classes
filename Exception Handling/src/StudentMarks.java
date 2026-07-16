package src;
import java.util.Scanner;
public class StudentMarks {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name:");
                String name = sc.next();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.next());

                    if (mark < 0)
                        throw new NegativeMarksException("Negative marks are not allowed");

                    if (mark > 100)
                        throw new OutOfRangeException("Marks should be between 0 and 100");

                    sum += mark;
                }

                double avg = sum / 3.0;

                System.out.println(name + " Average = " + avg);
                sc.close();
            }

        }

        catch (NumberFormatException e) {
            System.out.println(e);
        }

        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }
}