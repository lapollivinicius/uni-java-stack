package exercises.exercise_87;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger01 {

    Logger LOGGER = LoggerFactory.getLogger(Logger01.class);

    public void doSomething() {
        LOGGER.error("doing something in logger01");
    }

}
