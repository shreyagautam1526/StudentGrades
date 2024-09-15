import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Student Grade Calculator.\n");
        System.out.print("Enter the Five Subjects Marks:");
        int subject1 = input.nextInt();
        int subject2 = input.nextInt();
        int subject3 = input.nextInt();
        int subject4 = input.nextInt();
        int subject5 = input.nextInt();

        int total = subject1 + subject2 + subject3 + subject4 + subject5;

        float percentage = (total/5);
        System.out.println("Total:" + total);
        System.out.println("The Percentage is:" + percentage);
        

        if (percentage >= 90) {
            System.out.println("Great, You have got A.");
            
        }else if (percentage >= 75) {
            System.out.println("Good, You have got B.");
            
        }else if (percentage >= 60) {
            System.out.println("You have got C.Try harder next time.");
            
        }else if (percentage >= 30) {
            System.out.println("You have got D try more hard next time.");
            
        }else {
            System.out.println("Alas! You have got F.You are FAIL..");
        }

       
    }
    
}
