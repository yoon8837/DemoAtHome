package kr.co.snsform.demo.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    StudentMapper studentMapper;

    public List<Map<String, Object>> getStudent(){
        return studentMapper.getStudent();
    }

}
