public class Main {
    public static void main(String[] args) {

        double balance = 100;
        double sumOfRefill = 1100;

        int bonus;

        if (sumOfRefill <= 100) {
            bonus = 0;
        } else {
            bonus = (int) sumOfRefill / 100;
        }

        double totalBalance = balance + sumOfRefill + bonus;
        System.out.println("Итоговый баланс:" + totalBalance);
        System.out.println("в том числе, бонусных рублей начислено:" + bonus);

    }
}
