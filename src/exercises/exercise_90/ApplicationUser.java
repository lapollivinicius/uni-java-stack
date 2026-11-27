package exercises.exercise_90;

import java.io.Serializable;

public class ApplicationUser implements Serializable {

    String name;
    int age;
    String email;
    transient String password;

    public ApplicationUser(String name, int age, String email, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "ApplicationUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
