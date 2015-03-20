/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testagelimit;


import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Данный класс генерирует результаты теста по полученный ответам на вопросы от пользователя
 * @author Dark Hells
 */
public class ResultTest {
    /**
     * Содержит иконку представляющую собой изображение
     */
    static ImageIcon icon;
    /**
     * Содержит результат после анализа списка ответов
     */
    static Integer n = -1;
    
    /**
     * Загружает иконку в соответствии с результатом теста
     * @param path хранит путь к изображения
     * @return само изображение
     */
     protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ResultTest.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
     }
    
     /**
      * Анализирует список ответов
      * @param vector содержит ответы пользователя на вопросы
      */
    public static void result(ArrayList<Boolean> list){
       for(int i=0;i<list.size();i++){
           if ((Boolean)list.get(i)) n = i;
       }
       if(n==-1){
           JOptionPane.showMessageDialog(null, "Пожалуйста, дайте ответ положительный ответ хотя бы на один из вопросов", "Уведомление", 1);
           return;
       }
       createMessageDialog(n);
    }
    
 /**
  * Генерирует уведомление согласно результатам теста
  * @param n содержит результат согласно теста
  */
    public static void createMessageDialog(int n){
        switch(n){
            case 0: { 
                icon = createImageIcon("source/icon0.jpg");
                break;
            }
            case 1: { 
                icon = createImageIcon("source/icon6.jpg");
                break;
            }
          case 2: { 
                icon = createImageIcon("source/icon12.jpg");
                break;
            }
           case 3: { 
               
                icon = createImageIcon("source/icon16.jpg");
                break;
            }
           case 4: { 
                icon = createImageIcon("source/icon18.jpg");
                break;
            }
           default: System.err.println("Error");
        
        }
        JOptionPane.showMessageDialog(null, "Рекомендуемое возрастное ограничение", "Результат", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
