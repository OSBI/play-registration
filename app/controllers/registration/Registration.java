package controllers.registration;

import controllers.Application;
import play.mvc.Controller;
import play.modules.registration.RegistrationPlugin;

public class Registration extends Controller {

    public static void confirm(String uuid){
    
    RegistrationPlugin.confirm(uuid);
    
    Application.index();
    }
}
