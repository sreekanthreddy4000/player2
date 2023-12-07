
package com.example.player.repository;

import com.example.player.model.Player;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PlayerJpaRepository extends JpaRepository<Player, Integer> {

}