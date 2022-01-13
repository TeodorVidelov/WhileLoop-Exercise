import java.util.Scanner;
public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthOfFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightOfFreeSpace = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int areaOfFreeSpace = widthOfFreeSpace * lengthOfFreeSpace * heightOfFreeSpace;

        while (!"Done".equals(input)){
            int countMovedBoxes = Integer.parseInt(input);
            areaOfFreeSpace -= countMovedBoxes;
            if (areaOfFreeSpace < 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (areaOfFreeSpace > 0){
            System.out.printf("%d Cubic meters left.",areaOfFreeSpace);
        }
        else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(areaOfFreeSpace));
        }
    }
}