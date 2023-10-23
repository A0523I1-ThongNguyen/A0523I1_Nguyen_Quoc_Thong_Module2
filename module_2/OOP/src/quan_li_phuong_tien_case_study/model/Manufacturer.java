package quan_li_phuong_tien_case_study.model;

public class  Manufacturer {
    private String codeBrand;
    private String nameBrand;
    private String Nation;

    public Manufacturer(String codeBrand, String nameBrand, String nation) {
        this.codeBrand = codeBrand;
        this.nameBrand = nameBrand;
        Nation = nation;
    }
    public Manufacturer(){

    }

    public String getCodeBrand() {
        return codeBrand;
    }

    public void setCodeBrand(String codeBrand) {
        this.codeBrand = codeBrand;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getNation() {
        return Nation;
    }

    public void setNation(String nation) {
        Nation = nation;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "codeBrand='" + codeBrand + '\'' +
                ", nameBrand='" + nameBrand + '\'' +
                ", Nation='" + Nation + '\'' +
                '}';
    }
}
