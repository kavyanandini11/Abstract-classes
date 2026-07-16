package src.mile1.main;

import src.mile1.bean.Student;
import src.mile1.service.StudentReport;
import src.mile1.service.StudentService;

public class StudentMain {

    static Student data[] = new Student[4];

    // Constructor
    public StudentMain() {

        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }

        data[0] = new Student("Sekar", new int[] {85, 75, 95});
        data[1] = new Student(null, new int[] {11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {

        // Initialize the data
        new StudentMain();

        StudentReport report = new StudentReport();

        // Validate each student and print grade
        for (int i = 0; i < data.length; i++) {

            try {

                String result = report.validate(data[i]);

                if (result.equals("VALID")) {
                    System.out.println("Grade : " + report.findGrades(data[i]));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();

        System.out.println("Number of Null Marks Array = "
                + service.findNumberOfNullMarksArray(data));

        System.out.println("Number of Null Name = "
                + service.findNumberOfNullName(data));

        System.out.println("Number of Null Objects = "
                + service.findNumberOfNullObjects(data));
    }
}