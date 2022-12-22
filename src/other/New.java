package other;

public class New {

    public static void main(String[] args) {
        Ints ints = new Ints();

        if (ints.getA() > 3 || ints.getB() > 3 || ints.getC() > 3 || ints.getD() > 3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        System.out.println();

        if (3 > 2 || 1 > 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    static class Ints {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        public Ints() {
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        public int getD() {
            return d;
        }

        public int getE() {
            return e;
        }
    }
}
