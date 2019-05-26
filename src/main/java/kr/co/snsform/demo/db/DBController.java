package kr.co.snsform.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class DBController {

    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public  @ResponseBody List<Map<String, Object>> getEmployee() {
        return studentService.getStudent();
    }
}
