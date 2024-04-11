package victormoraes.dev.pattern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonExampleTest {

    @Test
    public void testGetInstance() {
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = SingletonExample.getInstance();

        // Check that the same instance is returned
        assertSame(instance1, instance2);
    }

    @Test
    public void testSayHello() {
        SingletonExample instance = SingletonExample.getInstance();
        assertEquals("Hello from Singleton!", instance.sayHello());
    }
}