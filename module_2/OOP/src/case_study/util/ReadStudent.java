package case_study.util;

import case_study.model.Employee;
import case_study.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadStudent {
  static   Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> studentList = new ArrayList<>();

    public static ArrayList<Student> readTest(String filePath){
        File file = new File(filePath);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine())!= null ){
                String[] arrayObj = line.split(",");
                Student students = new Student();
                students.setId(Integer.parseInt(arrayObj[0]));
                students.setName(arrayObj[1]);
                students.setClassRoom(arrayObj[2]);
                studentList.add(students);
            }
            return studentList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
