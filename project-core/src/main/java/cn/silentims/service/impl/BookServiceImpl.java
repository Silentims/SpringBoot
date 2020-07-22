package cn.silentims.service.impl;

import cn.silentims.entities.Book;
import cn.silentims.entities.result.CommonResult;
import cn.silentims.mapper.BookMapper;
import cn.silentims.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public CommonResult create(Book book) {

        int result = bookMapper.create(book);
        return result > 0 ? new CommonResult(200,"插入成功"):new CommonResult(500,"插入失败");
    }

    @Override
    public CommonResult findall() {
        List<Book> lists = bookMapper.findAll();
        CommonResult commonResult = new CommonResult(200,"成功",lists);
        return commonResult;
    }

    @Override
    public CommonResult findById(Integer id) {
        Book book = bookMapper.findById(id);
        System.out.println("book的查询结果"+book.toString());
        return book != null ?new CommonResult(200,"查询记录成功",book):new CommonResult(200,"无对应记录");
    }


}
