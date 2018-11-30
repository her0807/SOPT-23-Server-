package org.sopt.seminar.service.builder;

public class UniversityBuilder {
    private int idx;//학과 고유번호
    private  String name;//대학 이름
    private  String address;//대학 주소
    private  int number;//대학 전화번호

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public University build(){
        return new University(this.idx,this.name,this.address,this.number);
    }
}