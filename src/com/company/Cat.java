package com.company;

public class Cat {
    private String name;
    private String model;
    private Long CatId;
    private CatOwner catOwner;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public Long getCatId() {
        return CatId;
    }
    public void setCatId(Long catId) {
        CatId = catId;
    }

    public CatOwner getCatOwner() {
        return catOwner;
    }
    public void setCatOwner(CatOwner catOwner) {
        this.catOwner = catOwner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", CatId=" + CatId +
                ", catOwner=" + catOwner +
                '}';
    }
}
