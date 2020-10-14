package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.UserDetailDto;
import dawidkapica.pracadyplomowa.sportapp.entities.UserDetailEntity;
import dawidkapica.pracadyplomowa.sportapp.service.UserDetailService;
import dawidkapica.pracadyplomowa.sportapp.specification.UserDetailSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.USER_DETAIL)
public class UserDetailController extends AbstractCrudControllerWithSpecification<UserDetailDto, Integer, UserDetailEntity, UserDetailSpecification> {
    public UserDetailController(UserDetailService userDetailService) {
        super(userDetailService);
    }
}
