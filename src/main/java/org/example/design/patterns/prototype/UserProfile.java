package org.example.design.patterns.prototype;

public class UserProfile implements Cloneable {
    private String name;
    private String email;
    public UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("constructore called");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public UserProfile clone() throws CloneNotSupportedException {
        UserProfile clone = (UserProfile) super.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
class prototypeDemo{
    public static void main(String[] args) throws CloneNotSupportedException {
        UserProfile original = new UserProfile("RR","rrrr@gmail.com");
        UserProfile copy = original.clone();
        copy.setEmail("copy@gmail.com");
        System.out.println("Orginal "+ original);
        System.out.println("Copied "+ copy);
    }
}
