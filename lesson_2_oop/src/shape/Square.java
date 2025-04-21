package shape;

public class Square {

    private int edgeLength;

    public Square(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public Square() {
        this.edgeLength = 5;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int calculatePerimeter() {
        final int perimeter = edgeLength * 4;
        return perimeter;
    }

    public void extendEdge(int extendBy) {
        edgeLength = edgeLength + extendBy;
    }
}
