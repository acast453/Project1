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

    public void addVertex(Point v) {
        vertexList[vertNumber] = v;
        vertNumber++;
    }

    /**
     * Computes the Area of this polygon using shoelace algorithm.
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

    /**
     * @return
     */
    public Rectangle boundingRectangle() {

        return null;
    }


    @Override
    public void draw(Graphics g) {
        int[] xCoord = new int[vertNumber];
        int[] yCoord = new int[vertNumber];

        for (int i = 0; i < vertNumber; i++) {
            xCoord[i] = (int) vertexList[i].getX();
            yCoord[i] = (int) vertexList[i].getY();

        }
        g.setColor(getInteriorColor());
        g.fillPolygon(xCoord, yCoord, vertNumber);
        g.setColor(getBoundaryColor());
        g.drawPolygon(xCoord, yCoord, vertNumber);


    }

    /**
     * @return
     */
    public int getNumberOfVertices() {

        return vertNumber;
    }

    /**
     * Gets the greatest X value in array.
     *
     * @return
     */
    public double greatestX() {

        double maxX = vertexList[0].getX();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getX() > maxX) {
                maxX = vertexList[i].getX();
            }

        }
        return maxX;


    }

    /**
     * Gets the greatest Y value in array.
     *
     * @return
     */
    public double greatestY() {
        double maxY = vertexList[0].getY();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getY() > maxY) {
                maxY = vertexList[i].getY();
            }

        }
        return maxY;
    }

    /**
     * @param p
     * @return
     */
    public boolean isPointRectPolygon(Point p) {
        double px = p.getX();
        double py = p.getY();
        int crossings = 0;

        for (int i = 0; i < vertNumber - 1; i++) {

            double x1;
            double x2;


            if (vertexList[i].getX() < vertexList[i + 1].getX()) {
                x1 = vertexList[i].getX();
                x2 = vertexList[i + 1].getX();
            } else {
                x1 = vertexList[i + 1].getX();
                x2 = vertexList[i].getX();
            }

            if (px > x1 && px <= x2 && (py < vertexList[i].getY() || py <= vertexList[i + 1].getY())) {
                double eps = 0.000001;
                double k = 0;

                double dx = vertexList[i + 1].getX() - vertexList[i].getX();
                double dy = vertexList[i + 1].getY() - vertexList[i].getY();

                if (Math.abs(dx) < eps) {
                    //K = infinite
                } else {
                    k = dy / dx;
                }

                double m = vertexList[i].getY() - k * vertexList[i].getX();

                double y2 = k * px + m;
                if (py <= y2) {
                    crossings++;
                }
            }
        }

        return crossings % 2 == 1;
    }


    /**
     * Gets the smallest X value in array.
     *
     * @return minx
     */
    public double smallestX() {
        double minX = vertexList[0].getX();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getX() < minX) {
                minX = vertexList[i].getX();
            }

        }
        return minX;

    }

    /**
     * Gets the smallest Y value in array.
     *
     * @return minY
     */
    public double smallestY() {
        double minY = vertexList[0].getY();

        for (int i = 0; i < vertNumber; i++) {
            if (vertexList[i].getY() < minY) {
                minY = vertexList[i].getY();
            }

        }
        return minY;
    }

    /**
     * @return
     */
    public String toString() {

        StringBuilder str = new StringBuilder("RECTPOLYGON " + super.toString() + "\n");
        str.append("Start: ");
        for (int i = 0; i < vertNumber - 2; i++) {
            str.append("(").append(vertexList[i].getX()).append(" ").append(vertexList[i].getY()).append(") ");
        }
        str.append("End: ");
        str.append("(").append(vertexList[vertNumber - 1].getX()).append(" ").append(vertexList[vertNumber - 1].getY()).append(") ");

        return str.toString();
    }


    /**
     * @param v
     */
    public void translate(Vector v) {
        for (Point p : vertexList) {
            p.translate(v);
        }
    }
}
