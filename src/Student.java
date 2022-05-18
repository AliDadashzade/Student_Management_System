import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private String name;
    private String surname;
    private ArrayList<ExamResult> examResults = new ArrayList<ExamResult>();

    //Constructor for only name, because examResult calculated after instantiation
    public Student(String name,String surname){
        this.name = name;
        this.surname=surname;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    //Method to add exam result of each subject after calculating
    public  void addResult(ExamResult result){
        this.examResults.add(result);
    }
    //Calculating and returning gpa
    public double getGPA() {
        double GPA = 0;
        int totalCredits = 0;
        int totalScores = 0;
        //Sureti ve mexreci, cemleri hesablayiriq
        for(int i = 0; i < examResults.size(); i++) {
            int score = examResults.get(i).getScore();
            int credit = examResults.get(i).getSubject().getCredit();
            totalScores += credit * score;
            totalCredits += credit;
        }
        return (totalScores) / (totalCredits);
    }
    public static ExamResult Calculate_Point(Subject subject) {
        Scanner scan=new Scanner(System.in);
        int presentation,quiz,mid,final_exam;

        //Getting scores
        System.out.print("Enter your presentation result-->");
        presentation=scan.nextInt();
        System.out.print("Enter your quiz result-->");
        quiz=scan.nextInt();
        System.out.print("Enter your midterm result-->");
        mid=scan.nextInt();
        System.out.print("Enter your final exam result-->");
        final_exam=scan.nextInt();

        //Total score
        int score=presentation+quiz+mid+final_exam;

        //creating new Exam Result for specific subject with score.
        ExamResult examResult = new ExamResult(subject,score);

        return examResult;
    }

    public String getStatus(){
        String res;
        double GPA= getGPA();
        if(GPA>90 && GPA<100) {
            res="ƏLAÇI";
        }
        else if (GPA>80 && GPA<90){
            res="ZƏRBƏÇİ";
        }
        else if(GPA>50 && GPA<80){
            res="ADİ";
        }
        else{
            res="KƏSİLDİ";
        }
        return res;
    }


}
