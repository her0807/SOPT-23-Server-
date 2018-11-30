package org.sopt.seminar.service.builder;

public class StudentBuilder {
    private int idx;//학번
    private String name;//이름
    private int level;//학년
    private String email;//이메일
    private String address;//주소
    private int age;//나이
    private String register;//학적상태

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public Student build() {
        return new Student(this.idx, this.name, this.level, this.email, this.address, this.age, this.register);
    }
}