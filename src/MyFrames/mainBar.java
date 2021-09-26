package MyFrames;

import javax.swing.*;

class mainBar extends JMenuBar {
    public static JFrame frame;
    int width = 300;
    int height = 200;

    mainBar(JFrame frame, boolean t) {
        super();
        mainBar.frame = frame;

        if (!t) {
            JMenu open = new JMenu("Functions");

            JMenuItem det = new JMenuItem("Determinant");
            JMenuItem inv = new JMenuItem("Inverse");
            JMenuItem multi = new JMenuItem("Multiply");

            det.addActionListener(new dim_solve(frame, "Determinant"));
            open.add(det);

            inv.addActionListener(new dim_solve(frame, "Inverse"));
            open.add(inv);

            multi.addActionListener(new dim_solve(frame, "Multiply"));
            open.add(multi);

            add(open);
        }
        if (t) {
            JMenuItem back = new JMenuItem("Go back");
            back.addActionListener(new mainMenu(frame, width, height));
            add(back);
        }
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new close());
        add(exit);

        setBounds(1, 1, frame.getWidth() - 1, 20);

        frame.add(this);
    }
}
