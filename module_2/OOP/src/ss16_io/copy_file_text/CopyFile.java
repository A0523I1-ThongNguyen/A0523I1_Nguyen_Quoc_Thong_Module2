package ss16_io.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source file to copy: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter the file you want to paste: ");
        String targetFile = scanner.nextLine();

        File fileS = new File(sourceFile);
        File fileT = new File(targetFile);

        if (!fileS.exists() && !fileT.exists()) {
            System.out.println("two file does not exist");
            return;
        } else if (!fileS.exists()) {
            System.out.println("file Source does not exist. Please retype");
            return;
        } else {
            if (!fileT.exists()) {
                System.out.println("file Target does not exist. Please retype");
                return;
            } else {
                System.out.println("Copy finish");
            }
        }

        try

    {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileS));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileT,false));
        /* true` được sử dụng để cho phép ghi tiếp vào cuối file thay vì ghi đè lên nội dung có sẵn trong file.
        Điều này có nghĩa là khi bạn chạy chương trình lần đầu tiên, dữ liệu sẽ được ghi vào cuối file,
        và khi bạn chạy chương trình lần thứ hai, dữ liệu sẽ được ghi vào cuối file một lần nữa.
           Do đó, nội dung của file đích (`fileT`) sẽ được sao chép hai lần*/
        String line = "";
        int kiTu = 0;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            kiTu += line.length();
        }

        System.out.println("So ki tu da copy:" + kiTu);
        bufferedReader.close();
        bufferedWriter.close();

    } catch(
    FileNotFoundException e)

    {
        throw new RuntimeException(e);
    } catch(
    IOException e)

    {
        throw new RuntimeException(e);
    }


}

}
