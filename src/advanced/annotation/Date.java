package advanced.annotation;

import java.lang.annotation.*;

// META-ANNOTAIONS
// we can restrict the use of annotations using @target and defining a elementType
@Target(ElementType.FIELD)
// we can define a behavior to annotaions
// SOURCE=discarted, CLASS=compiled, but not running, RUNTIME=compiled and running
@Retention(RetentionPolicy.RUNTIME)
// when we need to repeat the annotations, we can use the:
// and define an other annotations with Annotations[] with the same value type
@Repeatable(Dates.class)
// we can use this to exposed the annotations in docs
@Documented
// we can define that a annotation as Inherited like classes
@Inherited
public @interface Date {

    // a method that will be an attribute to annotations @Date(att)
    String format() default "dd/MM/yyyy";

    String value() default "";

}
