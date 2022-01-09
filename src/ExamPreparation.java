import java.util.Scanner;
public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allowedCountBadGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String lastProblemName = "";
        int countBadGrades = 0;
        double sumGrades = 0;
        int countProblems = 0;
        while (!"Enough".equals(input)){
            String problemName = input;
            int grade = Integer.parseInt(scanner.nextLine());

            sumGrades += grade;
            lastProblemName = problemName;
            countProblems++;

            if (grade <= 4){
                countBadGrades++;
            }
            if (countBadGrades == allowedCountBadGrades){
                System.out.printf("You need a break, %d poor grades.",countBadGrades);
                break;
            }
            input = scanner.nextLine();
        }
        if ("Enough".equals(input)){
            System.out.printf("Average score: %.2f\n",sumGrades / countProblems);
            System.out.printf("Number of problems: %d\n",countProblems);
            System.out.printf("Last problem: %s",lastProblemName);
        }
    }
}