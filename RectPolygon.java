import java.awt.*;

public class RectPolygon extends GeometricObject {
    Point[] vertexList;
    int size;
    int vertNumber;


    public RectPolygon() {
        size = 100;
        vertexList = new Point[size];
        vertNumber = 0;

    }

    public void addVertex(Point v){
      vertexList[vertNumber] = v;
      vertNumber++;
     }

    /**
     * Computes the Area of this polygon using shoelace algorithm.
     *
     *
     * @return
     */
    public double area() {
         if (vertNumber < 4)
             return Double.NaN;
         double sum1 = 0.0, sum2 = 0.0;
         Point v1, v2;

         for (int i = 0; i < vertNumber; i++) {
             v1 = vertexList[i];
             v2 = vertexList[(i + 1) % vertNumber];

             sum1 += v1.getX() * v2.getX();
             sum2 += v2.getX() * v2.getY();
         }
         double area = 0.5 * Math.abs(sum1 - sum2);
         return area;

     }
    public Rectangle boundingRectangle(){

         return null;
     }
     @Override
     public void draw (Graphics g){
        int[] xCoord = new int [vertNumber];
        int [] yCoord = new int [vertNumber];

        for (int i =0; i <vertNumber; i++)
        {
            xCoord[i] = (int) vertexList[i].getX();
            yCoord[i] = (int) vertexList[i].getY();

        }
        g.setColor(getInteriorColor());
        g.fillPolygon(xCoord,yCoord,vertNumber);
        g.setColor(getBoundaryColor());
        g.drawPolygon(xCoord,yCoord,vertNumber);


     }

    public int getNumberOfVertices(){

        return vertNumber;
    }

    public double greatestX(){

        double maxX = vertexList[0].getX();

        for (int i =0; i <vertNumber; i++)
        {
            if (vertexList[i].getX() > maxX){
                maxX = vertexList[i].getX();
            }

        }
        return maxX;
        

    }
    public double greatestY(){
        double maxY = vertexList[0].getY();

        for (int i =0; i <vertNumber; i++)
        {
            if (vertexList[i].getY() > maxY){
                maxY = vertexList[i].getY();
            }

        }
        return maxY;
    }
    public boolean isPointRectPolygon(Point p){

        return false;
    }

    public double smallestX(){
        double minX = vertexList[0].getX();

        for (int i =0; i <vertNumber; i++)
        {
            if (vertexList[i].getX() < minX){
                minX = vertexList[i].getX();
            }

        }
        return minX;

    }

   public double smallestY(){
       double minY = vertexList[0].getY();

       for (int i =0; i <vertNumber; i++)
       {
           if (vertexList[i].getY() < minY){
               minY = vertexList[i].getY();
           }

       }
       return minY;
   }

    public String toString(){

        return "";
    }

    public void translate(Vetor v){

    }
}
