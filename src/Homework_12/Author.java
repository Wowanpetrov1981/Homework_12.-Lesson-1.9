package Homework_12;

public class Author {
   private String lastName;
    private String name;

    public Author(String lastName, String name) {
        this.lastName = lastName;
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.name;
    }
}
