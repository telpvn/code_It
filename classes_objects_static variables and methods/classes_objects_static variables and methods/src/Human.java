public class Human {
    String name;
    String gender;
    int age;

    public Human() {
    }

    public Human(String humanName, int humanAge) {
        name = humanName;
        age = humanAge;
    }

    public Human(String humanName, String humanGender, int humanAge) {
        name = humanName;
        gender = humanGender;
        age = humanAge;
    }
}