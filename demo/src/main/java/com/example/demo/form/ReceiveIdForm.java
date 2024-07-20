package com.example.demo.form;

public class ReceiveIdForm {
    private String name;
    private String age;

    public String getName(){
        return name;//nameを取得して返すメソッド
    }

    public void setName(String name){
        this.name = name;//取得したnameをセット

    }
    
    public String getAge(){
        return age;//ageを取得して返すメソッド
    }

    public void setAge(String age){
        this.age = age;//取得したageをセット
    }
    
    @Override//toStringメソッドをオーバーライドして、整列表示させる
    public String toString(){
        return "ReceiveForm[name=" + name + ", age=" + age +"]";
    }
}
