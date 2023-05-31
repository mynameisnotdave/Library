public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        setEmail(email);
        setName(name);
        setGender(gender);
    }

    public Author() {

    }

    @Override
    public String toString() {
        return "Name: '" + getName() + '\'' +
                ", Email: '" + getEmail() + '\'' +
                ", Gender: " + getGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
