import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LoginForm {
    UserDAO userDAO = new UserDAO();
    public void init(){
        System.out.println("这是个方法");
    }
    public void display(){
        System.out.println("这也是个方法");
    }
    public void validate(){
        userDAO.findUser("String username","String userpassword");
        System.out.println("执行这个方法");
    }
}
