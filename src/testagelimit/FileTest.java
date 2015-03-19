/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testagelimit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author Dark Hells
 */
public class FileTest {
    private static File file = null;
    public  static Vector vector = new Vector();
    
    public  static void getFile(File fs){
       file = fs; 
        System.out.println(file);
        System.out.println(file.getName());
    }  
    
    public static Vector parseFile() throws FileNotFoundException, IOException{
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Cp1251"));
        String s;
        while( (s = reader.readLine()) != null){
            vector.addElement(s);
        }
        return vector;
        
    }
    
}
