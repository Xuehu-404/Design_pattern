package 状态模式;

public class DeadState extends ThreadState{
    public DeadState()
    {
        state = StateSet.BLOCKED;
        System.out.println("程序死亡");
    }

}
