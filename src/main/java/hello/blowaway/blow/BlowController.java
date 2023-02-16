package hello.blowaway.blow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/blowAway")
public class BlowController {

    @Autowired
    private BlowService blowService;

    /**
     * Main list View page
     */
    @GetMapping("")
    public String blowMainList(Model model) {

        model.addAttribute("list", blowService.blowList());

        return "blow/blowList";
    }

    /**
     * create view page
     */
    @GetMapping("/create")
    public String blowCreate() {
        return "blow/create";
    }

    /**
     * create
     */
    @PostMapping("/create")
    public String createBlow(@ModelAttribute BlowDto blowDto) {

        blowService.createBlow(blowDto);

        return "redirect:/blowAway";
    }


    /**
     * detail view page
     */
    @GetMapping("/detail/{wid}")
    public String blowDetail( @PathVariable Integer wid, Model model ) {

        blowService.updateHit(wid);      // 조회수 처리
        model.addAttribute("detail", blowService.selectBlow(wid));

        return "blow/detail";
    }

    /**
     * update view page
     */
    @GetMapping("/update/{wid}")
    public String blowUpdate( @PathVariable Integer wid, Model model ) {

        model.addAttribute("update", blowService.selectBlow(wid));

        return "blow/update";
    }

    /**
     * update
     */
    @PostMapping("/update/{wid}")
    public String updateBlow(@ModelAttribute BlowDto blowDto) {

        blowService.updateBlow(blowDto);

        return "redirect:/blowAway";
    }

    /**
     * delete
     */
    @PostMapping("/delete/{wid}")
    public String blowDelete( @PathVariable Integer wid) {

        blowService.deleteBlow(wid);

        return "redirect:/blowAway";
    }

}
