package exercises.exercise_87;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger02 {

    Logger LOGGER = LoggerFactory.getLogger(Logger02.class);

    public void doSomething() {

        LOGGER.info("doing something in logger02");
    }

}
