package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.UserPlanDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserPlanEntity;
import dawidkapica.pracadyplomowa.sportapp.service.UserPlanService;
import dawidkapica.pracadyplomowa.sportapp.specification.UserPlanSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.USER_PLANS)
public class UserPlanController extends AbstractCrudControllerWithSpecification<UserPlanDto, Integer, UserPlanEntity, UserPlanSpecification> {

    public UserPlanController(UserPlanService userPlanService) {
        super(userPlanService);
    }
}
