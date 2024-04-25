package com.simplificado.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplificado.springsecurity.entities.Tweet;

public interface TweetRepository extends JpaRepository <Tweet, Long> {

}
