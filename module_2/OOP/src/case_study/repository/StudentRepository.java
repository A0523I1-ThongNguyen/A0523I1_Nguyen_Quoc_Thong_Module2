package case_study.repository;

import case_study.model.Student;
import case_study.util.ReadStudent;
import case_study.util.WriteStudent;

import java.util.ArrayList;

public class StudentRepository {

 // private static final String file = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Student.csv";
    public static ArrayList<Student> showStudent(String filePath){
        return ReadStudent.readTest(filePath);
    }

    public static ArrayList<Student> addStudent(String filePath,ArrayList<Student> students,boolean append){
        return WriteStudent.writeStudent(filePath,students,append);
    }
}
