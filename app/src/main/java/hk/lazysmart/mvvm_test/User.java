package hk.lazysmart.mvvm_test;

public class User {
    private int age;
    private String userName;

    public User() {
        age = 0;
        userName = "";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
