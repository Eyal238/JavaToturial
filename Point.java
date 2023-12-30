public class Point
{
    private int _x,_y;
    public Point(int x,int y)
    {
        _x=x;
        _y=y;
    }
    // בנאי העתקה
    public Point(Point other )
    {
        _x=other._x;
        _y=other._y;
    }
    public int getX()
    {
        return _x;
    }
    public int getY()
    {
        return _y;
    }
    public void setX(int x)
    {
        _x=x;
    }
    public void setY(int y)
    {
        _y=y;
    }
    public void move(int deltaX,int deltaY)
    {
        _x=_x+deltaX;
        _y=_y+deltaY;
    }
    public void printStatus()
    {
        System.out.println("("+_x+","+_y+")");
    }
    public boolean equal(Point other)
    {
        if((_x==other._x)&&(_y==other._y))
            return true;
        else
            return false;
    }
    public double distance(Point p)
    {
        return (Math.sqrt(Math.pow((_x-p._x),2)+Math.pow((_y-p._y),2)));
    }
}
