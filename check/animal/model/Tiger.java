package animal.model;

public class Tiger {
    private String name;
    private int age;
    private String skill;

    public Tiger(){

    }

    public Tiger(String name, int age, String skill){
        this.name = name;
        this.age = age;
        this.skill = skill;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSkill(String skill){
        this.skill = skill;
    }

    public String getSkill(){
        return this.skill;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", skill='" + skill + '\'' +
                '}';
    }
}
