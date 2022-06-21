package com.simo333.springinaction.tacocloud.data;

import com.simo333.springinaction.tacocloud.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);

}
