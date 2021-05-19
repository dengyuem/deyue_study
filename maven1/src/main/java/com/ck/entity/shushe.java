package com.ck.entity;

public class shushe {
    private int id ;
   private String name ;
   private String address ;
   private int peoples ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPeoples() {
        return peoples;
    }

    public void setPeoples(int peoples) {
        this.peoples = peoples;
    }

    public shushe() {
    }

    public shushe(int id, String name, String address, int peoples) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.peoples = peoples;
    }

    @Override
    public String toString() {
        return "shushe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", peoples=" + peoples +
                '}';
    }
}
