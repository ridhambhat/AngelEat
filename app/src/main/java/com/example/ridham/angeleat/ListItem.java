package com.example.ridham.angeleat;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ListItem {


    private String name;
    private String menu;
    private int image;
    public ListItem(
            String name,String menu,int image) {
        this.name = name;
        this.menu=menu;
        this.image=image;
    }


    public int getImage() {
        return image;
    }



    public String getName() {
        return name;
    }

    public String getMenu() {
        return menu;
    }


}
