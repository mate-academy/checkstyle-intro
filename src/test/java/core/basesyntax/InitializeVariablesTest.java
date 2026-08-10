package core.basesyntax;
import core.basesyntax.model.Cat;
import core.basesyntax.model.Dog;
import org.junit.Assert;
import org.junit.Test;


public class InitializeVariablesTest {
    @Test
    public void testCatVariables() {
        Cat cat = new Cat(2, "Luna");
        Assert.assertEquals("Luna",cat.getName());
        Assert.assertEquals(2, cat.getAge());
    }
    @Test
    public void testDogVariables() {
        Dog dog = new Dog("Labrador");
        Assert.assertEquals("Labrador", dog.getBreed());
    }
}
