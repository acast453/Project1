

import javax.swing.*;

public class Assignment1Framework
{
    public static void main(String[] args)
    {
        new Assignment1Framework();
    }
    
    public Assignment1Framework()
    {        
        //Defining the geometric objects that represent the problem data
        Rectangle[] rArray = new Rectangle[8];
        
        Point p = new Point(5, 6);
        Point q = new Point(10, 370);
        rArray[0] = new Rectangle(p, q); //Florida Turnpike
        
        p = new Point(10, 13);
        q = new Point(420, 26);
        rArray[1] = new Rectangle(p, q); //8th st.

        p = new Point(421, 10);
        q = new Point(430, 410);
        rArray[2] = new Rectangle(p, q); //107th Ave.


        p = new Point(97, 254);
        q = new Point(124, 293);
        rArray[3] = new Rectangle(p, q);

        p = new Point(109, 208);
        q = new Point(152, 243);
        rArray[4] = new Rectangle(p, q);

        p = new Point(66, 111);
        q = new Point(84, 141);
        rArray[5] = new Rectangle(p, q);

        p = new Point(89, 123);
        q = new Point(102, 152);
        rArray[6] = new Rectangle(p, q);

        p = new Point(157, 338);
        q = new Point(203, 391);
        rArray[7] = new Rectangle(p, q);


        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, rArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
