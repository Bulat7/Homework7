//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // 1 task
    public static void main(String[] args) {
        int firstFriday = 5;
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                for (int friday = firstFriday; friday <= 31; friday += 7) {
                    System.out.println("Сегодня пятница, " + friday + " - ое число. Необходимо подготовить отчет!");
                }
                break;
            }
        }
        task2ver1(args);
    }

    public static void task2ver1(String[] args) {
        int distance = 0;
        int total = 42195;
        do {
            System.out.println("Держитесь! Осталось " + (total - distance) + " метров!");
            distance = distance + 500;

        } while (distance <= total);
        task2ver2(args);
    }

    public static void task2ver2(String[] args) {
        int total = 42195;
        for (int i = 0; i <= total; i += 500) {
            System.out.println("Держитесь! Осталось " + (total - i) + " метров!");
        }
        task3ver1(args);
    }

    public static void task3ver1(String[] args) {
        int payment = 1000;
        int dailyPayment = 100;
        int duration = 0;
        while (payment >= dailyPayment) {
            duration++;
            if (duration % 5 == 0) {
                System.out.println("Каждый пятый день парковка бесплатна! Поздравляю!");
                continue;
            }
            if (payment < dailyPayment) {
                break;
            }
            payment = payment - dailyPayment;
            System.out.println("Колличество доступных дней - " + duration);
        }
        task3ver2(args);
    }

    public static void task3ver2(String[] args) {
        int payment = 1500;
        int dailyPayment = 100;
        for (int i = 1; payment >= dailyPayment; i++) {
            if (i % 5 == 0) {
                System.out.println("Каждый пятый день парковка бесплатна! Поздравляю!");
                continue;
            }
            if (payment < dailyPayment) {
                break;
            }
            payment = payment - dailyPayment;
            System.out.println("Колличество доступных дней - " + i);

        }
        task4(args);
    }
    public static void task4(String[] args) {
        int month = 0;
        int total = 0;
        do {
            month++;
            total += 15_000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.println("Это " + month + " месяц по счету, сумма накоплений равна " + total);
            if (total >= 12_000_000) {
                System.out.println("Цель достигнута, поздравляю!");
                break;
            }
        } while (true);
        task5(args);
    }
    public static void task5(String[] args) {
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        int overheatsLvl = 0;
        while (charge < 100) {
            if (overheats >= 3) {
                System.out.println("Зарядка прекращена. Текущий заряд: " + charge + " %");
                System.out.println("Зарядка заняла " + minute + " минуты.");
                break;
            }
            minute++;
            if (minute % 10 == 0 && overheats == 0) {
                minute ++;
                overheats ++;
                continue;
            } else if (overheats > 0 && charge % 20 == 0 && overheatsLvl < 1) {
                minute ++;
                overheats++;
                overheatsLvl++;
                continue;
            } else {charge += 2;
                overheatsLvl = 0;
            }
        }
    }
}
