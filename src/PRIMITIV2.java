public class PRIMITIV2 {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int amount = 100;
        int percent = 100;
        int balance = 1100;
        int bonus;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        if (balance >= 1000) {
            bonus = balance / percent;
        } else {
            bonus = 0;
        }
        int result = amount + balance + bonus;
        System.out.println("Баланс=" + result);



    }
}

