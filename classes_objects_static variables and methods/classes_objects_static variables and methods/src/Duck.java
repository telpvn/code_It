public class Duck {
    String name;
    int age;
    String color;

    public Duck(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void fly() {
        System.out.println(color + " утка по кличке " + name + " улетела в теплые края");
    }
}
