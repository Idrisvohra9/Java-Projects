import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Console extends KeyAdapter implements ActionListener, KeyListener {

    // Default Font Size for text
    int fsize = 15;

    // Adding Textarea.

    private JTextArea area;
    private JScrollPane scpane;
    String text = "";
    int cl;
    int linecount;

    // Creating Frame.
    JFrame f = new JFrame("Aryan's Console");

    JTextField title;
    JPanel bottomPanel;
    JLabel detailsOfFile;
    JScrollPane sb;
    JMenuItem exit, copy, paste, cut;

    public Console() {
        // Calling initUI() method
        initUI();
        // Calling addActionEvents() method to add events
        addActionEvents();
    }

    public void actionPerformed(ActionEvent ae) {
        // if exit option is choosen
        if (ae.getActionCommand().equals("Exit")) {
            // Destroying/Closing the frame/window
            f.dispose();
        }
        // if copy option is choosen
        else if (ae.getActionCommand().equals("Copy")) {
            // Getting Selected Selected Text
            text = area.getSelectedText();
        } // if paste option is choosen
        else if (ae.getActionCommand().equals("Paste")) {
            area.insert(text, area.getCaretPosition());
        } // if cut option is choosen
        else if (ae.getActionCommand().equals("Cut")) {
            text = area.getSelectedText();
            area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        // Calculating length and count of words
        cl = area.getText().length();
        linecount = area.getLineCount();
        detailsOfFile.setText("Length: " + cl + " Line: " + linecount);
    }

    private void initUI() {
        detailsOfFile = new JLabel();

        bottomPanel = new JPanel();

        // TextArea

        area = new JTextArea("");

        area.append("C-OS [Version 10.0.22000.678]\n"
                + "(c) Alpha Corporation. All rights reserved.\n"
                + "\n"
                + "C:\\Users\\aryan>");
        area.setSelectionStart(area.getText().length());

        // Default font will be sam_serif and default font style will be plain and
        // default style will be 20.
        area.setFont(new Font("Serif", Font.PLAIN, 24));

        // Sets the line-wrapping policy of the text area
        area.setLineWrap(true);

        // Sets the word-wrapping policy of the text area
        area.setWrapStyleWord(true);

        // Sets Background color
        area.setBackground(Color.black);
        area.setForeground(Color.white);

        // Creating Scrollables around textarea
        scpane = new JScrollPane(area);

        // Creating border for scrollpane
        scpane.setBorder(BorderFactory.createEmptyBorder());
        bottomPanel.add(detailsOfFile);

        // Set Size
        f.setSize(1000, 700);

        // Set layout
        f.setLayout(new BorderLayout());

        // Add frame
        f.add(scpane, BorderLayout.CENTER);
        f.add(bottomPanel, BorderLayout.SOUTH);
        // f.getCursor();
        // Frame visible to aryan :|
        f.setVisible(true);

        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0));
        // Assigning shortcut "Cntrl + C" for "Copy" Menu Item
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        // Assigning shortcut "Cntrl + V" for "Paste" Menu Item
        paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
        // Assigning shortcut "Cntrl + X" for "Cut" Menu Item
        cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));

    }

    private void addActionEvents() {
        exit.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);

    }

    public static void main(String ar[]) {
        // TODO code application logic here
        Console jai = new Console();

    }

}