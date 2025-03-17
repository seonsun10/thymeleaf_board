package com.sw.thymeleafboard.service;

import com.sw.thymeleafboard.dto.BoardDTO;
import com.sw.thymeleafboard.repository.BoardRepository;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Resource(name = "boardRepository")
    private final BoardRepository boardRepository;

    public Page<BoardDTO> getBoardList(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return boardRepository.findAll(pageable);
    }

}
