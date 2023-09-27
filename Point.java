public class Point
{
    private int _x,_y;
    public Point(int x,int y)
    {
        _x=x;
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
}
