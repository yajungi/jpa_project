package com.coha.toy.reservation.display.repository;

import com.coha.toy.reservation.display.entity.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayRepository extends JpaRepository<Display, Long>, DisplayCustomRepository {

}
