package com.ronaldsm.preparcial.Service;

import com.ronaldsm.preparcial.Excepcions.ResourceNotFoundException;
import com.ronaldsm.preparcial.Model.User.User;
import com.ronaldsm.preparcial.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

//    public User createUser(User user){
//        return userRepository.save(user);
//    }
//    public List<UserListDTO> listUsers() {
//        List<User> users = userRepository.findAll();
//        List<UserListDTO> userListDTOs = new ArrayList<>();
//        for (User user : users) {
//            UserListDTO userListDTO = new UserListDTO(user.getusername(), user.getEmail(), user.getRecruitDate(), user.getRole());
//            userListDTOs.add(userListDTO);
//        }
//        return userListDTOs;
//    }
    public User findUserById(Long id){
        return userRepository.findById(id).orElse(null);
    }

//    public UserDTO signInByEmail(String email, String password){
//        User user = userRepository.findByEmailAndPassword(email,password);
//        return new UserDTO(user.getusername(), user.getEmail(),user.getRole(R));
//    }
//    public User signInByusername(String username, String password){
//        return userRepository.findByusernameAndPassword(username,password);
//    }

    public User toggleIsActive(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
        user.setActiveUser(!user.isActiveUser());
        return userRepository.save(user);
    }
}





