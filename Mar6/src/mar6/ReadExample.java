/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mar6;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author ahmed
 */
public class ReadExample {
        public static void main(String[] args) throws IOException {
            byte[]buf={35,36,37,38};
            //creates new byte array input stream
            ByteArrayInputStream byt = new ByteArrayInputStream(buf);
            int k=0;
            while((k=byt.read())!=-1){
                //conversion of a byte into a carachter
                char ch = (char)k;
                System.out.println("ASCII value of carachter is:"+k+"; Special carachter is:"+ch);
            }
        }
}
