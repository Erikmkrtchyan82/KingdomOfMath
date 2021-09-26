package MyFrames;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow(int width, int height) {

        String title="Mathematics";
        setSize(width, height);
        setLocationRelativeTo(null);
        setTitle(title);
        new mainBar(this, false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String str = "Kingdom of MATH".toUpperCase();
        JLabel lb = new JLabel(str, JLabel.LEFT);
        Font f = new Font("Arial", Font.BOLD, 20);
        lb.setFont(f);
        lb.setBounds(width / 2 - str.length()*7, height / 3, str.length()*20, 20);

        add(lb);

        setVisible(true);
    }

    public static int insertN(String k) {
        String str;
        int n = 0;
        do {
            try {
                str = JOptionPane.showInputDialog(k);
                if (str == null)
                    System.exit(0);
                n = Integer.parseInt(str);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (n < 2 || n > 10);
        return n;
    }
}

