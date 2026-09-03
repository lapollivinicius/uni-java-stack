package exercises.exercice_oop;

public abstract class ThreeDimensions extends Geometric {

    private double area_m3;
    private double extrude;

    public double getArea_m3() {
        return area_m3;
    }

    public void setArea_m3(double area_m3) {
        this.area_m3 = area_m3;
    }

    public double getExtrude() {
        return extrude;
    }

    public void setExtrude(double extrude) {
        this.extrude = extrude;
    }
}
