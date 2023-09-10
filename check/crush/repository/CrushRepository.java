package crush.repository;

import crush.model.Crush;

import java.util.ArrayList;

public class CrushRepository {
    private ArrayList<Crush> danhSachCrush;


    public CrushRepository(){
        this.danhSachCrush = new ArrayList<Crush>();
    }

    public CrushRepository(ArrayList<Crush> danhSachCrush){
        this.danhSachCrush = danhSachCrush;
    }

    public void addCrush(Crush crush){
        this.danhSachCrush.add(crush);
    }

    public void showCrush(){
        for(Crush crushes : danhSachCrush){
            System.out.println(crushes);
        }
    }

    //check co crush khong hay rong~
    public boolean checkCrush(){
        return this.danhSachCrush.isEmpty();
    }

    //xem so luong crush
    public int sizeCrush(){
        return this.danhSachCrush.size();
    }

    //lam rong~ danh sach Crush
    public void removeAllCrush(){
        this.danhSachCrush.removeAll(danhSachCrush);
    }

    //check thu crush co trong danh sach k
    public boolean checkCrush(Crush name){
        return this.danhSachCrush.contains(name);
    }

}
