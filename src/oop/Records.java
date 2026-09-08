package src.oop;

import java.util.Objects;

// records are a simple way to create entities to storage datas
public record Records(String data1, int data2, double data3) {

    // it needs to be static
    private static final double DEFAULT_DATA3 = 0.0;

    // records can have blocs to apply logics
    public Records {
        Objects.requireNonNull(data1);
    }

    // overloading
    public Records(String data1, int data2) {
        this(data1, data2, DEFAULT_DATA3);
    }
}
