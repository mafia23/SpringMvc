package yzp.springmvc.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * SpringMvcController
 *
 * @author Yangzp
 * @date 2016/5/5
 */
@Controller
public class SpringMvcController {

    @RequestMapping("/init")
    public String init(){
        System.out.println("hello world");
        return "success";
    }
}
