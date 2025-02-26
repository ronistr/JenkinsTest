import java.time.LocalDate;
import java.util.Scanner;

public class AikidoTracker {
    private String studentName;
    private LocalDate startDate;
    private int totalSessions;
    private int practicehours;

    public AikidoTracker(String studentName, LocalDate date, int totalSessions, int practicehours) {
        this.studentName = studentName;
        this.startDate = date;
        this.totalSessions = totalSessions;
        this.practicehours = practicehours;
    }

    public void logPractice(int practiceHours) {
        totalSessions++;
        this.practicehours += practiceHours;
        System.out.println("Session of " + practiceHours + " hours is logged for " + studentName + " with total sessions: " + totalSessions);
    }

    public boolean isEligibleForKyu() {
        return totalSessions >= 100 || LocalDate.now().isAfter(startDate.plusMonths(6));
    }

    public void checkEligibility() {
        if (isEligibleForKyu()) {
            System.out.println(studentName + " is eligible for kyu grading");
        } else {
            System.out.println(studentName + " is not eligible for kyu grading");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getTotalSessions() {
        return totalSessions;
    }

    public int getPracticeHours() {
        return practicehours;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name");
        String studentName = sc.nextLine();
        System.out.println("Enter start date in yyyy-mm-dd format");
        String startDate = sc.nextLine();
        System.out.println("Enter total sessions");
        int totalSessions = sc.nextInt();
        System.out.println("Enter practice hours");
        int practiceHours = sc.nextInt();
        AikidoTracker student1 = new AikidoTracker(studentName, LocalDate.parse(startDate), totalSessions, practiceHours);

        while (true) {
            System.out.println("Enter 1 to log practice, 2 to check eligibility, 3 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter practice hours");
                    int ph = sc.nextInt();
                    student1.logPractice(ph);
                    break;
                case 2:
                    student1.checkEligibility();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
