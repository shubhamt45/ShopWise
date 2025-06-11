package in.codewithshubh.billingsoftware_ecommerce.service;

import in.codewithshubh.billingsoftware_ecommerce.io.UserRequest;
import in.codewithshubh.billingsoftware_ecommerce.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}
