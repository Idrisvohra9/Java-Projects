import java.awt.*;
import java.awt.event.*;
import java.awt.Window.*;

public class AWT_task2 extends Frame {
    public AWT_task2() {
        setSize(1000,700);
        setTitle("Task 2");
        setVisible(true);
        setLayout(null);
        setBackground(Color.BLUE);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        }
        );
    }
    public static void main(String[] args) {
        AWT_task2 f = new AWT_task2();
        Font header = new Font("Arial", Font.PLAIN,36);
        Font bfont = new Font("Verdana", Font.PLAIN,22);

        Label l1 = new Label("Animation");
        l1.setFont(header);
        l1.setBounds(30, 50, 160, 50);
        l1.setForeground(Color.WHITE);
        f.add(l1);
        
        Button b1 = new Button("ANIMATION");
        b1.setFont(bfont);
        b1.setBounds(30, 120, 300, 35);
        b1.setBackground(Color.WHITE);
        f.add(b1);

        
        Label l2 = new Label("Background");
        l2.setFont(header);
        l2.setBounds(30, 190, 200, 50);
        l2.setForeground(Color.WHITE);
        f.add(l2);

        Button b2 = new Button("BACKGROUND COLOR");
        b2.setFont(bfont);
        b2.setBounds(30, 260, 300, 35);
        b2.setBackground(Color.WHITE);
        f.add(b2);

        Button b3 = new Button("BACKGROUND GRADIENT");
        b3.setFont(bfont);
        b3.setBounds(350, 260, 300, 35);
        b3.setBackground(Color.WHITE);
        f.add(b3);

        Button b4 = new Button("BACKGROUND IMAGE");
        b4.setFont(bfont);
        b4.setBounds(670, 260, 300, 35);
        b4.setBackground(Color.WHITE);
        f.add(b4);


        Label l3 = new Label("Border");
        l3.setFont(header);
        l3.setBounds(30, 330, 200, 50);
        l3.setForeground(Color.WHITE);
        f.add(l3);

        Button b5 = new Button("BORDER");
        b5.setFont(bfont);
        b5.setBounds(30, 400, 300, 35);
        b5.setBackground(Color.WHITE);
        f.add(b5);

        Button b6 = new Button("BORDER IMAGE");
        b6.setFont(bfont);
        b6.setBounds(350, 400, 300, 35);
        b6.setBackground(Color.WHITE);
        f.add(b6);

        Button b7 = new Button("BORDER RADIUS");
        b7.setFont(bfont);
        b7.setBounds(670, 400, 300, 35);
        b7.setBackground(Color.WHITE);
        f.add(b7);

        Button b8 = new Button("BOX RESIZE");
        b8.setFont(bfont);
        b8.setBounds(30, 475, 300, 35);
        b8.setBackground(Color.WHITE);
        f.add(b8);

        Button b9 = new Button("BOX SHADOW");
        b9.setFont(bfont);
        b9.setBounds(350, 475, 300, 35);
        b9.setBackground(Color.WHITE);
        f.add(b9);

        Button b10 = new Button("OUTLINE");
        b10.setFont(bfont);
        b10.setBounds(670, 475, 300, 35);
        b10.setBackground(Color.WHITE);
        f.add(b10);

        Button b11 = new Button("OVERFLOW (X,Y)");
        b11.setFont(bfont);
        b11.setBounds(30, 550, 300, 35);
        b11.setBackground(Color.WHITE);
        f.add(b11);

        Button b12 = new Button("VISIBILITY");
        b12.setFont(bfont);
        b12.setBounds(350, 550, 300, 35);
        b12.setBackground(Color.WHITE);
        f.add(b12);
    }
}
