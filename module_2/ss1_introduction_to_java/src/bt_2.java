import java.util.Scanner;

public class bt_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc");
        int number = scanner.nextInt();
        String stringTrum = "";

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    stringTrum = "Zero";
                    break;
                case 1:
                    stringTrum = "one";
                    break;
                case 2:
                    stringTrum = "two";
                    break;
                case 3: stringTrum = "three";
                    break;
                case 4:
                    stringTrum = "four";
                    break;
                case 5:
                    stringTrum = "five";
                    break;
                case 6:
                    stringTrum = "six";
                    break;
                case 7:
                    stringTrum = "seven";
                    break;
                case 8:
                    stringTrum = "eight";
                    break;
                case 9:
                    stringTrum = "nine";
                    break;
                case 10:
                    stringTrum = "ten";
                    break;
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    stringTrum = "ten";
                    break;
                case 1:
                    stringTrum = "eleven";
                    break;
                case 2:
                    stringTrum = "twelve";
                    break;
                case 3:
                    stringTrum = "thirteen";
                    break;
                case 4:
                    stringTrum = "fourteen";
                    break;
                case 5:
                    stringTrum = "fifteen";
                    break;
                case 6:
                    stringTrum = "sixteen";
                    break;
                case 7:
                    stringTrum = "seventeen";
                    break;
                case 8:
                    stringTrum = "eighteen";
                    break;
                case 9:
                    stringTrum = "nineteen";
                    break;
            }
        } else if (number >= 20 && number < 100) {
            int hangChuc = number / 10;
            int hangDonVi = number % 10;
            String stringHangChuc = "";
            String stringHangDonVi = "";

            switch (hangChuc) {
                case 2:
                    stringHangChuc = "twenty";
                    break;
                case 3:
                    stringHangChuc = "thirty";
                    break;
                case 4:
                    stringHangChuc = "forty";
                    break;
                case 5:
                    stringHangChuc = "fifty";
                    break;
                case 6:
                    stringHangChuc = "sixty";
                    break;
                case 7:
                    stringHangChuc = "seventy";
                    break;
                case 8:
                    stringHangChuc = "eighty";
                    break;
                case 9:
                    stringHangChuc = "ninety";
                    break;
            }
            switch (hangDonVi) {
                case 1:
                    stringHangDonVi = "one";
                    break;
                case 2:
                    stringHangDonVi = "two";
                    break;
                case 3:
                    stringHangDonVi = "three";
                    break;
                case 4:
                    stringHangDonVi = "four";
                    break;
                case 5:
                    stringHangDonVi = "five";
                    break;
                case 6:
                    stringHangDonVi = "six";
                    break;
                case 7:
                    stringHangDonVi = "seven";
                    break;
                case 8:
                    stringHangDonVi = "eight";
                    break;
                case 9:
                    stringHangDonVi = "nine";
                    break;

            }
            stringTrum = stringHangChuc + "-" + stringHangDonVi;
        } else if (number >= 100 && number < 1000) {
            int hangTram = number / 100;
            int hangChuc = (number % 100) / 10;
            int hangDonVi = (number % 100) % 10;
            String stringHangTram = "";
            String stringHangChuc = "";
            String stringHangDonVi = "";

            switch (hangTram) {
                case 1:
                    stringHangTram = "one hundred";
                    break;
                case 2:
                    stringHangTram = "two hundred";
                    break;
                case 3:
                    stringHangTram = "three hundred";
                    break;
                case 4:
                    stringHangTram = "four hundred";
                    break;
                case 5:
                    stringHangTram = "five hundred";
                    break;
                case 6:
                    stringHangTram = "six hundred";
                    break;
                case 7:
                    stringHangTram = "seven hundred";
                    break;
                case 8:
                    stringHangTram = "eight hundred";
                    break;
                case 9:
                    stringHangTram = "nine hundred";
                    break;

            }

                switch (hangChuc) {
                    case 2:
                        stringHangChuc = "twenty";
                        break;
                    case 3:
                        stringHangChuc = "thirty";
                        break;
                    case 4:
                        stringHangChuc = "thirty";
                        break;
                    case 5:
                        stringHangChuc = "thirty";
                        break;
                    case 6:
                        stringHangChuc = "thirty";
                        break;
                    case 7:
                        stringHangChuc = "thirty";
                        break;
                    case 8:
                        stringHangChuc = "thirty";
                        break;
                    case 9:
                        stringHangChuc = "thirty";
                        break;
                }
                switch (hangDonVi) {
                    case 1:
                        stringHangDonVi = "one";
                        break;
                    case 2:
                        stringHangDonVi = "two";
                        break;
                    case 3:
                        stringHangDonVi = "three";
                        break;
                    case 4:
                        stringHangDonVi = "four";
                        break;
                    case 5:
                        stringHangDonVi = "five";
                        break;
                    case 6:
                        stringHangDonVi = "six";
                        break;
                    case 7:
                        stringHangDonVi = "seven";
                        break;
                    case 8:
                        stringHangDonVi = "eight";
                        break;
                    case 9:
                        stringHangDonVi = "nine";
                        break;

                }
                stringTrum = stringHangTram + " and " + stringHangChuc + " " + stringHangDonVi;

        }else{
            stringTrum = "out of ability";
        }
        System.out.println(number + ": Translate : " +stringTrum);
    }
}

