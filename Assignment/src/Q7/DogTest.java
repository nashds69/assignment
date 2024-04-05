package Q7;


import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	@Test
    public void testSetNameAndGetBreed() {
        Dog dog = new Dog("Alex", "Golden Retriever");
        dog.setName("Milo");
        dog.setBreed("Doberman");
        assertEquals("Milo", dog.getName());
        assertEquals("Doberman", dog.getBreed());
    }
}