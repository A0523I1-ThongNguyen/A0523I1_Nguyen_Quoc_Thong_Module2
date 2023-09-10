package crush.model;

public class Crush {
    final String GENDER = "girl";
    private String name;
    private int age;
    private String work;

    public Crush(){

    }
    public Crush(String name, int age , String work){
            this.name = name;
            this.age = age;
            this.work = work;
    }

        public String getGENDER() {
                return GENDER;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getWork() {
                return work;
        }

        public void setWork(String work) {
                this.work = work;
        }

        @Override
        public String toString() {
                return "Crush{" +
                        "GENDER='" + GENDER + '\'' +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", work='" + work + '\'' +
                        '}';
        }
}
