package ss12_java_collection_framework.map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Dem_So_Lan_Xuat_Hien_Moi_Tu_Trong_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> testMap = new TreeMap<>();

        String chuoi = scanner.nextLine();
        String[] newChuoi = chuoi.split("");


        for (String s : newChuoi){
            if (testMap.containsKey(s)){ // check s ton tai trong Map k
            Integer value = testMap.get(s);
                value++;
                testMap.replace(s,value);
            }else {
                testMap.put(s,1);
            }
        }
        System.out.println(testMap);
    }
}
