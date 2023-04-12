import java.util.Scanner;

public class DepositCalculator {
double calculate_Complex_Percent(double firstAmount, double secondAmount,int thirdAmount ) {
    double pay = firstAmount * Math.pow((1 + secondAmount / 12), 12 * thirdAmount);
    return round(pay, 2);
}
double calculate_Simple_Percent(double doubleAmount, double double_Year_Rate, int deposit_Period) {
    return round(doubleAmount + doubleAmount * double_Year_Rate * deposit_Period, 2);
}
double round(double value, int places) {
    double scale = Math.pow(10, places);
    return Math.round(value * scale) / scale;
}

void calculation_Deposit( ) {
    int period;
    int action;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите сумму вклада в рублях:");
    int amount = scanner.nextInt();
    System.out.println("Введите срок вклада в годах:");
    period = scanner.nextInt();
    System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
    action = scanner.nextInt();
    double deposits = 0;
    if (action == 1) {
        deposits = calculate_Simple_Percent(amount, 0.06, period);
    } else if (action == 2) {
        deposits = calculate_Complex_Percent(amount, 0.06, period);
    }
    System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + deposits);
    }
public static void main(String[] args) {
    new DepositCalculator().calculation_Deposit();
}

}
