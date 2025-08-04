/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bjc
 */
public class Student_Builder {
    private String id;
    private String name;
    private String fatherName;
    private String studentClass;
    private String address;
    private String contact;
    private String rollNo;
    private String email;
    private String password;

    private Student_Builder(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.fatherName = builder.fatherName;
        this.studentClass = builder.studentClass;
        this.address = builder.address;
        this.contact = builder.contact;
        this.rollNo = builder.rollNo;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getFatherName() { return fatherName; }
    public String getStudentClass() { return studentClass; }
    public String getAddress() { return address; }
    public String getContact() { return contact; }
    public String getRollNo() { return rollNo; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public static class Builder {
        private String id;
        private String name;
        private String fatherName;
        private String studentClass;
        private String address;
        private String contact;
        private String rollNo;
        private String email;
        private String password;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }
        public Builder setStudentClass(String studentClass) {
            this.studentClass = studentClass;
            return this;
        }
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        public Builder setContact(String contact) {
            this.contact = contact;
            return this;
        }
        public Builder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Student_Builder build() {
            return new Student_Builder(this);
        }
    }
}