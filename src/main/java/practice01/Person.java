package practice01;

public class Person {
    private String name;
    private int age;

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

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        String Str = "My name is "+name+". I am "+age+" years old.";
        return Str;
    }
}
