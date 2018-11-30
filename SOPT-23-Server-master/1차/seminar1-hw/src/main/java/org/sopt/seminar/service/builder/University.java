package org.sopt.seminar.service.builder;

public class University {
    private int idx;//학과 고유번호
    private  String name;//대학 이름
    private  String address;//대학 주소
    private  int number;//대학 전화번호

    public University(final int idx, final String name, final String address, final int number){
        this.idx=idx;
        this.address=address;
        this.name= name;
        this.number =number;

    }

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

    @Override
    public String toString() {
        return "University{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                '}';
    }
}

