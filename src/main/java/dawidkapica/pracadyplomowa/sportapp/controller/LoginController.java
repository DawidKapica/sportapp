package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.LoginDto;
import dawidkapica.pracadyplomowa.sportapp.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.LOGIN)
public class LoginController extends BaseCrudController<LoginDto, Integer> {

    public LoginController(LoginService loginService) {
        super(loginService);
    }
}
