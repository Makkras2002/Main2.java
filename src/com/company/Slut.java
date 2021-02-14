package com.company;

public class Slut {
    String slut_name;
    String slut_complection;
    int slut_age;
    public void give_slut_stats(String slut_name,int slut_age,String slut_complection){
        this.slut_name = slut_name;
        this.slut_age =slut_age;
        this.slut_complection = slut_complection;
    }
    public void show_slut_stats(){
        System.out.println(slut_name+"                   "+slut_age+"                    "+slut_complection);
    }
    public void change_slut_name(String slut_name){
        this.slut_name = slut_name;
    }
    public void change_slut_age(int slut_age){
        this.slut_age =slut_age;
    }
    public void change_slut_complection(String slut_complection){
        this.slut_complection = slut_complection;
    }


}
