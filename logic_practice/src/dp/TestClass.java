
class Apha
{

    public void m1()
    {

    }
    public void m2()
    {

    }
}
class  Beta extends  Apha
{

    public void m3()
    {

    }
}
public class TestClass {
    public static void main(String[] args) {
        Apha a = new Beta();
        a.m1();
        Beta beta = new Beta();
        beta.m1();
    }
}
