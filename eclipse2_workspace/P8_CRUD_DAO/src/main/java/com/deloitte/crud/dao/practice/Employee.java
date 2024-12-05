package com.deloitte.crud.dao.practice;

public class Employee {
    private int emp_id;
    private String emp_name;
    private String emp_dept;

    // Constructor to initialize Employee object
    public Employee(int empId, String empName, String empDept) {
        this.emp_id = empId;
        this.emp_name = empName;
        this.emp_dept = empDept;
    }

    // Getter and Setter for emp_id
    public int getEmpId() {
        return emp_id;
    }

    public void setEmpId(int empId) {
        this.emp_id = empId;
    }

    // Getter and Setter for emp_name
    public String getEmpName() {
        return emp_name;
    }

    public void setEmpName(String empName) {
        this.emp_name = empName;
    }

    // Getter and Setter for emp_dept
    public String getEmpDept() {
        return emp_dept;
    }

    public void setEmpDept(String empDept) {
        this.emp_dept = empDept;
    }

}
