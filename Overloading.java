public class Overloading {

    public static void main(String[] args) {

        Addition obj = new Addition();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}

class Addition {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}
