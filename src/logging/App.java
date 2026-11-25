package logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    // conventionally use logger as a static attribute
    private static final Logger LOGGER = LoggerFactory.getLogger("x");

    public static void main(String[] args) {

        // the LOGGER have some methods that can be used to apply logging
        LOGGER.trace("This show stackTrace");
        LOGGER.debug("this is debug");
        LOGGER.info("this is an information");
        LOGGER.warn("this is a warning");
        LOGGER.error("this is an error");

        // using templates strings with loggers
        LOGGER.info("{} + {} = {}", 10, 10, 10+20);

        // we can throw exception to logger
        try {
            double zero = 1000 / 0;
        } catch(Exception e) {
            LOGGER.error("ERROR: {}", e.getMessage(), e);
        }

        // to avoid bad optimization caused because we are using a level logging disabled, we can test before
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("show only if info is enabled");
        }


    }

}
