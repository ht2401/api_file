package service;

import model.entity.User;
import model.request.UserRequest;

public interface IUserService {
    User create(UserRequest userRequest);

}
