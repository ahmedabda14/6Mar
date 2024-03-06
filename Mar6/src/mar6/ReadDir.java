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
public class ReadDir {
        public static void main(String[]Args){
            File file = null;
            String[]paths;
            try{
                file = new File("C:\\Users\\ahmed\\OneDrive\\Desktop");
                //array of files and directory
                paths=file.list();
                //for each name in the paths array
                for(String path:paths){
                System.out.println(path);
                //prints filename and directory name
                }
            }catch(Exception e){e.printStackTrace();}
        }
}
