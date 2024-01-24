package com.devamatre.appsuite.tutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Rohtash Lakra
 * @version 1.0.0
 * @since 06/18/2022 7:16 PM
 */
public class PairTest {

    // LOGGER
    private static final Logger LOGGER = LoggerFactory.getLogger(PairTest.class);

    @Test
    public void testPair() {
        LOGGER.debug("+testPair()");
        Pair<String, String> keyValue = new Pair<>("name", "Rohtash");
        assertNotNull(keyValue);
        assertEquals("name", keyValue.getKey());
        assertEquals("Rohtash", keyValue.getValue());
        LOGGER.debug("-testPair()");
    }
}
