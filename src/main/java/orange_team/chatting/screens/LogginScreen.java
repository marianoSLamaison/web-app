package orange_team.chatting.screens;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import orange_team.chatting.DTOs.LogginData;
import orange_team.chatting.DTOs.LogginResponse;
/*
Methodo acargo de controlar la pagina de loggin. Dado que incluye logica de respuesta a pedidos
que no debe de renderizarse, solo puede ser controller, y aclaramos que methodos renderizan y cuales no
con ResponceBody
*/
@Controller
public class LogginScreen {

    //@ResponseBody)
    @GetMapping("/loggin")
    public String GetScreen()
    {
        return "loggin_screen/index.html";
    }
    @RequestMapping(value = "/isLogInfoValid", 
                    method = RequestMethod.POST, 
                    produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody

    public LogginResponse checkUserLogIngo(@RequestBody LogginData logginData)
    {
        if (logginData.getPassword().equals("123") && logginData.getUserName().equals("Juan") )
        {
            return new LogginResponse(true);

        }
        return new LogginResponse(false); 
    }
}
