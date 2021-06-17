package 状态模式;

public class RunningState extends ThreadState{
    public RunningState()
    {
        state = StateSet.RUNNING;
        System.out.println("进入运行状态");
    }
    public void suspend(ThreadContext tc)
    {
        System.out.println("开始运行suspend方法");
        if(state == StateSet.RUNNING)
            tc.setState(new BlockedState());
        else
            System.out.println("当前状态不是运行态");
    }
    public void stop(ThreadContext tc)
    {
        System.out.println("开始运行stop方法");
        if(state == StateSet.RUNNING)
            tc.setState(new DeadState());
        else
            System.out.println("当前状态不是运行态");
    }
}
