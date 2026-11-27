package exercises.exercise_89;

@SecurityConfig(allowed = {@Group("Admin"), @Group("Guess")})
public class UserService {

    private String name = "john";

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

}

