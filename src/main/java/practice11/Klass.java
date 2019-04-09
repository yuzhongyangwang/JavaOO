package practice11;

public class Klass {
    private Integer numebr;
    private Student leader;
    public Klass(Integer klass) {
        this.numebr = klass;
    }


    public Integer getNumber() {
        return numebr;
    }

    public String getDisplayName() {
        return "Class " + numebr;
    }
    public void assignLeader(Student student){
        if(student == null || student.getKlass().getNumber()!=this.getNumber()){
            System.out.print("It is not one of us.\n");
        }
        else{
            leader = student;
            System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
        }
    }

    public Student getLeader(){
        return leader;
    }
    public void appendMember(Student student){
        student.setKlass(this);
        System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
    }

    public boolean isIn(Student student){
        if(student.getKlass().getNumber()==this.getNumber()){
            return true;
        }
        return false;
    }
}
