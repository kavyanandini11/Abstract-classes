public class MathOperation {

    public static void main(String args[]) {

        try {

            int sum = 0;

            int arr[] = new int[5];

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }

            double avg = (double) sum / arr.length;

            System.out.println("Sum = " + sum);
            System.out.println("Average = " + avg);

        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        catch (NumberFormatException e) {
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 5 integers.");
        }
    }
}