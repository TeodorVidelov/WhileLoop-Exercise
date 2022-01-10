import java.util.Scanner;
public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumSteps = 0;
        int goalSteps = 10000;

        while (!"Going home".equals(input)) {
            int steps = Integer.parseInt(input);
            sumSteps += steps;
            if (sumSteps >= goalSteps) {
                break;
            }
            input = scanner.nextLine();
        }
        if ("Going home".equals(input)){
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                sumSteps += stepsToHome;
            }
        if (sumSteps >= goalSteps){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - goalSteps);
        }
        else {
            System.out.printf("%d more steps to reach goal.",goalSteps - sumSteps);
        }
    }
}