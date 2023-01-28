package org.example.lesson4;

public class Triangle {

    public static TriangleType classify(final int a, final int b, final int c) {
        int trian;
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return TriangleType.INVALID;
        }
        trian = 0;
        if (a == b) {
            trian = trian + 1;
        }
        if (a == c) {
            trian = trian + 2;
        }
        if (b == c) {
            trian = trian + 3;
        }
        if (trian == 0) {
            if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
                return TriangleType.INVALID;
            } else {
                return TriangleType.SCALENE;
            }
        }
        if (trian > 3) {
            return TriangleType.EQUILATERAL;
        }
        if ((trian == 1) && ((a + b) > c)) {
            return TriangleType.ISOSCELES;
        } else if ((trian == 2) && ((a + c) > b)) {
            return TriangleType.ISOSCELES;
        } else if ((trian == 3) && ((b + c) > a)) {
            return TriangleType.ISOSCELES;
        }
        return TriangleType.INVALID;
    }
    public static void main(String[] args) {


        int a = 10;
        System.out.println("Сторона a=" + a);
        int b = 11;
        System.out.println("Сторона b=" + b);
        int c = 12;
        System.out.println("Сторона c=" + c);

        int p = (a + b + c)/2;
        System.out.println("периметр =" + p);
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь треугольника = " + s);

        final TriangleType type= classify(10, 11, 12);
        System.out.println(type);
    }


}

