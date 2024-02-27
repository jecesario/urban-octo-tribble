package com.jecesario.generationawsfinalproject.domain.repository;

import com.jecesario.generationawsfinalproject.domain.models.Theme;
import com.jecesario.generationawsfinalproject.domain.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {

    Optional<Theme> findById(Long id);
}
