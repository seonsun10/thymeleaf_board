package com.sw.thymeleafboard.web;

import ch.qos.logback.core.util.StringUtil;
import com.sw.thymeleafboard.dto.BoardDTO;
import com.sw.thymeleafboard.service.BoardService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequiredArgsConstructor
public class BoardMainController {

    @Resource
    private final BoardService boardService;

    @GetMapping("/board/boardMainPage.do")
    public String boardMain(Model model) {
        return "boardMain"; // Thymeleaf 템플릿을 반환
    }


    @GetMapping("/board/boardListPage.do")
    public String boardListPage() {
        return "/board/boardList";
    }


    @PostMapping("/boards")
    @ResponseBody
    public Page<BoardDTO> searchBoardList(@RequestParam Map<String,String> params, Model model) {
        int page = StringUtil.isNullOrEmpty(params.get("page")) ? 0 : Integer.parseInt(params.get("page"));
        int size = StringUtil.isNullOrEmpty(params.get("size")) ? 10 : Integer.parseInt(params.get("size"));
        Page<BoardDTO> boardList = boardService.getBoardList(page,size);
        return boardList;
    }


    @PostMapping("/boards/{id}")
    public String postMethodName(Model model) {

        return "/board/boardView";
    }
    
}
