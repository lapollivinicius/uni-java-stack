package exercises.exercice_oop.Shapes;

import exercises.exercice_oop.ThreeDimensions;

public final class Cube extends ThreeDimensions {

    private int edges;

    public int getEdges() {
        return edges;
    }

    public void setEdges(int edge) {
        this.edges = edge;
    }

    public static void main(String[] args) {

        Cube cb = new Cube();

        cb.setName("cube");
        cb.setColor("blue");
        cb.setArea_m3(125.0);
        cb.setExtrude(5);
        cb.setEdges(12);

        System.out.println(
            cb.getName() + " "
                + cb.getColor() + " "
                + cb.getArea_m3() + " "
                + cb.getExtrude() + " "
                + cb.getEdges()
        );


    }
}
