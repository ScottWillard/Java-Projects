import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.awt.*;
import java.util.*;

public class JFrame{
    
        public static void main(String[] args){
    
        JFrame frame = new JFrame();

    
        class exitaction implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }
  
    }
}