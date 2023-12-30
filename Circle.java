public class Circle {
    private double _radius;
    private Point _center;

    public Circle(int x, int y, double radius) {
        _center = new Point(x, y);
        if (radius > 0)
            _radius = radius;
        else
            _radius = 1;
    }

    public Circle(Point center, double radius) {
        _center = new Point(center); //copy constructor
        if (radius > 0)
            _radius = radius;
    }

    public Circle(Circle other) {
        _center = new Point(other._center);
        _radius = other._radius;
    }

    public Point getCenter() {
        return new Point(_center);
    }

    public double getRadius() {
        return _radius;
    }

    public void setCenter(Point center) {
        _center = new Point(center);
    }

    public void setRadius(double radius) {
        _radius = radius;
    }

    public double primeter() {
        return (2 * Math.PI * _radius);
    }

    public double area() {
        return (Math.PI * Math.pow(_radius, 2));
    }

    public void move(int deltaX, int deltaY)
    {
        _center.move(deltaX,deltaY);
    }
    public boolean equals(Circle other)
    {
        if(_center.equal(other._center)&&_radius== other._radius)
            return true;
        else return false;
    }
    //  ניתן גם להשוות בין רדיוסים
    public boolean isLarger(Circle other)
    {
        if(this.area()>other.area())
            return true;
        else return false;
    }
    public boolean isInCircle(Point p)
    {
        if(_center.distance(p)<=_radius)
            return true;
        else
            return false;
    }
    public String toString()
    {
        return ("The center of the circle="+_center+"and the radius="+_radius);
    }
}
