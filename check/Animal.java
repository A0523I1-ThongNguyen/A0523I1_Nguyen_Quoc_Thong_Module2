import java.util.Objects;

public class Animal {

    public static void main(String[] args) {
        Name Ngan = new Name("nu",20);
        Name Thong = new Name("nam",25);
        Name Bich = new Name("nu",20);

        System.out.println("Ngan vs Bich " + Ngan.equals(Bich));
        System.out.println("Ngan vs Thong "+ Ngan.equals(Thong));
    }

}

class Name {
    String name;
    int age;

    public Name() {

    }
    public Name(String name , int age){
        this.name = name;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return age == name1.age && Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}



