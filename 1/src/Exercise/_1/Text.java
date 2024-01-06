package Exercise._1;

public class Text {
    public static void main(String[] args) {
        Student s1 = new Student("小明",18,"美术三班");
        System.out.println(s1.getClassname()+s1.getName()+s1.Write());
        
        Teacher t1 = new Teacher("王老师",45,"体育部");

        System.out.println(t1.getName()+t1.getDepartement()+t1.issuework());
    }
}
