import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame {
    JPanel rootPanel = new JPanel(null);
    public Home() {
        setResizable(false);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage( "C:\\Users\\Swapnil\\Documents\\GitHub\\res\\White logo - no background.png"));
        setLocationRelativeTo(null);
        createLeftBar();
        createRight();
        add(rootPanel);
    }
    public void createLeftBar(){
        JPanel panel = new JPanel(null);
        panel.setOpaque(true);
        panel.setBackground(Color.darkGray);
        panel.setBounds(0,0,300,600);
        JLabel heading = new JLabel("TEAM LEAD TOOL");
        heading.setOpaque(true);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        heading.setForeground(Color.white);
        heading.setBackground(Color.darkGray);
        Dimension d= heading.getPreferredSize();
        heading.setBounds( 150-(d.width/2), 30, d.width, d.height);
        panel.add(heading);
        JLabel icon = new JLabel(new ImageIcon("C:\\Users\\Swapnil\\Documents\\GitHub\\res\\White logo - no background.png"));
        icon.setOpaque(true);
        icon.setBackground(Color.darkGray);
        icon.setBounds(150-100, 250, 200, 200);
        panel.add(icon);
        rootPanel.add(panel);
    }
    public void createRight(){
        JLabel heading = new JLabel("LOGIN");
        heading.setOpaque(true);
        heading.setForeground(Color.darkGray);
        heading.setFont(new Font(Font.MONOSPACED,Font.PLAIN, 20));
        Dimension d= heading.getPreferredSize();
        heading.setBounds(300+(150-(d.width/2)),30, d.width,d.height);// as the middle of JFrame is 300
        rootPanel.add(heading);
        JButton loginAsMember = new JButton("Login as Member");
        loginAsMember.setFocusable(false);
        loginAsMember.setOpaque(true);
        loginAsMember.setBackground(Color.darkGray);
        loginAsMember.setForeground(Color.white);
        loginAsMember.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsMember.setBounds(300+(150-100), 200, 200, 40);
        loginAsMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memberLoginOption loginOption = new memberLoginOption();
                loginOption.setVisible(true);
            }
        });
        rootPanel.add(loginAsMember);
        JButton loginAsTeamlead = new JButton("Login as Team-lead");
        loginAsTeamlead.setFocusable(false);
        loginAsTeamlead.setOpaque(true);
        loginAsTeamlead.setBackground(Color.darkGray);
        loginAsTeamlead.setForeground(Color.white);
        loginAsTeamlead.setFont(new Font("Calibri", Font.PLAIN, 20));
        loginAsTeamlead.setBounds(300+(150-100), 400, 200, 40);
        rootPanel.add(loginAsTeamlead);


    }
}

