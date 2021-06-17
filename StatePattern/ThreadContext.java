package 状态模式;

public class ThreadContext {
    private ThreadState state;

    public ThreadContext()
    {
        state = new NewState();
    }
    public void setState(ThreadState state)
    {
        this.state = state;
    }
    public ThreadState getState()
    {
        return state;
    }
    public void start()
    {
        ((NewState)state).start(this);
    }
    public void getCpu()
    {
        ((RunnableState)state).getCpu(this);
    }
    public void suspend()
    {
        ((RunningState)state).suspend(this);
    }
    public void stop()
    {
        ((RunningState)state).stop(this);
    }
    public void resume()
    {
        ((BlockedState)state).resume(this);
    }
}
