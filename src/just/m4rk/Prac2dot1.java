package just.m4rk;

class Store {
    private int products = 10;

    // Синхронізований метод покупки
    public synchronized boolean buyProduct(String customerName) {
        if (products > 0) {
            System.out.println(customerName + " купив товар. Залишилось: " + (products - 1));
            products--;
            return true;
        } else {
            System.out.println(customerName + ": Товар закінчився.");
            return false;
        }
    }
}

class Customer extends Thread {
    private Store store;
    private String customerName;

    public Customer(Store store, String customerName) {
        this.store = store;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        store.buyProduct(customerName);
    }
}

public class Prac2dot1 {
    public static void main(String[] args) {
        Store store = new Store();

        // Створимо 15 покупців
        for (int i = 1; i <= 15; i++) {
            Customer customer = new Customer(store, "Покупець " + i);
            customer.start();
        }
    }
}
