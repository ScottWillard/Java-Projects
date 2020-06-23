import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFields extends JDialog {
    JLabel label1 = new JLabel("TextField1");
    JLabel label2 = new JLabel("TextField2");
    JLabel label3 = new JLabel("TextField3");
    JLabel label4 = new JLabel("TextField4");
    JTextField tf1 = new JTextField();
    JTextField tf2 = new JTextField();
    JTextField tf3 = new JTextField();
    JTextField tf4 = new JTextField();
    String[] address = new String[4];
    
    public TextFields(Frame owner, boolean modal) {
        super(owner, modal);
        init();
    }
    
    private void init() {
        this.setTitle("Assignment5");
        this.setLayout(new GridLayout(4, 2));
        this.add(label1);
        this.add(tf1);
        this.add(label2);
        this.add(tf2);
        this.add(label3);
        this.add(tf3);
        this.add(label4);
        this.add(tf4);
    }
    
    public String[] getAddress() {
        address[0] = tf1.getText();
        address[1] = tf2.getText();
        address[2] = tf3.getText();
        address[3] = tf4.getText();
        return address;
    }
}