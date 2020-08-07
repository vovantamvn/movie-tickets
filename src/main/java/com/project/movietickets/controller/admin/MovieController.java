package com.project.movietickets.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class MovieController {

    @GetMapping("/movies")
    public String createMovie(){
        return "admin/movie/index";
    }
}
// mỗi phần có 3 trang như rứa đó
// index create update
// ở trang index thì lisst toàn bộ phim ra
// ở trang create thì tạo
// update thì giống với create rồi
// kiểm hắn sẽ là như ri
// code trong ni luôn
// hắn tự load hết á
// oke
// hỏi chi nửa không
// tis lafm chi k bieest hoir sau
// oke
// đẻ ý mấy cái url
//