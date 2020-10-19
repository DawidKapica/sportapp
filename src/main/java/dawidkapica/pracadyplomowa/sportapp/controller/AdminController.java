package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudController;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.AdminDto;
import dawidkapica.pracadyplomowa.sportapp.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.ADMIN)
public class AdminController extends AbstractCrudController<AdminDto, Integer> {

    public AdminController(AdminService adminService) {
        super(adminService);
    }
}
