public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int balance;
        balance = 150;
        int money;
        money = 3500;
        int bonus;
        bonus = 100;
        int summa;
        summa = balance + money;
        int summaBonus;
        summaBonus = money / bonus;
        int itog;
        itog = summa + summaBonus;

        if (money > 100) {
            System.out.println("Итоговый счёт = " + itog);
            System.out.println("Количество бонусных рублей = " + summaBonus);
        } else {
            System.out.println("Итоговый счёт = " + summa);
            System.out.println("Количество бонусных рублей = 0");
        }


        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}