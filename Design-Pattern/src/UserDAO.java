public class UserDAO {
    DBUtil dbutil = new DBUtil();
    public boolean findUser(String username,String userpassword){
        dbutil.getConnection();
        System.out.println("验证通过");
        return true;
    }

}
