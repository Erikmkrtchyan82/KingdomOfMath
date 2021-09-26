package MyFrames;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Math.*;

class multi_button implements ActionListener {
    int[][] x,y;
    JTextField[][] tf1,tf2;

    multi_button(int[][] x,int[][] y,JTextField[][] tf1,JTextField[][] tf2){
        this.x=x;
        this.y=y;
        this.tf1=tf1;
        this.tf2=tf2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                try {
                    x[i][j] = Integer.parseInt(tf1[i][j].getText());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                try {
                    y[i][j] = Integer.parseInt(tf2[i][j].getText());
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        JOptionPane.showMessageDialog(null, MyMath.MultipleOf(x,y), "Multiplied matrix is", JOptionPane.INFORMATION_MESSAGE);
    }
}
