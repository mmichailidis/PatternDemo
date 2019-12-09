package gr.mmichailidis.singleton;

public class SingletonDemo {
    private static SingletonDemo instance;

    protected SingletonDemo() {
        count = 0;
    }

    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    private int count;

    public int printAndCount() {
        System.out.println("Demo message of Singleton, count : " + count);
        count++;
        return count;
    }
}
