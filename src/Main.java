public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance;
        balance = 150;
        int money;
        money = 60;
        int bonus;
        bonus = 100;
        int amount;
        amount = balance + money;
        int amountBonus;
        amountBonus = money / bonus;


        if (money > 100) {
            System.out.println("Итоговый счёт = " + (amount + amountBonus));
            System.out.println("Количество бонусных рублей = " + amountBonus);
        } else {
            System.out.println("Итоговый счёт = " + amount);
            System.out.println("Количество бонусных рублей = 0");
        }


        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}