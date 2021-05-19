package com.ck;

public class Student {
private int id;
private String name;
private String sex;
private int age;
private int goodsId;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public Student() {
    }

    public Student(int id, String name, String sex, int age, int goodsId) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.goodsId = goodsId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", goodsId=" + goodsId +
                '}';
    }
}
