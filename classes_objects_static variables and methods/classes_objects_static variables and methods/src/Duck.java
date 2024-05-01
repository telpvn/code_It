public class Duck {
    String name;
    int age;
    String color;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    static int footCount;

    public void fly() {
        System.out.println(color + " утка по кличке " + name + " улетела в теплые края " + footCount + " ногами");
    }

    static void fly(int footCount) {
        Duck.footCount = footCount;
    }
}
