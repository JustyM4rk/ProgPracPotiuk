package just.m4rk;

class Kitchen {
    public synchronized void performStep(int step) {
        switch (step) {
            case 0 -> System.out.println("дістаємо яйця з холодильника");
            case 1 -> System.out.println("включаємо плиту");
            case 2 -> System.out.println("дістаємо сковороду і ставимо на плиту");
            case 3 -> System.out.println("виливаємо на сковороду олію");
            case 4 -> System.out.println("розбиваємо яйця і виливаємо їх на сковороду");
            case 5 -> System.out.println("викидаємо шкаралупу у відро для сміття");
            case 6 -> System.out.println("знімаємо готову яєчню з вогню");
            case 7 -> System.out.println("викладаємо яєчню в тарілку");
            case 8 -> System.out.println("вимикаємо плиту");
            case 9 -> System.out.println("миємо посуд");
        }

        try {
            Thread.sleep(100); // Затримка для наочності
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Prac3 extends Thread {
    private final int step;
    private final Kitchen kitchen;

    public Prac3(int step, Kitchen kitchen) {
        this.step = step;
        this.kitchen = kitchen;
    }

    @Override
    public void run() {
        kitchen.performStep(step);
    }
}

public class Prac3Test {
    public static void main(String[] args) {
        Kitchen sharedKitchen = new Kitchen();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Prac3(i, sharedKitchen);
            threads[i].start();

            // Послідовність дій збережена завдяки join()
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
