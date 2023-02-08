package hello.blowaway.setting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blowAway")
public class SettingController {

    /**
     * setting View page
     */
    @GetMapping("/setting")
    public String blowSetting( Model model ) {
        return "setting/setList";
    }

    /**
     * login View page
     */
    @GetMapping("/login")
    public String login( Model model ) {
        return "setting/login";
    }
}
