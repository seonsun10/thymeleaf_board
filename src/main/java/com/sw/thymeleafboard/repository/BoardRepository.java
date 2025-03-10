package com.sw.thymeleafboard.repository;

import com.sw.thymeleafboard.dto.BoardDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardDTO, Integer> {
}
