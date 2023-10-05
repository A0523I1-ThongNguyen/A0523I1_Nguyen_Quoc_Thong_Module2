package ss16_io;

import ss11.Palindrome;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite2 {
    public static void readFile(){
            File file = new File("E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\read\\nation.csv");
        List<National> nationalList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";

            while ((line= bufferedReader.readLine())!=null){
               String[] array = line.split(","); // laáy mảng cắt các dòng trong file
               National national = new National(Integer.parseInt(array[0]),array[1],array[2]);// đối tượng `National` này được đọc từ file csv
               nationalList.add(national);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (National national: nationalList){
            System.out.println(national);
        }
    }

    public static void writeNation(List <String> stringList){
        File  file = new File("E:\\A0523I1_Nguyen_Quoc_Thong_Module2\\module_2\\OOP\\src\\ss16_io\\hi");
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String strings : stringList){
                bufferedWriter.write(strings);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
//        readFile();
//        readFile2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap code");
        String code = scanner.nextLine();
        System.out.println("Nhap name");
       String name = scanner.nextLine();

       List<String> nationalList = new ArrayList<>();
        National national = new National(id,code,name);
        nationalList.add(national.toString());

        writeNation(nationalList);
    }
}
