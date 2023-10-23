package case_study.service;

import case_study.model.Student;
import case_study.repository.StudentRepository;
import case_study.util.ReadStudent;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.Scanner;

public class StudentService {
    private static final String file = "E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\case_study\\data\\Student.csv";
    static ArrayList<Student> studentsList = StudentRepository.showStudent(file);

   public static void showStudent(){


       for (Student st: studentsList){
           System.out.println(st);
       }
   }

   public static void add(){

       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhap id");
       int id = Integer.parseInt(scanner.nextLine());
       System.out.println("Nhap ten");
       String name = scanner.nextLine();
       System.out.println("Nhap class room");
       String classRoom =scanner.nextLine();

       Student student = new Student(id,name,classRoom);
       studentsList.add(student);
       ArrayList<Student> writeStudent = StudentRepository.addStudent(file,studentsList,true);
       for (Student st: writeStudent){
           System.out.println(st);
       }
   }

}
