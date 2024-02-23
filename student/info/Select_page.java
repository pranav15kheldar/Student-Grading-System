package student.info;

import javax.swing.JFrame;

public class Select_page extends JFrame {
    Select_page() {
        super("Student Information System");

        setSize(600, 600);
        setLocation(500, 150);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Select_page();
    }
}