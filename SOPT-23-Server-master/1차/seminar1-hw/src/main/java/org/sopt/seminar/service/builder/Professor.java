package org.sopt.seminar.service.builder;

public class Professor {
    private int idx;//교수 고유번호
    private String name;//교수 이름
    private String d_name;//교수 학과
    private String subject;//담당 과목
    private int number;//교수 전화번호

    public Professor(final int idx, final String name, final String d_name, final String subject, final int number) {
        this.idx = idx;
        this.name = name;
        this.d_name = d_name;
        this.subject = subject;
        this.number = number;

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

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", d_name='" + d_name + '\'' +
                ", subject='" + subject + '\'' +
                ", number=" + number +
                '}';
    }
}