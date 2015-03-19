/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testagelimit;

import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dark Hells
 */
public class ResultTest {
    static ImageIcon icon;
    static Integer n = -1;
    
     protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ResultTest.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
     }
     
    public static void result(Vector vector){
       for(int i=0;i<vector.size();i++){
           if ((Boolean)vector.get(i)) n = i;
       }
       if(n==-1){
           JOptionPane.showMessageDialog(null, "Пожалуйста, дайте ответ положительный ответ хотя бы на один из вопросов", "Уведомление", 1);
           return;
       }
       createMessageDialog(n);
    }
    

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
