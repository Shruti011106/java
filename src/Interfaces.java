interface a{
    void login();
}
interface b{
    void signin();
}
class c implements a,b{

    public void login() {
        System.out.printf("Login");
    }


    public void signin() {
        System.out.printf("Signin");
    }
}
public class Interfaces {
    static void main() {
        c c1=new c();
        c1.login();
        c1.signin();
    }
}
