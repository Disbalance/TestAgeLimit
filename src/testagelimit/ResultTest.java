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
    static Integer n = 0;
    
     protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = ResultTest.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
     }
     
    public static Integer result(Vector vector){
       for(int i=0;i<vector.size();i++){
           if ((Boolean)vector.get(i)) n = i;
       }
       return n;
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
    
    public static void main(){
        createMessageDialog(0);
        createMessageDialog(1);
        createMessageDialog(2);
        createMessageDialog(3);
        createMessageDialog(4);
    }


}
