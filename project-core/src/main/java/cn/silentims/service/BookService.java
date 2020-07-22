package cn.silentims.service;

import cn.silentims.entities.Book;
import cn.silentims.entities.result.CommonResult;

public interface BookService {

    CommonResult create(Book book);

    CommonResult<Book> findall();

    CommonResult findById(Integer id);
}
