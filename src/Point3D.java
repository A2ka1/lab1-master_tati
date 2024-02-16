import java.util.Objects;
// 3 часть первой лабы
//задание 15
//
//       //Разработайте класс Point3D (точка в трехмерном пространстве). Точка хранится в виде набора декартовых координат.
//        // Методы:
//        // 1) конструктор по координатам,
//        //2) конструктор без параметров (создает точку – начало координат),
//        //3) геттеры и сеттеры,
//        //4) вывод точки на консоль.
//        //Создайте несколько объектов этого класса. Сравните две точки на равенство.
//        // Для какого-то из объектов проверьте, равна ли эта точка сама себе.

public class Point3D {
    private double x;
    private double y;
    private double z;

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }//КОНСТРУКТОР ПО КООРДИНАТАМ

    public Point3D() {
        this(0, 0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }




    @Override //эта штука показывает что мы теперь используем вот это
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(x, point3D.x) == 0 && Double.compare(y, point3D.y) == 0 && Double.compare(z, point3D.z) == 0;
    }


    // Метод main для тестирования функционала класса
    public static void main(String[] args) {
        // Создание трех точек
        Point3D p1 = new Point3D(1, 2, 3);
        Point3D p2 = new Point3D(1, 2, 3);
        Point3D p3 = new Point3D();


        // Вывод координат точек в консоль
        //
        System.out.print("p1 = ");
        p1.print();

        System.out.print("p2 = ");
        p2.print();

        System.out.print("p3 = ");
        p3.print();

        // Сравнение точек на равенство
        if (p1.equals(p2)) {
            System.out.println("p1 equals p2");}
         else {
                System.out.println("p1 does not equal p2");
            }

         if (p3.equals(p3)) {
                System.out.println("p3 equals itself");}
         else {
                    System.out.println("p3 does not equal itself");
                }
            }


        }


