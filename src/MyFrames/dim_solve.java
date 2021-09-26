package MyFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class dim_solve implements ActionListener {
    JFrame frame;
    String s;

    dim_solve(JFrame frame, String s) {
        this.frame = frame;
        this.s = s;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        if (s.equalsIgnoreCase("multiply"))
            new multi_Window();
        else
            new det_inv_Window(s);
    }
}
