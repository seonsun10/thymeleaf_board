package com.sw.thymeleafboard.web;

import com.sw.thymeleafboard.dto.BoardDTO;
import com.sw.thymeleafboard.service.BoardService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class BoardMainController {

    @Resource
    private final BoardService boardService;

    @GetMapping("/board/boardMain")
    public String boardMain(Model model) {
        getMethodName(model);

        return "boardMain"; // Thymeleaf 템플릿을 반환
    }

    // @GetMapping("/board/boardList")
    public void getMethodName(Model model) {
        List<BoardDTO> list = boardService.getBoardList();
        System.out.println("@@@@@@@@@@@@@@" + list);
        model.addAttribute("boardList", list);
    }
    
}
