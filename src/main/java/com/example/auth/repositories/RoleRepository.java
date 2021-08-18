package com.example.auth.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.auth.models.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
