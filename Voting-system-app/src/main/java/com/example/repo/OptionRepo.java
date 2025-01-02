package com.example.repo;

import com.example.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepo extends JpaRepository<Option,Integer> {
}
