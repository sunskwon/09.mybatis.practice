package com.ohgiraffers;

import java.sql.Date;

public class EmployeeDTO {

    private int id;
    private String name;
    private String no;
    private String email;
    private String phone;
    private String jobCode;
    private String salLevel;

    public EmployeeDTO() {}

    public EmployeeDTO(int id, String name, String no, String email, String phone, String jobCode, String salLevel) {
        this.id = id;
        this.name = name;
        this.no = no;
        this.email = email;
        this.phone = phone;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
    }

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

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobCode() { return jobCode; }

    public void setJobCode(String jobCode) { this.jobCode = jobCode; }

    public String getSalLevel() { return salLevel; }

    public void setSalLevel(String salLevel) { this.salLevel = salLevel; }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                '}';
    }
}
