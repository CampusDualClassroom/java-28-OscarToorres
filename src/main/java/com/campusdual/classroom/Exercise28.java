package com.campusdual.classroom;

public class Exercise28 {
    public static void main(String[] args) throws Exception{

        try {
            int[] numero = new int[1];
            System.out.println(numero[3]);
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
}
