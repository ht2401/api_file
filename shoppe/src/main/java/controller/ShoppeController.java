package controller;

import model.entity.Profile;
import model.entity.User;
import model.request.ProfileRequest;
import model.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.IProfileService;
import service.IUserService;

@RestController
@RequestMapping("shoppe")
public class ShoppeController {
    @Autowired
    private IUserService iUserService;

    @Autowired
    private IProfileService iProfileService;

    @PostMapping("/profile/create")
    ResponseEntity<Profile> create(@RequestBody ProfileRequest request) {
        Profile profile = iProfileService.create(request);
        return ResponseEntity.ok(profile);
    }

    @PostMapping("user")
    ResponseEntity<User> cre(@RequestBody UserRequest userRequest) {
        User user = iUserService.create(userRequest);
        return ResponseEntity.ok(user);
    }


}
