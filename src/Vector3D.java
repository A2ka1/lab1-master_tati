import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// 3 часть первой лабы
//задание 16
/*Разработайте класс Vector3D (вектор в трехмерном пространстве). Вектор хранится
в виде набора своих координат. Методы:
1) конструктор без параметров (создает нулевой вектор),
2) конструктор по координатам,
3) конструктор по двум точкам (Point3D),
4) длина вектора,
5) проверка равенства с заданным вектором.

 */
public class Vector3D {
    private Point3D point1;
    private Point3D point2;

    public Vector3D()
    {
        point1 = new Point3D();
        point2 = new Point3D();
    }
    public Vector3D(double x1, double y1, double z1, double x2, double y2, double z2)
    {
        point1 = new Point3D(x1, y1, z1);
        point2 = new Point3D(x2, y2, z2);

    }
    public Vector3D(Point3D point1, Point3D point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point3D getPoint1() {
        return point1;
    }

    public void setPoint1(Point3D point1) {
        this.point1 = point1;
    }

    public Point3D getPoint2() {
        return point2;
    }

    public void setPoint2(Point3D point2) {
        this.point2 = point2;
    }

    public double getLength()
    {
         return sqrt((pow(point1.getX() - point2.getX(),2))
                + (pow(point1.getY() - point2.getY(),2))
                + (pow(point1.getZ() - point2.getZ(),2)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return Objects.equals(point1, vector3D.point1) && Objects.equals(point2, vector3D.point2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point1, point2);
    }
    // Метод main для тестирования функционала класса
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        Point3D p3 = new Point3D();
        Vector3D v1 = new Vector3D(p1,p2);
        Vector3D v2 = new Vector3D(p3,p1);
        System.out.println(v1.getLength());
        System.out.println(v2.getLength());
        System.out.println(v2.equals(v1));
        System.out.println(v1.equals(v1));
    }

}


