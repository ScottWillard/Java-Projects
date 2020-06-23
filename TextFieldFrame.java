import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {
    TextFields dialog = new TextFields(this, false);
    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Enter");
    
    public TextFieldFrame(String title) {
        super(title);
        init();
    }
    
    public TextFieldFrame() {
        super();
        init();

        setTitle("Event");
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
        jp.add(jt);
    
    
        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });
    
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });
    
        jp.add(jl);
        add(jp);
    
    }
    
    private void init() {
        this.getContentPane().setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        displayDialog();
    }
    
    private void displayDialog() {
        dialog.setSize(250, 120);
        dialog.setVisible(true);
    }
    
    private static void constructGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        TextFieldFrame frame = new TextFieldFrame();
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("JTextField Test");
        frame.setLayout(new GridLayout(2, 2));
        JDialog.setDefaultLookAndFeelDecorated(true);
        JOptionPane.showMessageDialog(null, "textField: Enter text here: ",
                "Testing JTextField and JPassword", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "textField1: Hello",
                "Testing JTextField and JPassword", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "textField2: Enter text here",
                "Testing JTextField and JPassword", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "textField3: Uneditable text field",
                "Testing JTextField and JPassword", JOptionPane.INFORMATION_MESSAGE);

        
        JLabel label1 = new JLabel("Password:", SwingConstants.LEFT);
        JPasswordField passwordField = new JPasswordField(21);
        frame.add(label1);
        frame.add(passwordField);
        frame.setSize(200, 80);
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> constructGUI());
        TextFieldFrame a = new TextFieldFrame();
    }
}