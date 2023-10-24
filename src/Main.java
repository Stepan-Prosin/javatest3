public class Main {
    public static void main(String[] args) {

        int account = 100;
        int replenishment = 1521;
        int bonusCost = 100;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / bonusCost;
        }
        int resultAccount = account + replenishment + bonus;

        System.out.println("Итоговый счёт: " + resultAccount);
        System.out.println("Бонусные рубли: " + bonus);
    }
}
