package just.m4rk;

class Prac1 extends Thread {
    private final int step;

    public Prac1(int step) {
        this.step = step;
    }

    @Override
    public void run() {
        switch (step) {
            case 0:
                System.out.println("дістаємо яйця з холодильника"); break;
            case 1:
                System.out.println("включаємо плиту"); break;
            case 2:
                System.out.println("дістаємо сковороду і ставимо на плиту"); break;
            case 3:
                System.out.println("виливаємо на сковороду олію"); break;
            case 4:
                System.out.println("розбиваємо яйця і виливаємо їх на сковороду"); break;
            case 5:
                System.out.println("викидаємо шкаралупу у відро для сміття"); break;
            case 6:
                System.out.println("знімаємо готову яєчню з вогню"); break;
            case 7:
                System.out.println("викладаємо яєчню в тарілку"); break;
            case 8:
                System.out.println("вимикаємо плиту"); break;
            case 9:
                System.out.println("миємо посуд"); break;
        }
    }
}

public class Prac1Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Prac1(i);
            t.start();
        }
    }
}
