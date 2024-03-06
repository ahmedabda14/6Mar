/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar6;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ahmed
 */
public class ReadConsole {
            public static void main(String[] args) throws IOException {
                InputStreamReader cin =null;
    try{
        cin = new InputStreamReader(System.in);
        System.out.println("Enter Carachters, q to quit");
        char c;
        do{
            c = (char)cin.read();
            System.out.print(c);
        }while(c!='q');
    }finally{
        if(cin!=null){
            cin.close();
        }
    }            
            }
}
