package src.Advanced.exercises.exercise_80;

public class Pair<T, U> {

    private T obj;
    private U obj2;

    public Pair(T obj, U obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "obj=" + obj +
                ", obj2=" + obj2 +
                '}';
    }

    public void showObjs() {
        System.out.println(this.getObj() + "->" + this.getObj2());
    }
}
