package practice_1;

public class Dog {

    private String name;
    private int age;

    public Dog() {
        this.name = "Jack";
        this.age = 0;
    }

    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age - " + this.age;
    }

    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " +age * 7 + " years");
    }
}
