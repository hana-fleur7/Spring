package com.example.demo.form;

public class ReceiveForm {
    private String name;
    private String age;

    public String getName(){
        return name;
    }

    public void setName(String name){

    }
    
    public String getAge(){
        return age;
    }

    public void setAge(String age){
    }
    
    @Override
    public String toString(){
        return "ReceiveForm[name=" + name + ", age=" + age +"]";
    }
}
