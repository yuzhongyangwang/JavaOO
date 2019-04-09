package practice02;

public class Student extends Person{
    private int klass;

    public Student(String name,int age,int klass){
        this.setName(name);
        this.setAge(age);
        this.klass = klass;
    }
    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
    public String introduce(){
        String Str = "I am a Student. I am at Class "+klass+".";
        return Str;
    }
}
