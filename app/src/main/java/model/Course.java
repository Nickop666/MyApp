package model;

public class Course {
    int id;
    String img, title, osnText, strWeb, strMaps;

    public Course(int id, String img, String title, String osnText, String strMaps, String strWeb) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.osnText = osnText;
        this.strMaps= strMaps;
        this.strWeb = strWeb;



    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOsnText() {
        return osnText;
    }

    public void setOsnText(String osnText) {
        this.osnText = osnText;
    }

    public String getStrWeb() {
        return strWeb;
    }

    public void setStrWeb(String strWeb) {
        this.strWeb = strWeb;
    }

    public String getStrMaps() {
        return strMaps;
    }

    public void setStrMaps(String strMaps) {
        this.strMaps = strMaps;
    }
}
