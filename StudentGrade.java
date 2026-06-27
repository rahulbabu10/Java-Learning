public class StudentGrade {

    public static void main(String[] args) {

        String name = "Rahul";
        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 88;

        int total = mark1 + mark2 + mark3;
        double avg = total / 3.0;

        String grade;

        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
}
