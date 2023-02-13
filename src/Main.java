public class Main {
    public static void main(String[] args) {
        double balance = 100;
        double replenishment = 1100.55;
        int bonus;

        if (replenishment > 100){
            bonus = (int) (replenishment / 100);
            balance+= replenishment + bonus;
        } else{
            balance+=replenishment;
        }

        System.out.println("Ваш баланс" + balance);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}