package cn.silentims.mapper;

import cn.silentims.entities.Book;
import cn.silentims.entities.result.CommonResult;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    int create(Book book);

    List<Book> findAll();

    Book findById(@Param(value = "id") Integer id);
}
