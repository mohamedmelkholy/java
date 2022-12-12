public class triangle {
    private double A;
    private double B;
    private double C;
    public void setA(double b) {
        this.A = b;
    }
    public void setB(double l) {
        this.B = l;
    }

    public void setC(double h) {
        this.C = h;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }
    public double getC()
    {
        return C;
    }
    public double getArea(){
        double s =  (A+B+C)/2;
        double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));
        return area;

    }
    public double getCircumference(){
        return (A+B+C);
    }
}
