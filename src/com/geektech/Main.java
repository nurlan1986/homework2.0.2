package com.geektech;

import java.util.Random;

public class Main {

    private static String home;

    public static void main(String[] args) {
        System.out.println(ageAndDegree(generateRandomAge(), 21));
        System.out.println(ageAndDegree(generateRandomAge(),20));
        System.out.println(ageAndDegree(generateRandomAge(),28));
        System.out.println(ageAndDegree(generateRandomAge(),-40));
        System.out.println(ageAndDegree(generateRandomAge(),55));





    }

    public static  String ageAndDegree(int age, int degree){
        if ((age > 20 && age < 46) && (degree > -20 && degree < 30)){
            return "Можно гулять!";
        } else if (age < 20 && degree >0 && degree < 28){
            return "Можно идти гулять";
        } else if (age > 45 && degree > -10 && degree < 25){
            return "Гуляй смело";
        }else{
            String home = ("Оставайтесь дома");
            return home;}

    }
    public static int generateRandomAge(){
        Random random=new Random();
        int age;
        age=random.nextInt(50);
        return age;
    }
}
