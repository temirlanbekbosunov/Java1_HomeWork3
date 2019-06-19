package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in=  new Scanner(System.in);
        Random random = new Random();

        System.out.print("what's your name? ");
        String name= in.nextLine();

        int min = 1;
        int max = 107;
        int diff =max-min;
        int age = random.nextInt(diff+1);
        age +=min;
        System.out.println(name+"'s age: "+age);

        System.out.print("how many degrees celsius today on the street? ");
        int temperature = in.nextInt();
        System.out.println(" ");
        if(age>0&&age<20&&temperature>0&&temperature<28){
            System.out.println(name+" goes to visit a friend");
        }else if(age>=20&&age<=45&&temperature>=20&&temperature<=30){
            System.out.println(name+" goes to visit a friend");
        }else if (age>45&&age<107&&temperature>=10&&temperature<=25){
            System.out.println(name+" goes to visit a friend");
        }else {
            System.out.println(name+" does not go for a walk");
        }

    }
}
