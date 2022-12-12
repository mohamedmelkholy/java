import java.util.Scanner;

public class shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, redius;
        System.out.println("1-to cricle/ 2-to triangle");
        int select_class = in.nextInt();
        if (select_class == 1) {
            redius = in.nextDouble();
            cricle c1 = new cricle();
            c1.setRedius(redius);
            System.out.println("redius_of_cricle: " + c1.getRedius() + "\n" + "area_of_cricle: " + c1.getArea() + "\n" + "Circumference_of_cricle: " + c1.getCircumference());
        } else if (select_class == 2) {
            a = in.nextDouble();
            b = in.nextDouble();
            c = in.nextDouble();
            triangle t = new triangle();
            t.setA(a);
            t.setB(b);
            t.setC(c);
            System.out.println("A: " + t.getA() + "\n" + "B: " + t.getB() + "\n" + "C: " + t.getC());
            System.out.println("area_of_tringle: " + t.getArea() + "\n" + "Circumference_of_tringle: " + t.getCircumference());

        }
    }
}