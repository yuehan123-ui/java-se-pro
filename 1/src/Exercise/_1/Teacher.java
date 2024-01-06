package Exercise._1;

public class Teacher extends People{
    private String departement;// department 部门

    public String getDepartement() {
        return departement;
    }

    public Teacher(String name, int age, String departement) {
        super(name, age);       //访问父类构造器
        this.departement = departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }
    public String issuework(){
        //issue 发布
        return "发布问题";
    }
}
