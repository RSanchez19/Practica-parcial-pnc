package com.ronaldsm.preparcial.Repository;

import com.ronaldsm.preparcial.Model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
//  public User findByUsernameAndPassword(String username, String password);
//  public User findByEmailAndPassword(String email, String password);
  Optional<User> findByUsername(String username);
}
