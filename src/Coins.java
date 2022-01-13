import java.util.Scanner;
public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyChange = Double.parseDouble(scanner.nextLine());
        moneyChange = Math.floor(moneyChange * 100);
        int countChange = 0;
        while (moneyChange > 0){

            if (moneyChange >= 200){
                moneyChange -= 200;
            }
            else if (moneyChange >= 100){
                moneyChange -= 100;
            }
            else if (moneyChange >= 50){
                moneyChange -= 50;
            }
            else if (moneyChange >= 20){
                moneyChange -= 20;
            }
            else if (moneyChange >= 10){
                moneyChange -= 10;
            }
            else if (moneyChange >= 5){
                moneyChange -= 5;
            }
            else if (moneyChange >= 2){
                moneyChange -= 2;
            }
            else if (moneyChange >= 1){
                moneyChange -= 1;
            }
            countChange++;
        }
        System.out.println(countChange);
    }
}