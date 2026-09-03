package exercises.exercice_oop.Shapes;

import exercises.exercice_oop.TwoDimensions;

public final class Square extends TwoDimensions {

    private int edges;

    public int getEdges() {
        return edges;
    }

    public void setEdges(int edges) {
        this.edges = edges;
    }

    public static void main(String[] args) {

        Square sqr = new Square();

        sqr.setName("square");
        sqr.setColor("red");
        sqr.setArea_m2(25.0);
        sqr.setEdges(4);

        System.out.println(
                sqr.getName() + " "
                + sqr.getColor() + " "
                + sqr.getArea_m2() + " "
                + sqr.getEdges()
        );

    }

}
