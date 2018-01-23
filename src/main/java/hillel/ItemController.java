package hillel;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {

    @Autowired
    ItemsService itemsService;


    @MessageMapping("/getAllItems")
    @SendTo("/frontend/listItems")
            public Object [] getAllItems(String message) {
        return itemsService.getAllItems().toArray();
    }

}
