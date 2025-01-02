package com.example.repo;

import com.example.entity.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepo extends JpaRepository <Poll,Integer>{
}
