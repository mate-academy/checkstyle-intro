package core.basesyntax;
import core.basesyntax.model.Dog;
import core.basesyntax.model.Cat;
import org.junit.Assert;
import org.junit.Test;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorldTest {
    @Test
    public void testCatInitialization() {
        Cat cat = new Cat(3, "Whiskers");
        Assert.assertEquals("Whiskers", cat.getName());
        Assert.assertEquals(3,cat.getAge());
    }

    @Test
    public void testDogInitialization() {
        Dog dog = new Dog("Golden Retriever");
        Assert.assertEquals("Golden Retriever", dog.getBreed());
    }
}

