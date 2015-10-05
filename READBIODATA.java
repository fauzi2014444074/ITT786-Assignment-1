/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Fortesys
 */
public class READBIODATA {
     public static void main(String[] args) {
        FileInputStream in = null;
        try {
            in = new FileInputStream("C:/Users/Fortesys/Desktop/AhmadFauzi.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException F) {
           System.err.println(F);
        }
    }
}
