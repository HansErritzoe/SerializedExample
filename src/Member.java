import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L; // Unique identifier for Serializable classes
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', age=" + age + "}";
    }
}
