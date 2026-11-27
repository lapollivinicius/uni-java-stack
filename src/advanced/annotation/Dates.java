package advanced.annotation;

import java.lang.annotation.*;

// this annotation need have the same meta-annotaions that main annotations has
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface Dates {
    Date[] value();
}
