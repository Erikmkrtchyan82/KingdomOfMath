package MyFrames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class close implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
