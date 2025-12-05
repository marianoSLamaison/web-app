package orange_team.chatting.screens;

import java.net.http.HttpRequest;
import java.sql.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//pantalla dedicada a recolectar informacion necesaria para registrar a un usuario
//Aqui tenemos que recibir tanto la peticion con form inicial, como 
//tambien redirigir al usuario dependiendo del resultado de la operacion
//La operacion debera de redirigirme a una pantalla de error explicando el motivo de la falla
//tambien a una pantalla de exito que me redirija a mi menu de usuario
@Controller
@RequestMapping("Registration")
public class RegistrationScreen {
    static String _index = "registration_screen/index.html";
    static String _succes_index = "registration_succes/index.html";
    @RequestMapping(method = {RequestMethod.GET},
                    value = "/")
    public String GetScreen(HttpRequest request, ModelAndView mv)
    {

        //Whe leave this like that so I can do things as to add translations later
        return _index;
    }

    @ResponseBody
    @RequestMapping(
        value = "/RegistrationResults",
        method = RequestMethod.POST//a esta seccion solo se puede acceder atravez de post methods
    )
    //TODO: implementar un check con JS prev
    public ModelAndView GetSuccesScreen(ModelAndView mv,
        @RequestParam("userName") String userName, 
        @RequestParam("userPassword") String userPassword, 
        @RequestParam(value = "userBirthDate", required = false) Date userBirthDate
    )
    {
        
        return mv;
    }
}
