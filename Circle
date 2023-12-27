public class Circle
{
    private double _radius;
    private Point _center;
    public Circle(int x,int y,double radius)
    {
        _center=new Point(x,y);
        if(radius>0)
            _radius=radius;
        else
            _radius=1;
    }
    public Circle(Point center,double radius)
    {
        _center=new Point(center); //copy constructor
        if(radius>0)
            _radius=radius;
    }
    public Circle(Circle other)
    {
        _center=new Point(other._center);
        _radius=other._radius;
    }
    public Point getCenter()
    {
        return new Point(_center);
    }
    public double getRadius()
    {
        return _radius;
    }
    public void setCenter(Point center)
    {
        _center=new Point(center);
    }
    public void setRadius(double radius)
    {
        _radius=radius;
    }
}
