package ss8_MVC.model;

    public class Customer {

    private int id;
    private String name;
    private String product;
    private double gia;




    public Customer() {

    }

     public Customer(int id, String name, String product,double gia) {
        this.id = id;
        this.name = name;
        this.product = product;
        this.gia = gia;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        @Override
        public String toString() {
            return "Customer{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", product='" + product + '\'' +
                    ", gia=" + gia +
                    '}';
        }
    }
