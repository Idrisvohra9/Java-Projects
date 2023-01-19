import java.awt.*;
import java.awt.event.*;
import java.awt.Window.*;
// We are using Is-a relationship:
public class Form extends Frame
{
    public Form(){
        setSize(640,480);
        setLayout(null);
        setVisible(true);
        setTitle("Form type");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
             }
         }
    );
    }
    public static void main(String[] args) {
        Form f = new Form();
        // int padding=20;
        Font Hfont = new Font("Helvetica",Font.BOLD,36);
        // Instantiating all the labels and setting bounds:
        Label Header = new Label("Form:");
        Header.setFont(Hfont);
        Header.setBounds(10,10,100,100);
        
        Label Name = new Label("Name:");
        Name.setBounds(20,100,50,50);
        Label Email = new Label("Email:");
        Email.setBounds(20,150,50,50);
        Label Address = new Label("Address:");
        Address.setBounds(20,200,50,50);
        Label Country = new Label("Country:");
        Country.setBounds(20,285,50,50);

        // Instantiating other Components:
        TextField name = new TextField(35);
        name.setBounds(100,120,100,20);
        TextField email = new TextField("@gmail.com",35);
        email.setBounds(100,170,100,20);

        TextArea address = new TextArea(5,35);
        address.setBounds(100,220,100,50);

        Checkbox India = new Checkbox("India",true); 
        India.setBounds(100,300,50,20);
        Checkbox Japan = new Checkbox("Japan",true); 
        Japan.setBounds(150,300,50,20);
        Checkbox America = new Checkbox("America",true); 
        America.setBounds(200,300,60,20);

        Button submit = new Button("Submit");
        submit.setBounds(265,440,50,25);
        Button reset = new Button("Reset");
        reset.setBounds(315,440,50,25);
        f.setBackground(Color.MAGENTA);
        submit.setBackground(Color.GRAY);
        reset.setBackground(Color.GRAY);
        f.add(Header);
        f.add(Name);f.add(name);
        f.add(Email);f.add(email);
        f.add(Address);f.add(address);
        f.add(Country);f.add(India);f.add(Japan);f.add(America);
        f.add(submit);
        f.add(reset);
    }

}
