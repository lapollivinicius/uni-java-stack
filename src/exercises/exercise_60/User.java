package src.exercises.exercise_60;

public class User implements UserInterface {

    private String name;
    private Role role;

    public User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return this.role;
    }

    @Override
    public void changeName(String newName) {
        this.name = newName;
    }

    @Override
    public void delete() {
        if(this.role.equals(Role.ADMIN)) {
            System.out.println("AUTHORIZED");
        } else {
            System.out.println("UNAUTHORIZED");
        }
    }

    @Override
    public void edit() {
        if(this.role.equals(Role.ADMIN)) {
            System.out.println("AUTHORIZED");
        } else {
            System.out.println("UNAUTHORIZED");
        }
    }

    @Override
    public void managerUsers() {
        if(this.role.equals(Role.ADMIN)) {
            System.out.println("AUTHORIZED");
        } else {
            System.out.println("UNAUTHORIZED");
        }
    }
}
