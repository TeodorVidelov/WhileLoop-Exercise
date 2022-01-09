import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());

        int countSpendDays = 0;
        int countDays = 0;

        while (moneyOnHand < neededMoney){
            if (countSpendDays == 5){
                System.out.println("You can't save the money.");
                System.out.printf("%d",countDays);
                break;
            }
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            countDays++;

            if ("spend".equals(command)){
                moneyOnHand -= amount;
                countSpendDays++;
                if (moneyOnHand < 0){
                    moneyOnHand = 0;
                }
            }
            else if ("save".equals(command)){
                moneyOnHand += amount;
                countSpendDays = 0;
            }
        }
        if (moneyOnHand >= neededMoney){
            System.out.printf("You saved the money for %d days.",countDays);
        }
    }
}