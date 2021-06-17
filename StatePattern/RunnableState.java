package 状态模式;

public class RunnableState extends ThreadState{
    public RunnableState()
    {
        state = StateSet.RANNABLE;
        System.out.println("进入就绪状态");
    }
    public void getCpu(ThreadContext tc)
    {
        System.out.println("获得CPU时间");
        if(state == StateSet.RANNABLE)
            tc.setState(new RunningState());
        else
            System.out.println("当前状态不是就绪态");
    }
}
