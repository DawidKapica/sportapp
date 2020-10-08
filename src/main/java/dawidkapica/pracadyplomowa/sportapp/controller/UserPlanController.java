package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.BaseCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.UserPlanDto;
import dawidkapica.pracadyplomowa.sportapp.service.UserPlanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.USER_PLANS)
public class UserPlanController extends BaseCrudController<UserPlanDto, Integer> {

    public UserPlanController(UserPlanService userPlanService) {
        super(userPlanService);
    }
}
