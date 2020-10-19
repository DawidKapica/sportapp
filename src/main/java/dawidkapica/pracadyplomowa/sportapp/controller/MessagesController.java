package dawidkapica.pracadyplomowa.sportapp.controller;

import dawidkapica.pracadyplomowa.sportapp.coreLibrary.AbstractCrudControllerWithSpecification;
import dawidkapica.pracadyplomowa.sportapp.coreLibrary.RestMappings;
import dawidkapica.pracadyplomowa.sportapp.dto.MessagesDto;
import dawidkapica.pracadyplomowa.sportapp.entities.MessagesEntity;
import dawidkapica.pracadyplomowa.sportapp.service.MessagesService;
import dawidkapica.pracadyplomowa.sportapp.specification.MessagesSpecification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.MESSAGES)
public class MessagesController extends AbstractCrudControllerWithSpecification<MessagesDto, Integer, MessagesEntity, MessagesSpecification> {

    public MessagesController(MessagesService messagesService) {
        super(messagesService);
    }
    
}
