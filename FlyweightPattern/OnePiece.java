package 享元模式;

public class OnePiece extends APiece{
    public OnePiece(String inKind)
    {
        super(inKind);
    }
    @Override
    public void Play(int x, int y) {
        System.out.println("把"+inKind+"放在("+x+","+y+")的位置");
    }
}
