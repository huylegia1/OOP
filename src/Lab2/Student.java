package Lab2;

public class Student implements Comparable<Student> {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Default constructor
    public Student() {
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    public void getInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
    }

    public Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = "K59CB";
    }
    public Student(String n, String sid, String gr, String em) {
        this.name = n;
        this.id = sid;
        this.email = em;
        this.group = gr;
    }
    public Student(Student student) {
        this.name = student.name;
        this.id = student.id;
        this.group = student.group;
        this.email = student.email;
    }
//abc acb
    @Override
    public int compareTo(Student o) {

        return this.getGroup().compareTo(o.getGroup());
    }
}