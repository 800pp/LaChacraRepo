package com.lachacra.repository;

import com.lachacra.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReserveRepository extends JpaRepository<Reserve,Integer> {
}
