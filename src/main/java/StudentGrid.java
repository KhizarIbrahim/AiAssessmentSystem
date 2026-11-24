import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;


public class StudentGrid {
    private static final Color ACTIVE_COLOUR = new Color(255, 220, 150); // orange
    private static final Color IDLE_COLOUR = Color.WHITE;

    private final ArrayList<JPanel> panels = new ArrayList<>();
    private final ArrayList<JLabel> label = new ArrayList<>();

    public StudentGrid(int rows, int cols, int cid){
        Frame frame = new JFrame("Student information");
        frame.setLayout(new GridLayout(rows, cols));

        for (int i = 0, i < cid; i++) {
            JPanel panel = new JPanel();
            JLabel label = new JLabel();
            panel.add(label);
            labels.add(label);

        }

        frame.setSize(900, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }





}
