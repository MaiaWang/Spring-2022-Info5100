package com.company;

public class Department {
    private String deptName;
    private int deptID;

    public Department(String deptName, int deptID){
        this.deptID = deptID;
        this.deptName = deptName;

    }

    public String getDeptName() {
        return deptName;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }
}
