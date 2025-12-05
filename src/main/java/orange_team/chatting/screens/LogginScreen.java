package orange_team.chatting.screens;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
/*
Methodo acargo de controlar la pagina de loggin. Dado que incluye logica de respuesta a pedidos
que no debe de renderizarse, solo puede ser controller, y aclaramos que methodos renderizan y cuales no
con ResponceBody
*/
@Controller
public class LogginScreen {
    static String index_file = "loggin_screen/index.html" ;
    //@ResponseBody)
    @RequestMapping(value="/loggin",
                    method={RequestMethod.POST, RequestMethod.GET})
    public ModelAndView GetScreen(ModelAndView mv,
                    @RequestParam(value = "password", required = false) String password,
                    @RequestParam(value = "name", required = false) String name)
    {
        mv.setViewName(index_file);        
        if (password == null || name == null)
        {
            mv.addObject("failure", false);
            return mv;
        }
        mv.addObject("failure", !(password.equals("123") && name.equals("Juan")));
        return mv;
    }
}
