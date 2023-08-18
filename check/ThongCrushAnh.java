public class ThongCrushAnh {
        public static void main(String[] args) {
            //khoi tao doi tuong 3 tham so,
            ThongCrushAnh thong = new ThongCrushAnh(25,"Thong",5);
           //goi method doi tuong
            thong.enoughLove("Yes");
        }
        //bien de tham so gan vao
        public int age;
        public String name;
        public int money;

        //constructor
        public ThongCrushAnh(int age, String name, int money) {
            this.age = age;
            this.name = name;
            this.money = money;
        }
   //method
        public void enoughLove(String yes) {
            System.out.println(this.age + " Tuoi " + this.name + " co du " + this.money + " de Anh noi  " + yes);
        }

    }


