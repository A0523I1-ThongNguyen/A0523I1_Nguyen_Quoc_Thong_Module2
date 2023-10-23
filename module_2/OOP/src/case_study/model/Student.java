package case_study.model;

public class Student {
    int id;
    String name;
    String classRoom;

    public Student(int id, String name, String classRoom) {
        this.id = id;
        this.name = name;
        this.classRoom = classRoom;
    }

    public Student(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classRoom='" + classRoom + '\'' +
                '}';
    }
}
