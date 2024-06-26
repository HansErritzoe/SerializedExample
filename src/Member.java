import java.io.Serializable;

public class Member implements Serializable {
    private static final long serialVersionUID = 1L; // Unique identifier for Serializable classes
    private int id;
    private String name;
    private int age;

    public Member(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Member{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
