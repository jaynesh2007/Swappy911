public class StaticExamples {

    // static variable
    static String college = "RC college";

    int id;
    String name;

    // static block
    static {
        System.out.println("Static block executed");
    }

    // constructor
    StaticExamples(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // static method
    static void staticMethod() {
        System.out.println("Static method called");
    }

    // non-static method
    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    // static nested class
    static class Helper {
        void help() {
            System.out.println("Static nested class helping");
        }
    }

    public static void main(String[] args) {
        StaticExamples.staticMethod();

        StaticExamples s1 = new StaticExamples(1, "Jaynesh");
        s1.display();

        Helper h = new Helper();
        h.help();
    }
}