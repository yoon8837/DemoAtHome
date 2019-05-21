package kr.co.snsform.demo.controller;

import kr.co.snsform.demo.dto.StudentDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/")
    public StudentDTO HelloWorld(){

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentNo(3622);
        studentDTO.setName("윤여태");
        studentDTO.setAge(28);
        studentDTO.setGender("남");

        return studentDTO;
    }
}
