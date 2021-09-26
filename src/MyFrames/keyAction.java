package MyFrames;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class keyAction implements KeyListener {
    int i, j;
    JTextField[][] tf;
    JButton b;

    keyAction(JTextField[][] tf, int i, int j, JButton b) {
        this.tf = tf;
        this.i = i;
        this.j = j;
        this.b = b;
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        try {
            Integer.parseInt(tf[i][j].getText());
            b.setEnabled(true);
        } catch (Exception e) {
            b.setEnabled(false);
        }
    }

    public void keyPressed(KeyEvent ke) {
    }

    public void keyTyped(KeyEvent ke) {
    }
}
