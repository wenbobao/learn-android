package cn.wenbobao.recyclerviewtest;

/**
 * Created by bob on 2018/2/25.
 */

public class Fruit {

    private String name;

    private  int imageId;

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }
}
