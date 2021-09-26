package MyFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class mainMenu implements ActionListener {
    JFrame frame;
    int w, h;

    mainMenu(JFrame frame, int w, int h) {
        this.frame = frame;
        this.w = w;
        this.h = h;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        new MyWindow(w, h);
    }
}
