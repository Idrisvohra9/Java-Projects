import java.awt.*;// For frame

// In order to use AWT toolkit we need to import it first.
// We can use any Has-a or Is-a relationship to ivolve the Containers to the class.
// In this case we are using inheritance (Is-a) relationship.
public class Frame_instantiate extends Frame{

    public Frametest(){
        // These are the components required to make the use of the containers.
        setSize(500, 500);// Sets the size of the frame in pixels(x,y).
        setLayout(null);// Sets the layout of the frame
        setVisible(true);// Sets the visibility of the frame by default it is hidden
        setTitle("Box");// Sets the title of the frame
    }
    public static void main(String[] args) {
        Frame_instantiate fI =new Frame_instantiate();
        fI.Frametest();
    }
}
