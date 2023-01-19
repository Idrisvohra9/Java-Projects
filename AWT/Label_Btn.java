import java.awt.*;// For label, buttons.
import java.awt.event.*;// For WindowAdapter
import java.awt.Window.*;// For the windowListener

public class Label_Btn {
    Frame f = new Frame();
    public Label_Btn(){
        f.setSize(640, 480);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Button & label");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        }
    );
    }
    public static void main(String[] args) {
        Label_Btn l = new Label_Btn();
        // Creating objects of labels:
        Label l1 = new Label("Idris vohra."); 
        Label l2 = new Label("Is the author.");
        // Creating objects of buttons:
        Button b1 = new Button("Click me 1st");
        Button b2 = new Button("Click me 2nd");

            
        // Setting bounds:
        l1.setBounds(50,50,200,30);
        l2.setBounds(50,80,200,30);
        b1.setBounds(170,130,150,40);
        b2.setBounds(170,170,150,40);
        
        // Adding it to the frame:
        l.f.add(l1);
        l.f.add(l2);
        l.f.add(b1);
        l.f.add(b2);
    }

}
