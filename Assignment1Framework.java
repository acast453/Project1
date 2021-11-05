/**
 * Anthony Castillo
 * Panther Id: 5910063
 *
 */

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
        GeometricObject[] rArray = new GeometricObject[13];

        
        Point p = new Point(5, 6);
        Point q = new Point(10, 370);
        rArray[0] = new Rectangle(p, q); //Florida Turnpike
        
        p = new Point(10, 13);
        q = new Point(420, 26);
        rArray[1] = new Rectangle(p, q); //8th st.

        p = new Point(421, 10);
        q = new Point(430, 410);
        rArray[2] = new Rectangle(p, q); //107th Ave.


        p = new Point(97, 254); //Baseball Field
        q = new Point(124, 293);
        rArray[3] = new Rectangle(p, q);

        p = new Point(109, 208); //Soccer Field
        q = new Point(152, 243);
        rArray[4] = new Rectangle(p, q);

        p = new Point(66, 111); //Softball Field
        q = new Point(84, 141);
        rArray[5] = new Rectangle(p, q);

        p = new Point(89, 123); //Tennis Field
        q = new Point(102, 152);
        rArray[6] = new Rectangle(p, q);

        p = new Point(157, 338); //Ricardo Silva Stadium
        q = new Point(203, 391);
        rArray[7] = new Rectangle(p, q);

        // W03
        Point p1 = new Point(60, 315);
        Point p2 = new Point(77, 315);
        Point p3 = new Point(77, 318);
        Point p4 = new Point(75, 318);
        Point p5 = new Point(75, 320);
        Point p6 = new Point(69, 320);
        Point p60 = new Point(69, 322);
        Point p61 = new Point(62, 322);
        Point p62 = new Point(62, 320);
        Point p63 = new Point(60, 320);


        RectPolygon rectPolygonOne = new RectPolygon();

        rectPolygonOne.addVertex(p1);
        rectPolygonOne.addVertex(p2);
        rectPolygonOne.addVertex(p3);
        rectPolygonOne.addVertex(p4);
        rectPolygonOne.addVertex(p5);
        rectPolygonOne.addVertex(p6);
        rectPolygonOne.addVertex(p60);
        rectPolygonOne.addVertex(p61);
        rectPolygonOne.addVertex(p62);
        rectPolygonOne.addVertex(p63);



        rArray[8]= rectPolygonOne;

        // Robert Diaz Hall
        Point p7 = new Point(177, 171);
        Point p8 = new Point(198, 171);
        Point p9 = new Point(198, 181);
        Point p10 = new Point(195, 181);
        Point p11 = new Point(195, 196);
        Point p12 = new Point(194, 196);
        Point p13 = new Point(194, 206);
        Point p14 = new Point(191, 206);
        Point p15 = new Point(191, 210);
        Point p16 = new Point(177, 210);

        RectPolygon rectPolygonTwo = new RectPolygon();

        rectPolygonTwo.addVertex(p7);
        rectPolygonTwo.addVertex(p8);
        rectPolygonTwo.addVertex(p9);
        rectPolygonTwo.addVertex(p10);
        rectPolygonTwo.addVertex(p11);
        rectPolygonTwo.addVertex(p12);
        rectPolygonTwo.addVertex(p13);
        rectPolygonTwo.addVertex(p14);
        rectPolygonTwo.addVertex(p15);
        rectPolygonTwo.addVertex(p16);

        rArray[9]= rectPolygonTwo;

        // WO1C
        Point p17 = new Point(88, 345);
        Point p18 = new Point(96, 345);
        Point p19 = new Point(96, 348);
        Point p20 = new Point(98, 348);
        Point p21 = new Point(98, 352);
        Point p22 = new Point(88, 352);



        RectPolygon rectPolygon3 = new RectPolygon();

        rectPolygon3.addVertex(p17);
        rectPolygon3.addVertex(p18);
        rectPolygon3.addVertex(p19);
        rectPolygon3.addVertex(p20);
        rectPolygon3.addVertex(p21);
        rectPolygon3.addVertex(p22);

        rArray[10]= rectPolygon3;

        // Wo1
        Point p23 = new Point(66, 344);
        Point p24 = new Point(80, 344);
        Point p25 = new Point(80, 349);
        Point p26 = new Point(78, 349);
        Point p27 = new Point(78, 353);
        Point p28 = new Point(76, 353);
        Point p29 = new Point(76, 354);
        Point p30 = new Point(74, 354);
        Point p31 = new Point(74, 353);
        Point p32 = new Point(66, 353);
        RectPolygon rectPolygon4 = new RectPolygon();

        rectPolygon4.addVertex(p23);
        rectPolygon4.addVertex(p24);
        rectPolygon4.addVertex(p25);
        rectPolygon4.addVertex(p26);
        rectPolygon4.addVertex(p27);
        rectPolygon4.addVertex(p28);
        rectPolygon4.addVertex(p29);
        rectPolygon4.addVertex(p30);
        rectPolygon4.addVertex(p31);
        rectPolygon4.addVertex(p32);



        rArray[11]= rectPolygon4;


        //As

        Point p33 = new Point(95, 337);
        Point p34 = new Point(98, 337);
        Point p35 = new Point(98, 335);
        Point p36 = new Point(102, 335);
        Point p37 = new Point(102, 340);
        Point p38 = new Point(95, 340);

        RectPolygon rectPolygon5 = new RectPolygon();

        rectPolygon5.addVertex(p33);
        rectPolygon5.addVertex(p34);
        rectPolygon5.addVertex(p35);
        rectPolygon5.addVertex(p36);
        rectPolygon5.addVertex(p37);
        rectPolygon5.addVertex(p38);

        rArray[12]= rectPolygon5;


        
        //graphing
        FrameDisplay frame = new FrameDisplay(450, 450, rArray);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
