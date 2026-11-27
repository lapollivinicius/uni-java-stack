package exercises.exercise_89;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface SecurityConfig {
    Group[] allowed() default @Group("");
}
