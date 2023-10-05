package ss14_thuat_toan_sap_xep;

public class Sap_Xep_Noi_Bot {

    public static void main(String[] args) {
        int[] listNumber = {1,2,4,3};
        bubbleSort(listNumber);
        for (int i = 0; i < listNumber.length; i++)
            System.out.print(listNumber[i] + " ");
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        }
    }
}

