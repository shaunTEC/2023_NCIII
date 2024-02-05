class PersonalInfo {
    public String name;
    public static String gender = "male";

    public void setPersonalInfo(String name) {
        int age = 24;

        this.name = name;

        System.out.println("Personal Info:\n" +
                "Name: " + this.name + "\n" +
                "Age: " + age + "\n" +
                "Gender: " + gender);
    }
}

public class Activity2_Cuesta {
    public static void main(String[] args) {
        PersonalInfo person = new PersonalInfo();

        person.setPersonalInfo("Shaun");
    }
}