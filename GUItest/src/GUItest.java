import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUItest extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JTextField textField1;

    public GUItest() {
        setContentPane(panel1);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ok");
                JOptionPane.showMessageDialog(button1,textField1.getText()+" take it");
            }
        });
    }
}
