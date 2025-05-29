package just.m4rk;

class Prac2 extends Thread {
    @Override
    public void run() {
        String gn = getName();
        switch (gn) {
            case ("Thread-0"):
                System.out.println("дістаємо яйця з холодильника"); break;
            case ("Thread-1"):
                System.out.println("включаємо плиту"); break;
            case ("Thread-2"):
                System.out.println("дістаємо сковороду і ставимо на плиту"); break;
            case ("Thread-3"):
                System.out.println("виливаємо на сковороду олію"); break;
            case ("Thread-4"):
                System.out.println("розбиваємо яйця і виливаємо їх на сковороду"); break;
            case ("Thread-5"):
                System.out.println("викидаємо шкаралупу у відро для сміття"); break;
            case ("Thread-6"):
                System.out.println("знімаємо готову яєчню з вогню"); break;
            case ("Thread-7"):
                System.out.println("викладаємо яєчню в тарілку"); break;
            case ("Thread-8"):
                System.out.println("вимикаємо плиту"); break;
            case ("Thread-9"):
                System.out.println("миємо посуд"); break;
        }
    }
}

public class main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Prac2 thread = new Prac2();
            thread.start();
        }
    }
}
