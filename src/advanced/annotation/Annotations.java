package advanced.annotation;

public class Annotations {

    // annotations are a semantic interface, applied in somewhere that it can use some resources
    @Date(format = "yyyy-MM-dd")
    @Date() // repeated
    private String releaseDate;

    // when an annotations have only a "value" att, this one can be ommited
    // int value() -> it can be ommited @Date(10)

    /**
     * @Override
     * @Deprecated
     * @SuppressWarnings
     * @FunctionalInterface
     * @Retention -> meta
     * @Target -> meta
     * @Inherited -> meta
     * @Repeatable -> meta
     * @Serial
     * @Documented
     * @SafeVarargs
     * @Native
     * @CallerSensitive
     */

}
