
package timergui;

import java.awt.Color;
import java.awt.Toolkit;

public class TimerGUI {

    public static void main(String[] args) {
        
        timerFrame game = new timerFrame();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        game.setSize(xSize,ySize);
        game.getContentPane().setBackground(Color.decode("#05F9ED"));
        
        game.setVisible(true);
        
    }
    
}
