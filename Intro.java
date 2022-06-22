import javax.swing.*;
import java.awt.*;

public class Intro extends JFrame {
    JPanel rootPanel = new JPanel(  null);

    public Intro() {
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize( 500, 400);
        setLocationRelativeTo(null);//this will center the window
        setUp();
        setIconImage(Toolkit.getDefaultToolkit().getImage(  "C:\\Users\\Swapnil\\Documents\\GitHub\\res\\White logo - no background.png"));
        add(rootPanel);
    }
    public void setUp(){
        rootPanel.setBackground(Color.darkGray);
        JLabel heading= new JLabel(  "TEAM LEAD TOOL");
        heading.setOpaque(true);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        heading.setForeground(Color.white);
        heading.setBackground(rootPanel.getBackground());
        Dimension d= heading.getPreferredSize();
        heading.setBounds( 250-(d.width/2),  30, d.width, d.height);
        rootPanel.add(heading);
        JLabel icon= new JLabel (new ImageIcon("C:\\Users\\Swapnil\\Documents\\GitHub\\res\\White logo - no background.png"));
        icon.setOpaque(true);
        icon.setBackground(Color.darkGray);
        icon.setBounds(250-100, 150, 200, 200);
        rootPanel.add(icon);
    }

}