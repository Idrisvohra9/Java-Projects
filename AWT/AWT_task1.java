import java.awt.*;
import java.awt.event.*;
import java.awt.Window.*;

public class AWT_task1 extends Frame
{
    public static void main(String[] args)
    {
        AWT_task1 main=new AWT_task1();

        main.setSize(600,600);
        main.setLayout(null);
        main.setVisible(true);
        main.setTitle("Task1");
        main.setBackground(Color.CYAN);

        Label lab1,lab2,lab3,lab4,lab5;

        lab1=new Label("Selected file: ");
        lab1.setBounds(30,50,80,20);
        TextField tf1,tf2,tf3,tf4;
        
        tf1=new TextField("C:\\Program File (x86)\\XFILESIST4UNSmain.000");
        tf1.setBounds(120,50,300,20);

        lab2=new Label("File type:");
        lab2.setBounds(50,80,60,20);

        tf2=new TextField("double click file name to get file type");
        tf2.setBounds(120,80,300,20);

        lab3=new Label("Key word status:");
        lab3.setBounds(10,110,90,20);

        tf3=new TextField("chose an 'ID' keyword below and double click file name.");
        tf3.setBounds(120,110,300,20);

        lab4=new Label("Patient name: ");
        lab4.setBounds(30,140,80,20);

        tf4=new TextField("chosen an 'ID' keyword below and double click file name");
        tf4.setBounds(120,140,300,20);

        Label line=new Label("__________________________________________________________________________________________");

        line.setBounds(0,160,900,30);

        lab5=new Label("Choose a keyword from the list");
        lab5.setBounds(30,190,170,20);

        Button btn1,btn2,btn3,btn4;

        btn1=new Button("Instructions");
        btn1.setBounds(220,190,100,20);
        btn1.setBackground(Color.WHITE);

        btn2=new Button("Rational");
        btn2.setBounds(350,190,100,20);
        btn2.setBackground(Color.WHITE);

        CheckboxGroup chb;
        chb=new CheckboxGroup();

        Checkbox chb1,chb2;
        
        chb1=new Checkbox("PATIENT ID",chb,true);
        chb1.setBounds(30,220,200,30);
        chb1.setBackground(Color.white);

        chb2=new Checkbox("SAMPLE ID",chb,false);
        chb2.setBounds(30,250,200,30);
        chb2.setBackground(Color.WHITE);

        btn3=new Button("Start 'X-ing' |");
        btn3.setBounds(30,300,200,20);
        btn3.setBackground(Color.WHITE);

        btn4=new Button("Exit");
        btn4.setBounds(30,340,80,20);
        btn4.setBackground(Color.WHITE);

        main.add(lab1);
        main.add(tf1);
        main.add(lab2);
        main.add(tf2);
        main.add(lab3);
        main.add(tf3);
        main.add(lab4);
        main.add(tf4);
        main.add(line);
        main.add(lab5);
        main.add(btn1);
        main.add(btn2);
        main.add(chb1);
        main.add(chb2);
        main.add(btn3);
        main.add(btn4);
        main.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                main.dispose();
            }
        });
    }
}