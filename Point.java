class Point2D {
    protected double x;
    protected double y;

    Point2D(double xCoord, double yCoord){
        this.x = xCoord;
        this.y = yCoord;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double distance(Point2D b)
    {
        double dx = this.x - b.x;
        double dy = this.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}