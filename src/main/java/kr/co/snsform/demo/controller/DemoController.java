package kr.co.snsform.demo.controller;

import kr.co.snsform.demo.dto.StudentDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/")
    public StudentDTO HelloWorld(){

        StudentDTO studentDTO = new StudentDTO(3622, "윤여태", 28, "남");

        return studentDTO;
    }
}
