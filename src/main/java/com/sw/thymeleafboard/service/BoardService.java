package com.sw.thymeleafboard.service;

import com.sw.thymeleafboard.dto.BoardDTO;
import com.sw.thymeleafboard.repository.BoardRepository;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Resource(name = "boardRepository")
    private final BoardRepository boardRepository;

    public List<BoardDTO> getBoardList() {
        return boardRepository.findAll();
    }

}
