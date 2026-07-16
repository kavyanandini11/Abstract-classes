public class Person {

    public static void main(String[] args) {

        try {

            // Check if two arguments are passed
            if (args.length != 2) {
                System.out.println("Usage: java Person <Name> <Age>");
                return;
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            // Check age range
            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be greater than or equal to 18 and less than 60.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age  : " + age);
            System.out.println("Person details accepted successfully.");

        }

        catch (NumberFormatException e) {
            System.out.println("Age must be an integer.");
        }

        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println("Invalid input.");
        }
    }
}