package service;

import dev.sandeep.UserService.model.Role;
import dev.sandeep.UserService.repository.RoleRepository;
import dev.sandeep.UserService.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    public Role createRole(String name){
        Role role = new Role();
        role.setRole(name);
        return roleRepository.save(role);

    }
    public UserDto getUserDetails(Long UserId){

    }

}
