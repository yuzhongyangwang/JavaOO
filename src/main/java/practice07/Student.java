package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(String name,int age,Klass klass){
        this.setName(name);
        this.setAge(age);
        this.klass = klass;
    }
    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce(){
        String Str = super.introduce() + " " + "I am a Student. I am at Class "+klass.getKlass()+".";
        return Str;
    }
}
