package ye.fang.model;

public class DataTotalModel {
    int imgid;
    String typeup;
    String namedown;

    public DataTotalModel(int imgid, String typeup, String namedown) {
        this.imgid = imgid;
        this.typeup = typeup;
        this.namedown = namedown;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }

    public String getTypeup() {
        return typeup;
    }

    public void setTypeup(String typeup) {
        this.typeup = typeup;
    }

    public String getNamedown() {
        return namedown;
    }

    public void setNamedown(String namedown) {
        this.namedown = namedown;
    }
}
