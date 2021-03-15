package org.example;

import java.io.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        File newFile = new File("C:\\The cradle of test files\\File1.txt");
        createFile(newFile);
        gettingTheAbsoluteRoute(newFile);
        writeContent(newFile, "Hi there");
        fileReader(newFile);
    }

    public static void createFile(File newFile) {
        try{
            if(newFile.createNewFile()){
                System.out.println(" \nCreating a new File, please wait...");
                System.out.println("¡A new file was born!... Baptized as: " + newFile.getName() + "\n \n");
            }
        }catch(IOException e){
            System.out.println("¡Error alert!... Cannot create... " + e.getMessage());
        }
    }

    public static void writeContent(File targetFile, String content2Write){
        FileWriter writer = null;

        try{
            writer = new FileWriter(targetFile);
            writer.write(content2Write);
            System.out.println("Writing in: " + targetFile.getName() + ", please wait... ");
            System.out.println("¡Content written in file: " + targetFile.getName() + "! \n \n");
        }catch(IOException e){
            System.out.println("¡Error alert!... Cannot write... " + e.getMessage());
        }finally{
            try{
                if( null != writer ){
                    writer.close();
                }
            }catch (Exception e2){
                System.out.println("¡Error alert!... Cannot close writer... " + e2.getMessage());
            }
        }
    }

    public static void fileReader(File targetFile){
        FileReader reader = null;
        BufferedReader buffer = null;

        try{
            reader = new FileReader(targetFile);
            buffer = new BufferedReader(reader);

            String line;
            System.out.println("¡Reading: " + targetFile.getName() + "! \n \n");

            while((line=buffer.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("¡Error alert!... Cannot read... " + e.getMessage());
        }finally{
            try{
                if( null != reader ){
                    reader.close();

                }
            }catch (Exception e2){
                System.out.println("¡Error alert!... Cannot close reader... " + e2.getMessage());
            }
        }
    }

    public static void gettingTheAbsoluteRoute(File targetFile){
        try {
            System.out.println("The file: " + targetFile.getName() + " is in the route: " + targetFile.getAbsolutePath() + "\n \n");
        } catch (SecurityException e) {
            System.out.println("¡Error alert!... Cannot get the route... " + e.getMessage());
        }
    }
}
