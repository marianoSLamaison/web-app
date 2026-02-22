package orange_team.chatting.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import orange_team.chatting.DomainObjects.Poster;

@Controller
public class SignInResult {

    //@Autowired
    //Global repo for all posters, here whe ask for them
    //PosterRepo posterRepo;

    @RequestMapping(method = RequestMethod.POST, value = "/getting_in/sign_in_result")
    public String GetScreen(
        @RequestParam(name = "unique_user_name") String id_name,
        @RequestParam(name = "public_user_name") String p_name,
        @RequestParam(name = "_password") String password,
        @RequestParam(name = "e-mail", required = false) String email
    )
    {
        Poster nPoster;
        if (email == null)
        {
            nPoster = new Poster(id_name, p_name, password, email);
        }else {
            nPoster = new Poster(id_name, p_name, password, null);
        }
        
        return "user_loggin_process/sign_in_succes";
    }
}
