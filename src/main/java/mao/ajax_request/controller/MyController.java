package mao.ajax_request.controller;

import mao.ajax_request.data.Test3;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project name(项目名称)：ajax_request
 * Package(包名): mao.ajax_request.controller
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/13
 * Time(创建时间)： 21:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Controller
public class MyController
{
    @RequestMapping("/test1")
    public String test1_html()
    {
        return "test1";
    }

    @RequestMapping("/server")
    @ResponseBody
    public String test1(int a, int b)
    {
        return "hello ,你好" + a + "+" + b + "=" + (a + b);
    }

    @RequestMapping("/test2")
    public String test2_html()
    {
        return "test2";
    }

    @RequestMapping(value = "/server2", method = RequestMethod.POST)
    @ResponseBody
    public String test2(int a, int b)
    {
        return "hello ,你好" + a + "+" + b + "=" + (a + b);
    }

    @RequestMapping("/test3")
    public String test3_html()
    {
        return "test3";
    }

    @RequestMapping(value = "/server3", method = RequestMethod.POST)
    @ResponseBody
    public Test3 test3()
    {
        return new Test3();
    }

    @RequestMapping("/test4")
    public String test4_html()
    {
        return "test4";
    }

    @RequestMapping(value = "/server4")
    @ResponseBody
    public Test3 test4()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new Test3();
    }

    @RequestMapping("/test5")
    public String test5_html()
    {
        return "test5";
    }

    @RequestMapping(value = "/server5")
    @ResponseBody
    public Test3 test5()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new Test3();
    }
}
