package com.finish.tastoneic.Controller;

import com.finish.tastoneic.Entiry.Userdatareview;
import com.finish.tastoneic.Service.UserdataService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class UserDataController {

    private UserdataService userdataService;
    public  UserDataController(UserdataService userdataService)
    {
        this.userdataService=userdataService;
    }
    @PostMapping("/UserData")
    public String PostUserData(@ModelAttribute Userdatareview userdatareview)
    {
        return userdataService.SaveTheUserdata(userdatareview);
    }
}
