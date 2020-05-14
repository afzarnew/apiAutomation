package com.syscolabs.qe.response.modal;

public class ProjectModel {
    public String profile_image;
    public String employee_name;
    public String employee_salary;
    public int id;
    public int employee_age;


    public String getProfile_image(){
        return profile_image;
    }

    public void setProfile_image(String profile_image){
        this.profile_image=profile_image;
    }

    public String getEmployee_name(){
        return employee_name;
    }

    public void setEmployee_name(String employee_name){
        this.employee_name=employee_name;
    }

    public String getEmployee_salary(){
        return employee_salary;
    }

    public void setEmployee_salary(String employee_salary){
        this.employee_salary=employee_salary;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
    this.id=id;
    }

    public int getEmployee_age(){
        return employee_age;
    }

    public void setEmployee_age(int employee_age){
        this.employee_age=employee_age;
    }


}
