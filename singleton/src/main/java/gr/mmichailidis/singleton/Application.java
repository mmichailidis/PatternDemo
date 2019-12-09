package gr.mmichailidis.singleton;

public class Application {
    public static void main(String[] args) {
        SingletonDemo instance = SingletonDemo.getInstance();
        instance.printAndCount();
        instance.printAndCount();

        SingletonDemo instance2 = SingletonDemo.getInstance();
        instance2.printAndCount();
    }
}
