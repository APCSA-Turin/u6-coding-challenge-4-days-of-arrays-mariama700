package com.example.project;

public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};
    public static String generateElfName(String name){
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        int randomInt = (int) (Math.random() * elf_names.length);
        return elf_names[randomInt] + " " + name;  
    }
}