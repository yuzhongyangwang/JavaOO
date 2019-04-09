package practice09;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass){
        this.setName(name);
        this.setAge(age);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String introduce(){

        if(this.klass.getLeader() != null && this.klass.getLeader().equals(this)){
            return super.introduce() + " " + "I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }
        return super.introduce() + " " + "I am a Student. I am at Class "+klass.getNumber()+".";
    }

}
