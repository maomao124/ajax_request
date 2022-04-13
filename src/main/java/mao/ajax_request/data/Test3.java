package mao.ajax_request.data;

/**
 * Project name(项目名称)：ajax_request
 * Package(包名): mao.ajax_request.data
 * Class(类名): Test3
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/13
 * Time(创建时间)： 22:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test3
{
    private int a = 1;
    private int b = 2;
    private int c = 4;
    private String message = "hello";

    public Test3(int a, int b, int c, String message)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.message = message;
    }

    public Test3()
    {

    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("a：").append(a).append('\n');
        stringbuilder.append("b：").append(b).append('\n');
        stringbuilder.append("c：").append(c).append('\n');
        stringbuilder.append("message：").append(message).append('\n');
        return stringbuilder.toString();
    }
}
