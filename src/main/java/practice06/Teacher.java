package practice06;

public class Teacher extends Person{
    private Integer klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.klass == null){
            return super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }
        return super.introduce()+" "+"I am a Teacher. I teach Class "+klass+".";
    }
}
