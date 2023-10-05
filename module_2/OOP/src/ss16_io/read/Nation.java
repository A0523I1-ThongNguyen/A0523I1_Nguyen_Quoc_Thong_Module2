package ss16_io.read;

public class Nation {
    int id;
    String code;
    String name;

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public Nation(String name) {//why constructor 1 thông tin name lại đọc ra đươc hết
        this.name = name;
    }
    public Nation(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id+ ","+code+","+name; // 3 thong tin nay + lai = 1 chuoi~
    }
}
