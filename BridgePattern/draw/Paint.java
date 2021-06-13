package draw;

public abstract class Paint {
    protected Color color;

    public void setColor(Color color){
    	this.color = color;
    }

    public void draw(String name) {};
}
