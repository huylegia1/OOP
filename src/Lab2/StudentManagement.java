package Lab2;

import java.util.ArrayList;
import java.util.Collections;

public class StudentManagement {
    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup()))
            return true;
        return false;
    }
    public ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student huy = new Student();
        huy.setName("huy");
        huy.setId("001");
        huy.setGroup("H1");
        huy.setEmail("huy@mail.com");
        huy.getInfo();
        Student s = new Student();
        s.getInfo();
        Student huy1 = new Student("huy1", "002","H1" ,"huy2@mail.com");
        huy1.getInfo();
        Student huy2 = new Student("huy2", "003","H2","huy3@mail.com");
        //copy
        //Student huy2 = new Student(huy);
        huy2.getInfo();
        if (sameGroup(huy, s)) {
            System.out.println("Cung lop");
        }
        else {
            System.out.println("Khong cung lop");
        }
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.students.add(s);
        studentManagement.students.add(huy);
        studentManagement.students.add(huy1);
        studentManagement.students.add(huy2);
        for (int i=0; i<studentManagement.students.size(); i++) {
            boolean ck = true;
            for (int j=0; j<i; j++) {
                if(sameGroup(studentManagement.students.get(i), studentManagement.students.get(j))) ck=false;
            }
            if (!ck) continue;
            System.out.println(studentManagement.students.get(i).getGroup());
            for (int l=0; l<4; l++) {
                if (sameGroup(studentManagement.students.get(i), studentManagement.students.get(l)))
                studentManagement.students.get(l).getInfo();
            }
        }
//        String id="002";
//        for(Student student: studentManagement.students){
//            if(student.getId().equalsIgnoreCase(id)) studentManagement.students.remove(student);
//        }
        Collections.sort(studentManagement.students);

        for(Student student: studentManagement.students){
           student.getInfo();
        }
    }
}
