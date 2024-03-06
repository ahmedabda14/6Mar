/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ahmed
 */
public class task {
                public static void main(String[] args) throws IOException {
    String io = "C:\\Users\\ahmed\\OneDrive\\Desktop\\tt.txt";
        String output = "C:\\Users\\ahmed\\OneDrive\\Desktop\\loe.txt";
try{
    removeSpecialCharacters(io, output);
    System.out.println("\"Special carachters removed\"");
}catch(IOException e){System.out.println(e.getMessage());}
                    
                }
private static void removeSpecialCharacters(String io, String output) throws IOException{
try(BufferedReader reader = new BufferedReader(new FileReader(io));
    BufferedWriter writer  = new BufferedWriter(new FileWriter(output))){
    String line;
    while((line = reader.readLine())!=null){
        String cleanedLine = removeSpecialCharactersFromLine(line);
        writer.write(cleanedLine);
        writer.newLine();
    }
    
}     
    }

    private static String removeSpecialCharactersFromLine(String line) {
return line.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\s+", "");
    }
    
}
