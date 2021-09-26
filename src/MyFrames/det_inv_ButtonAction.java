package MyFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Math.*;

class det_inv_ButtonAction implements ActionListener {
    JFrame f;
    int[][] x;
    JTextField[][] tf;
    String t;

    det_inv_ButtonAction(JFrame f, int[][] x, JTextField[][] tf, String t) {
        this.f = f;
        this.x = x;
        this.tf = tf;
        this.t = t;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                try {
                    x[i][j] = Integer.parseInt(tf[i][j].getText());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        if (t.equalsIgnoreCase("determinant")) {
            JOptionPane.showMessageDialog(null, MyMath.DeterminantOf(x), "Determinant is", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, MyMath.InverseOf(x), "Inversed matrix is", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
