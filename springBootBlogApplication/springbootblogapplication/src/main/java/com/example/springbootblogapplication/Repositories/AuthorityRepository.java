package com.example.springbootblogapplication.Repositories;

import com.example.springbootblogapplication.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, String> {

    
}

