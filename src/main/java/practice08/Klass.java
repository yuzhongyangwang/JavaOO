package practice08;

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
        leader = student;
    }
    public Student getLeader(){
        return leader;
    }
}
