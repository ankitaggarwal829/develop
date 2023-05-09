package com.example.develop.repo;

import com.example.develop.domain.DevelopData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevelopDataRepo extends JpaRepository<DevelopData, Long> {
}
