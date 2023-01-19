import java.awt.*;
import java.awt.event.*;// For WindowAdapter
import java.awt.Window.*;// For the windowListener

// In this we are Making a object of Frame That we imported hence it is (Has-a) relationship.
public class Close_frame {
    public Close_frame() {
        Frame f = new Frame();
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setTitle("Box2");
        // This is the code to close the window when the close button is clicked.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
             }
         }
    );
    }
    public static void main(String[] args) {
        Close_frame c= new Close_frame();
    }
}
