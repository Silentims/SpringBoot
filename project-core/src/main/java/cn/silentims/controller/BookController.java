package cn.silentims.controller;

import cn.silentims.entities.Book;
import cn.silentims.entities.result.CommonResult;
import cn.silentims.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping(value = "/createBook")
    public CommonResult create(@RequestBody Book book){
        CommonResult commonResult = bookService.create(book);
        return commonResult;
    }

    @PostMapping(value = "/findAll")
    public  CommonResult findAll(){
        CommonResult commonResult = bookService.findall();
        return commonResult;
    }

    @PostMapping(value = "/findById/{id}" )
    public CommonResult findById(@PathVariable("id") Integer id){
        CommonResult commonResult = bookService.findById(id);
        return commonResult;
    }
}
