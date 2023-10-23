package case_study.util;

import case_study.model.Student;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteStudent {

    public static ArrayList<Student> writeStudent(String filePath, ArrayList<Student> students , boolean append){
        File file = new File(filePath);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Student st: students){
                bufferedWriter.write(st.getId()+","+st.getName()+","+st.getClassRoom());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return students;
    }
}
