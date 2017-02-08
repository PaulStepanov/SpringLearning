package edu.example.logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APIUserIDValidatorTest {
    @Test
    public void validateID() throws Exception {
        APIUserIDValidator validator = new APIUserIDValidator();
        assertEquals(validator.validateID("https://vk.com/id82601175"), "82601175");
        assertEquals(validator.validateID("https://vk.com/starik_123"), "starik_123");
        assertEquals(validator.validateID("https://vk.com/dev/users.get"), null);
        assertEquals(validator.validateID("https://vk.com/im?peers=105917887_132831898"), null);
    }

}