package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDetailDto;
import dawidkapica.pracadyplomowa.sportapp.service.UserDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.USER_DETAIL)
public class UserDetailController extends BaseCrudController<UserDetailDto, Integer> {
    public UserDetailController(UserDetailService userDetailService) {
        super(userDetailService);
    }
}
