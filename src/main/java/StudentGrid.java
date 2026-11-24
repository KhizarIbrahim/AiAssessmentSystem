import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class StudentGrid {
    private static final Color ACTIVE_COLOUR = new Color(255, 220, 150); // orange
    private static final Color IDLE_COLOUR = Color.WHITE;

    private final JFrame frame = new JFrame("Student information");
    private final String[] bays;
    private final JPanel[] panels;
    private final JLabel[] labels;
    private final WardScheduler scheduler;

}
