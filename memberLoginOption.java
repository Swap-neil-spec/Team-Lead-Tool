import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class memberLoginOption extends JFrame {

    JPanel rootPanel = new JPanel(null);

    public memberLoginOption(){
        setUndecorated(true);
        setVisible(true);
        setResizable(false);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Swapnil\\Documents\\GitHub\\res\\White logo - no background.png"));
        setUp();
        add(rootPanel);
    }
    public void setUp(){
        JLabel heading = new JLabel("OPTIONS");
        heading.setOpaque(true);
        heading.setForeground(Color.darkGray);
        heading.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 20));
        Dimension d = heading.getPreferredSize();
        heading.setBounds(200-(d.width/2), 30, d.width, d.height);
        rootPanel.add(heading);
        JButton createAccount = new JButton("CREATE ACCOUNT");
        createAccount.setFocusable(false);
        createAccount.setOpaque(true);
        createAccount.setFont(new Font("Calibri", Font.PLAIN, 20));
        createAccount.setBackground(Color.darkGray);
        createAccount.setForeground(Color.white);
        createAccount.setBounds(200-100, 150, 200, 40);
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateAccount window = new CreateAccount();
                window.setVisible(true);
            }
        });
        rootPanel.add(createAccount);
        JButton login = new JButton("LOGIN");
        login.setFocusable(false);
        login.setOpaque(true);
        login.setForeground(Color.white);
        login.setBackground(Color.darkGray);
        login.setBounds(200-100, 250, 200, 40);
        login.setFont(new Font("Calibri", Font.PLAIN, 20));
        rootPanel.add(login);
    }
}
