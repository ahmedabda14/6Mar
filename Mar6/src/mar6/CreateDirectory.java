/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar6;

import java.io.File;

/**
 *
 * @author ahmed
 */
public class CreateDirectory {
    public static void main(String[]Args){
        String dirname= "C:\\Users\\ahmed\\OneDrive\\Desktop";
        File d = new File(dirname);
        
        //Create directory now
        d.mkdirs();
    }
}
