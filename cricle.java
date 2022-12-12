public class cricle {
    private double redius;
    public void setRedius(double r) {
        this.redius = r;
    }

    public double getRedius() {
        return redius;
    }
    public double getArea(){
        return (redius* redius* 3.14);
    }
    public double getCircumference(){
        return (2*3.14*redius);
    }
}
