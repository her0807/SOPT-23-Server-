package org.sopt.seminar.service.builder;

public class Department {
    private int idx;//학과 고유번호
    private  String name;//학과 이름
    private  String type;//학과 타입
    private  int number;//학과 전화번호

    public Department(final int idx, final String name, final String type,final int number){
        this.idx=idx;
        this.name=name;
        this.type=type;
        this.number=number;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Department{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", number=" + number +
                '}';
    }
}

