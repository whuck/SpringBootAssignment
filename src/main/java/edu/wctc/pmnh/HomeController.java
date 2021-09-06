package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/step1")
    public String goStep1() { return "/pages/step1";    }
    @RequestMapping("/step2")
    public String goStep2() { return "/pages/step2";    }
    @RequestMapping("/step3")
    public String goStep3() { return "/pages/step3";    }
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
