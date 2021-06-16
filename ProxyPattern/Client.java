public class Client {
    public static void main(String[] args) {
        CLocalPicShow cls = new CLocalPicShow();
        cls.ShowPic("PHOTO");
        IShowPic ipic = new CRemoPic();
        IShowPic proxy = (IShowPic) new CLocalPicShow();
        proxy.ShowPic("AAA");

    }
}
