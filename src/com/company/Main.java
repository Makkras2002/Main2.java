package com.company;
import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte choice;
        Slut_archive slut_repositorium = new Slut_archive();
        System.out.println("Program has started...");
        while(true){
            System.out.println("______________________SlutHouseMenu_________________________");
            System.out.println("1. Add a slut to the Sluthouse.");
            System.out.println("2. Order a slut from the Sluthouse.");
            System.out.println("3. Change information about the slut.");
            System.out.println("4. Show all sluts");
            System.out.println("5. Exit.");
            System.out.println("\n");
            System.out.println("Make a decision...");
            choice =scan.nextByte();
            switch(choice){
                case 1:{
                    String name;
                    int age;
                    String complection;
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println("Write slut's name: ");
                    name = scan1.next();
                    System.out.println("Write slut's age: ");
                    age =scan1.nextInt();
                    System.out.println("Write slut's complexion: ");
                    complection = scan1.next();
                    slut_repositorium.add_slut(name,age,complection);
                    System.out.println("Slut was successfully added to the Sluthouse.");
                    break;
                }
                case 2:{
                    Scanner scan2 = new Scanner(System.in);
                    String name;
                    System.out.println("Write slut's name: ");
                    name = scan2.nextLine();
                    boolean del_check = true;
                    del_check = slut_repositorium.delete_slut_using_name(name);
                    String answer;
                    answer = del_check ? "The slut was successfully ordered": "There is no slut with such name in the Sluthouse";
                    System.out.println(answer);
                    System.out.println(del_check);
                    break;
                }
                case 3:{
                    Scanner scan3 = new Scanner(System.in);
                    String name;
                    int change_parametr;
                    System.out.println("Write slut's name: ");
                    name = scan3.next();
                    System.out.println("______________SlutChangeMenu_________________");
                    System.out.println("1. Change name.");
                    System.out.println("2. Change age.");
                    System.out.println("3. Change complexion.");
                    System.out.println("\n");
                    System.out.println("Make a decision...");
                    change_parametr = scan.nextInt();
                    boolean del_check = false;
                    switch(change_parametr){
                        case 1:{
                            del_check = slut_repositorium.change_slut_using_name(name,1);
                            break;
                        }
                        case 2:{
                            del_check = slut_repositorium.change_slut_using_name(name,2);
                            break;
                        }
                        case 3:{
                            del_check = slut_repositorium.change_slut_using_name(name,3);
                            break;
                        }
                        default:{
                            System.out.println("Such command does not exist.");
                            break;
                        }
                    }
                    String answer;
                    answer = del_check ? "The information was successfully changed": "There is no slut with such name in the Sluthouse";
                    System.out.println(answer);
                    break;
                }
                case 4:{
                    slut_repositorium.show_all_sluts();
                    break;
                }
                case 5:{
                    return;
                }
                default:{
                    System.out.println("Such command does not exist.");
                    break;
                }
            }
        }
    }
}
