package src.advanced.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 *  <p> Before generics, Object was used as a Generic type, but needs casting </p>
 *  <p> After generics, we can use <T, U, R ...> to define type that will be used to typing </p>
 *  <p> Synthetic Sugar -> Generics is used only to compile, no execute or running code, type erasure - remove generics in bitcode</p>
 *
 *  <p>Convetion</p>
 *  <ul>
 *      <li>{@code <T>} TYPE</li>
 *      <li>{@code <E>} ELEMENT</li>
 *      <li>{@code <K>} KEY</li>
 *      <li>{@code <V>} VALUE</li>
 *      <li>{@code <N>} NUMBER</li>
 *      <li>{@code <R>} RETURN</li>
 *      <li>{@code <U>} SECOND TYPE</li>
 *  </ul>
 *
 * @param <T>
 */
public class Generics<T> {

    private T obj;

    public Generics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    // to use parameter type in methods (ONLY)
    public <U> List<U> transform(Function<T, U> function, List<T> list) {
        return list.stream().map(function).toList();
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3 ,4, 5));
        Generics<Integer> gn = new Generics<>(10);
        gn.transform(number -> number + "_", list).forEach(System.out::println);

        // wildcards - it is used to gives types permission to subclass from superclass
        // to use a list with super or sub, we need to use wildcard
        List<? super child> p = new ArrayList<parent>();
        // lower bound to up -> it means that list accept sub and superclasses

        // when we define an extends to list per example, we didn't add more itens
        List<? extends parent> c = new ArrayList<child>();
        // upper bound to down -> but list don't accept itens, but if it accept, it could accept every class that extends that super class

        // ? extends|super class -> it means anything that (extends or it is a superclass) to class)
        // <?> -> it means <? extends Object>

        // Multiple Bounds <? extends someClass & otherClass<?>

    }

    // TYPES can be passed from super to sub
    static class parent<R> {
        void sayHi(R obj) {}
    }

    static class child<R> extends parent<R> {
        @Override
        void sayHi(R obj) {
            super.sayHi(obj);
        }
    }
}
