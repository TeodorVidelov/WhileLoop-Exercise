import java.util.Scanner;
public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String input = scanner.nextLine();

        int countCheckedBooks = 0;
        while (!input.equals(searchedBook)){
            String checkedBook = input;

            if ("No More Books".equals(input)){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",countCheckedBooks);
                break;
            }
            countCheckedBooks++;
            input = scanner.nextLine();
        }
        if (input.equals(searchedBook)){
            System.out.printf("You checked %d books and found it.",countCheckedBooks);
        }
    }
}