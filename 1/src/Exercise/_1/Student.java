package Exercise._1;

public class Student extends People{
    private String classname;

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Student(String name, int age, String classname) {
        super(name, age);//访问父类构造器
        this.classname = classname;
    }

    public String Write(){
        return "填写听课反馈";
    }
}
