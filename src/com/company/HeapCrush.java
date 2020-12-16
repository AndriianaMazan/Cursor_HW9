package com.company;

public class HeapCrush {

    public static void main(String[] args) {
        String testString = "Hi!";

        StringBuilder stringBuilder = new StringBuilder();

        try{
            while(true){
                stringBuilder.append(testString);
            }
        } catch (OutOfMemoryError error){
            String message = error.getMessage();
            System.out.println("This is out of memory error: " +  message);
        } finally {
            System.out.println("\nDone!");
        }
    }
}
