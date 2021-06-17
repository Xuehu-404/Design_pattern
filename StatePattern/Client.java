package 状态模式;

public class Client {
    public static void main(String[] args) {
        ThreadContext tc = new ThreadContext();
        tc.start();
        tc.getCpu();
        tc.suspend();
        tc.resume();
        tc.getCpu();
        tc.stop();
    }
}
