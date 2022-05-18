import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject[] subjects = {
                new Subject("Discrete math", 6 ),
                new Subject("Computer networks",6),
                new Subject("Programming language", 5),
                new Subject("English", 4),
                new Subject("Numerical Methods", 4),
                new Subject("Database", 5)
        };
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Student's name-->");
        String name=input.next();
        System.out.print("Enter Student's surname-->");
        String surname=input.next();

        Student student1 = new Student(name,surname);
        //Iterate for each subject, get points and calculate results
        for(int i=0;i<subjects.length;i++) {
            System.out.print(subjects[i].getSubject() + "\n");
            //Result calculated
            ExamResult result = Student.Calculate_Point(subjects[i]);
            System.out.println(result.getScore());
            //Assigning to student, after getting results.
            student1.addResult(result);

            int point = result.getScore();
            System.out.print(subjects[i].getSubject() + "-" + point + "-->");
            if (point > 90 && point < 100) {
                System.out.print("A\n");
            } else if (point > 80 && point < 90) {
                System.out.print("B\n");
            } else if (point > 70 && point < 80) {
                System.out.print("C\n");
            } else if (point > 60 && point < 70) {
                System.out.print("D\n");
            } else if (point > 50 && point < 60) {
                System.out.print("E\n");
            } else {
                System.out.print("F\n");
            }
            System.out.print("\n");
        }
        double GPA = student1.getGPA();
        String Status= student1.getStatus();
        System.out.println(name+" "+surname);
        System.out.println("GPA-->"+GPA);
        System.out.print("Status-->"+Status);
    }
}