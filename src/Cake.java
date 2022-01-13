import java.util.Scanner;
public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthOfCake = Integer.parseInt(scanner.nextLine());
        int lengthOfCake = Integer.parseInt(scanner.nextLine());

        int areaCake = widthOfCake * lengthOfCake;
        while (areaCake > 0){
            String input = scanner.nextLine();
            if ("STOP".equals(input)){
                break;
            }
            int pieces = Integer.parseInt(input);
            areaCake -= pieces;
        }
        if (areaCake > 0){
            System.out.printf("%d pieces are left.",areaCake);
        }
        else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(areaCake));
        }
    }
}