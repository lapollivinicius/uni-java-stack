package src.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    // conventionally use logger as a static attribute
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        // the LOGGER have some methods that can be used to apply logging
        LOGGER.error("this is an error");
        LOGGER.debug("this is debug");
        LOGGER.info("this is an information");

    }

}
