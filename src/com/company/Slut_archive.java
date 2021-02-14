package com.company;

import java.util.Scanner;

public class Slut_archive {
    static int slut_counter = 0;
    Slut[] slut_array =new Slut[30];
    public void add_slut(String slut_name,int slut_age,String slut_complection){
        slut_array[slut_counter] = new Slut();
        slut_array[slut_counter].give_slut_stats(slut_name,slut_age,slut_complection);
        slut_counter++;
    }
    public boolean delete_slut_using_name(String a){
        int temp_counter =0;
        boolean sign_of_match =false;
        while(temp_counter<slut_counter){
            if(a.equals(slut_array[temp_counter].slut_name)){
                sign_of_match =true;
            }
            if(sign_of_match && temp_counter<slut_counter-1){
                slut_array[temp_counter] = slut_array[temp_counter+1];
            }
            if(sign_of_match && temp_counter==slut_counter-1){
                slut_array[temp_counter] =null;
            }
            temp_counter++;
        }
        if (sign_of_match){
            slut_counter--;
        }
        return sign_of_match;
    }
    public boolean change_slut_using_name(String a,int parametr_of_change){
        int temp_counter =0;
        boolean sign_of_match =false;
        while(temp_counter<slut_counter){
            if(a.equals(slut_array[temp_counter].slut_name)){
                sign_of_match =true;
                switch(parametr_of_change){
                    case 1:{
                        String name;
                        Scanner in = new Scanner(System.in);
                        System.out.println("Write slut's name: ");
                        name = in.next();
                        slut_array[temp_counter].change_slut_name(name);
                        break;
                    }
                    case 2:{
                        int age;
                        Scanner in = new Scanner(System.in);
                        System.out.println("Write slut's age: ");
                        age = in.nextInt();
                        slut_array[temp_counter].change_slut_age(age);
                        break;
                    }
                    case 3:{
                        String complection;
                        Scanner in = new Scanner(System.in);
                        System.out.println("Write slut's complexion: ");
                        complection = in.next();
                        slut_array[temp_counter].change_slut_complection(complection);
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }
            temp_counter++;
        }
        return sign_of_match;
    }
    public void show_all_sluts(){
        System.out.println("Name                     Age                        Complexion");
        System.out.println("______________________________________________________________");
        int temp_counter =0;
        while(temp_counter<slut_counter){
            slut_array[temp_counter].show_slut_stats();
            temp_counter++;
        }
    }

}
