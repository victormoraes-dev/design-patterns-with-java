package victormoraes.dev.pattern.singleton;

public class SingletonExample {

    // Private constructor to prevent instantiation from outside
    private SingletonExample() {}

    private static final class InstanceHolder {
        private static final SingletonExample instance = new SingletonExample();
    }

    public static SingletonExample getInstance() {
        return InstanceHolder.instance;
    }

    public String sayHello() {
        return "Hello from Singleton!";
    }
}
