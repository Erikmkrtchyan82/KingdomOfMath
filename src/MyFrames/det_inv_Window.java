package MyFrames;

import javax.swing.*;

class det_inv_Window extends JFrame {

    int[][] x;
    JButton button;

    det_inv_Window(String title) {

        int n = MyWindow.insertN("Matrix must be square"+'\n'+"Insert row and column size");

        x = new int[n][n];

        int xt, yt,xx, w, h;
        xx=xt = yt = 5;
        w = h = 50;

        int ww=n * w + (n + 1) * xt + 20;
        if(n<5){
            ww=5*w+(5+1)*xt+20;
            xx=(ww-n*w-(n-1)*xt)/2-xt;
        }

        setSize(ww, n * h + (n + 1) * yt + 100);
        setLocationRelativeTo(null);
        setTitle(title);
        new mainBar(this, true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        button = new JButton("Solve");
        button.setBounds(getWidth() - 100, getHeight() - 70, 80, 20);
        button.setFocusPainted(true);
        button.setFocusable(true);
        button.setEnabled(true);
        add(button);

        JTextField[][] textFields = new JTextField[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                textFields[i][j] = new JTextField();
                textFields[i][j].setBounds(xx + j * (xt + w), yt + i * (yt + h) + 20, w, h);
                textFields[i][j].setEnabled(true);
                textFields[i][j].setVisible(true);
                add(textFields[i][j]);
            }
        }

        button.addActionListener(new det_inv_ButtonAction(this, x, textFields, title));

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                textFields[i][j].addKeyListener(new keyAction(textFields, i, j, button));
            }
        }
        setVisible(true);
    }
}
