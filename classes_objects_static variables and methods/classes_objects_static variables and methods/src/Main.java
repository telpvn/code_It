public class Main {
    public static void main(String[] args) {
        Duck krya = new Duck("Кря", 3, "Серая");
        Duck.footCount = 2;
        Duck gylya = new Duck("Гуля", 5, "Серебристая");
        Duck.footCount = 1;

        krya.fly();
        gylya.fly();
    }
}