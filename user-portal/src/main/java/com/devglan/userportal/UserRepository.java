package com.devglan.userportal;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository {

    void delete(User user);

    List findAll();

    User findOne(int id);

    User save(User user);
}