package com.simplificado.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplificado.springsecurity.entities.Role;

public interface RoleRepository extends JpaRepository <Role, Long>{

}
