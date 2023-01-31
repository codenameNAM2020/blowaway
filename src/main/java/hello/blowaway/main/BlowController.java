package hello.blowaway.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blow")
public class BlowController {

    /**
     * main list View page
     */
    @GetMapping("/main/list")
    public String mainBlowList( Model model ) {

        return "main/blowList";
    }

    /**
     * create view page
     */
    @GetMapping("/create")
    public String blowCreate() {
        return "main/blowCreate";
    }

    /**
     * create page
     */
    @PostMapping("/create")
    public String blowCreateBack() {

        return "redirect:main/list";
    }

    /**
     * detail view page
     */
    @GetMapping("/detail")
    public String mainBlowList() {
        return "main/blowDetail";
    }

    /**
     * update view page
     */
    @GetMapping("/update/{id}")
    public String blowUpdate( @PathVariable Integer id, Model model ) {
        return "main/blowDetail";
    }

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
