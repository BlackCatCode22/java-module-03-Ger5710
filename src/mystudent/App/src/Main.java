//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {

        // Creating the first student
        Student myStudent = new Student();
        myStudent.firstName = "Jim";
        myStudent.lastName = "Halpert";
        myStudent.major = "Business";
        myStudent.gpa = 2.3;
        myStudent.age = 24;
        myStudent.onProbation = false;

        // Creating the second student
        Student myStudent2 = new Student();
        myStudent2.firstName = "Pam";
        myStudent2.lastName = "Beasley";
        myStudent2.major = "Art";
        myStudent2.gpa = 2.5;
        myStudent2.age = 23;
        myStudent2.onProbation = true;

        // Output the first name of the second student
        System.out.println(myStudent2.firstName); // Should output "Pam"
    }
}