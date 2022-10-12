import java.util.Scanner;

public class Vector {
    public double x;
    public double y;
    public double z;


    public Vector(double a, double b, double c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

    // Длина вектора. Корень из суммы квадратов
    public static double length(double x, double y, double z) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    // метод, вычисляющий скалярное произведение
    public double scalarProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector other) {
        return new Vector(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z, this.x * other.y - this.y * other.x);
    }

    // Косинус между двумя векторами
    public double cos(Vector other) {
        return scalarProduct(other) / (length(this.x, this.y, this.z) * length(other.x, other.y, other.z));
    }

    // Сумма двух векторов
    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    // Разность двух векторов
    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        char[] x = Double.toString(this.x).toCharArray(),
                y = Double.toString(this.x).toCharArray(),
                z = Double.toString(this.x).toCharArray();
        int prime = 23, mod = (int) 1e7 + 7;
        for (int i = 0; i < x.length; i++) {
            hash = (hash * prime + (int) (x[i])) % mod;
        }
        for (int i = 0; i < y.length; i++) {
            hash = (hash * prime + (int) (y[i])) % mod;
        }
        for (int i = 0; i < z.length; i++) {
            hash = (hash * prime + (int) (z[i])) % mod;
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        Vector other = (Vector) obj;
        if (this == other)
            return true;
        if (x != other.x)
            return false;
        if (y != other.y)
            return false;
        if (z != other.z)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите через пробел координаты первого вектора:");
        String v1 = sc.nextLine();
        String[] v1_coord = v1.split(" ");
        double x1 = Double.parseDouble(v1_coord[0]);
        double y1 = Double.parseDouble(v1_coord[1]);
        double z1 = Double.parseDouble(v1_coord[2]);
        Vector vector1 = new Vector(x1, y1, z1);

        System.out.println("Введите через пробел координаты второго вектора:");
        String v2 = sc.nextLine();
        String[] v2_coord = v2.split(" ");
        double x2 = Double.parseDouble(v2_coord[0]);
        double y2 = Double.parseDouble(v2_coord[1]);
        double z2 = Double.parseDouble(v2_coord[2]);
        Vector vector2 = new Vector(x2, y2, z2);

        System.out.println("Длина 1 вектора:");
        System.out.println(length(x1, y1, z1));

        System.out.println("Длина 2 вектора:");
        System.out.println(length(x2, y2, z2));

        System.out.println("Скалярное произведение векторов:");
        System.out.println(vector1.scalarProduct(vector2));

        System.out.println("Векторное произведение векторов:");
        Vector vector3 = vector1.crossProduct(vector2);
        String vect_pr = String.format("(%s,%s,%s)", vector3.x, vector3.y, vector3.z);
        System.out.println(vect_pr);

        System.out.println("Косинус угла между векторами:");
        System.out.println(vector1.cos(vector2));

        System.out.println("Cумма двух векторов:");
        Vector vector4 = vector1.add(vector2);
        String vect_sum = String.format("(%s,%s,%s)", vector4.x, vector4.y, vector4.z);
        System.out.println(vect_sum);

        System.out.println("Разность двух векторов:");
        Vector vector5 = vector1.subtract(vector2);
        String vect_sub = String.format("(%s,%s,%s)", vector5.x, vector5.y, vector5.z);
        System.out.println(vect_sub);
    }

}
