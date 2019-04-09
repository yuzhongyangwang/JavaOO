package practice10;
import java.util.LinkedList;
public class Teacher extends Person {
    private Klass klass;
    private LinkedList<Klass> classes;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(Klass klass) {
        this.klass = klass;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(this.classes == null){
            return super.introduce()+" "+"I am a Teacher. I teach No Class.";
        }
        String nums = "";
        for (int i=0;i<classes.size();i++) {
            nums = nums + classes.get(i).getNumber();
            if(i<classes.size()-1){
                nums = nums + ", ";
            }
        }
        return super.introduce()+" "+"I am a Teacher. I teach Class "+nums+".";
    }
    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce()+" "+"I am a Teacher. I teach "+student.getName()+".";
        }else{
            return super.introduce()+" "+"I am a Teacher. I don't teach "+student.getName()+".";
        }

    }
    public boolean isTeaching(Student student){
        boolean isTeaching = false;
        for (Klass k:classes) {
            isTeaching = k.isIn(student);
            if(isTeaching == true){
                break;
            }
        }
        return isTeaching;
    }
}
