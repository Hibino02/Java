package com.company;

public class Human
{
    private String name ="";// ตัวแปลซ่อนใว้
    private String lastn ="";
    public String getName(){// ส่งออกข้อมูลจากตัวแปลด้านบน
        return name;
    }
    public void setName(String name){// รับเข้าข้อมูลจาก Main Class
        this.name = name;
    }
    private String lastname ="";
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    private Integer age = 0;
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
}