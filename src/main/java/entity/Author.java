package entity;

public class Author {

    private String name;
    private String lastName;
    private String gender;


    Author(String name,String lastName, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
}

