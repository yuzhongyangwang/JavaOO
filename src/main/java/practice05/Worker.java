package practice05;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    public Worker(){

    }
    public String introduce(){
        String Str = super.introduce() + " " + "I am a Worker. I have a job.";
        return Str;
    }
}