import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students in the group: ");
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.printf("Enter the name of the student #%d ", (i + 1));
            String name = input.next();
            students[i] = new Student(name);
        }

        int nr = 1;
        for (Student student : students)
        {
            System.out.println("Student #" + nr + ": " + student.name);
            nr++;
        }

        for  (Student student : students)
        {
            System.out.printf("Is %s present? [Y/N]: ", student.name);
            boolean isPresent = input.next().equals("Y");
            if(isPresent)
            {
                student.presence = true;
            }
        }

        nr = 1;
        for (Student student : students)
        {
            System.out.printf("Student #%d: %-10s| Present: %s\n", nr, student.name, (student.presence) ? "True" : "False");
            nr++;
        }
    }
}