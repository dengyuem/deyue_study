package com.ck.entity;

import java.util.List;

public class Booktype {
   private int  btid;
  private String btname;
   private List<Bookinfo> bookinfoList;

    public List<Bookinfo> getBookinfoList() {
        return bookinfoList;
    }

    public void setBookinfoList(List<Bookinfo> bookinfoList) {
        this.bookinfoList = bookinfoList;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }

    @Override
    public String toString() {
        return "Booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                ", bookinfoList=" + bookinfoList +
                '}';
    }
}
