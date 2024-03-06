/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mar6;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author ahmed
 */
public class Mar6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
FileOutputStream fout1 = new FileOutputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\tt.txt");
FileOutputStream fout2 = new FileOutputStream("C:\\Users\\ahmed\\OneDrive\\Desktop\\try.txt");
   
ByteArrayOutputStream bout = new ByteArrayOutputStream();
bout.write(65);
bout.writeTo(fout1);
bout.writeTo(fout2);

bout.flush();
bout.close();
System.out.println("Success...");

        
        }
    
}
