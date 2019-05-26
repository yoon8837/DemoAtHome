package kr.co.snsform.demo.db;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StudentMapper {
    List<Map<String, Object>> getStudent();
}
