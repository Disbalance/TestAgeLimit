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
import java.util.ArrayList;


/**
 * Данный класс отвечает за загрузку и разбор файла с вопросами
 * @author Dark Hells
 */
public class FileTest {
    /**
    * Файл, который содержит вопросы
    */
    private static File file = null;
    
    /**
    * Контейнер для вопросов
    */
    public  static ArrayList<String> list = new ArrayList<String>();
    
    /**
     * Загружает файл fs в файл класса FileTest
     * @param fs текстовый файл, содержащий вопросы, переданный с OpenDialog
     * @param file текстовый файл класса
     */
    public  static void getFile(File fs){
        file = fs; 
    }  
    /**
     * Разбирает файл с вопросами построчно, заменяя символ & на '\n' для перевода на новую строку в вектор
     * @return list возвращает список, содержаший вопросы
     */
    public static ArrayList<String> parseFile() throws FileNotFoundException, IOException{
        BufferedReader reader = null;
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "Cp1251"));
        String s;
        while( (s = reader.readLine()) != null){
        char[] ch = s.toCharArray();
        String data = "";
            for(int i=0;i<s.length();i++){
                if (ch[i]=='&'){
                   data+='\n'; 
                   i++;
                }
                data+=ch[i];
            }
            list.add(data);
        }
        return list;
        
    }
    
}
