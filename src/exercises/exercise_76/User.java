package src.exercises.exercise_76;

public class User {

    private String name;
    private int age;
    private String email;
    private boolean active;

    public User(String name, int age, String email, boolean active) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.active = active;
    }

    public String getName() {
        return this.name;
    }

    public void setName( String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge( int age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail( String email) {
        this.email = email;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive( boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", active=" + active +
                '}';
    }
}
