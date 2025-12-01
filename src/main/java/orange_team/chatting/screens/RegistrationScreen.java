package orange_team.chatting.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationScreen {
    @GetMapping("/registration")
    public String GetScreen()
    {
        return "registration_screen/index.html";
    }
    
}
