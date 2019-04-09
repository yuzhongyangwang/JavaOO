package practice10;

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
        }
    }

    public Student getLeader(){
        return leader;
    }
    public void appendMember(Student student){
        student.setKlass(this);
    }

    public boolean isIn(Student student){
        if(student.getKlass().getNumber()==this.getNumber()){
            return true;
        }
        return false;
    }
}
