package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonTest {

    @Test
    void givenSingletonWhenGet2InstancesThenIsTheSameInstance() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.doSomething();
        assertEquals(singleton, singleton2);
    }

}