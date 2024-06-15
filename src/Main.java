public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance = 200;
        int money = 5000;
        int bonus = 100;
        int amount = balance + money;
        int amountBonus = money / bonus;

        if (money > 1000) {
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