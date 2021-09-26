package MyFrames;

import javax.swing.*;

class multi_Window extends JFrame {
    int[][] x,y;
    JButton button;

    multi_Window(){
        super("Multiply");
        int n1=MyWindow.insertN("Insert first matrix row size");
        int m1=MyWindow.insertN("Insert first matrix column size");

        int n2=MyWindow.insertN("Insert second matrix row size");
        int m2=MyWindow.insertN("Insert second matrix column size");

        if(m1!=n2){
            setSize(mainBar.frame.getX(),mainBar.frame.getY());
            setLocationRelativeTo(null);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            new mainBar(this, true);

            String s="It's impossible cause"+'\n'+"first matrix column size must"+'\n'+"be equal to second matrix row size"+'\n';
            s+='\n'+"First matrix column size "+m1;
            s+='\n'+"Second matrix  row  size "+n2;

            JOptionPane.showMessageDialog(null,s,"Error",JOptionPane.WARNING_MESSAGE);
            new MyWindow(300,200);
        }
        else {
            x = new int[n1][m1];
            y = new int[n2][m2];

            int xt, yt, w, h;
            xt = yt = 5;
            w = h = 50;
            int max_n = Math.max(n1, n2);

            setSize((m1 + m2) * w + (m1 + m2 + 1) * xt + 20 + 20, (max_n) * h + (max_n + 1) * yt + 100);
            setLocationRelativeTo(null);
            setTitle("Multiply");
            new mainBar(this, true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);

            button = new JButton("Solve");
            button.setBounds(getWidth() - 100, getHeight() - 70, 80, 20);
            button.setFocusPainted(true);
            button.setFocusable(true);
            button.setEnabled(true);
            add(button);

            JTextField[][] textFields1 = new JTextField[n1][m1];
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    textFields1[i][j] = new JTextField();
                    textFields1[i][j].setBounds(xt + j * (xt + w), yt + i * (yt + h) + 20, w, h);
                    textFields1[i][j].setEnabled(true);
                    textFields1[i][j].setVisible(true);
                    add(textFields1[i][j]);
                }
            }

            JTextField[][] textFields2 = new JTextField[n2][m2];
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    textFields2[i][j] = new JTextField();
                    textFields2[i][j].setBounds(xt + j * (xt + w) + xt + m1 * (xt + w) + 20, yt + i * (yt + h) + 20, w, h);
                    textFields2[i][j].setEnabled(true);
                    textFields2[i][j].setVisible(true);
                    add(textFields2[i][j]);
                }
            }

            button.addActionListener(new multi_button(x,y, textFields1, textFields2));

            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    textFields1[i][j].addKeyListener(new keyAction(textFields1, i, j, button));
                }
            }
            for (int i = 0; i < n2; i++) {
                for (int j = 0; j < m2; j++) {
                    textFields2[i][j].addKeyListener(new keyAction(textFields2, i, j, button));
                }
            }


            JLabel label=new JLabel("X");
            label.setBounds(xt + m1 * (xt + w)+5,n1*h/2,10,10);
            add(label);

            setVisible(true);
        }
    }

}
