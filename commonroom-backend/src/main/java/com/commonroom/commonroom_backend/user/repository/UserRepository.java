package com.commonroom.commonroom_backend.user.repository;

import com.commonroom.commonroom_backend.user.model.UsersModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UsersModel,Long>  {
    UsersModel findByEmail(String email);
}
