package orange_team.chatting.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignInScreen {
    @RequestMapping(method = RequestMethod.GET, value = "/getting_in/sign_in")
    public String GetScreen() {
        return "user_loggin_process/sign_in_option";
    }
}
