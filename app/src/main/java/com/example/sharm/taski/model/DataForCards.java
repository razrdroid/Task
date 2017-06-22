package com.example.sharm.taski.model;

/**
 * Created by sharm on 22-06-2017.
 */

public class DataForCards {
    String description;
    int icon;
    int background;

    public DataForCards(String description, int icon, int background) {
        this.description = description;
        this.icon = icon;
        this.background = background;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }
}
