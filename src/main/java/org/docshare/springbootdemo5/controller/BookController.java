package org.docshare.springbootdemo5.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.yulichang.wrapper.MPJLambdaWrapper;
import org.docshare.springbootdemo5.entity.Book;
import org.docshare.springbootdemo5.entity.Usr;
import org.docshare.springbootdemo5.service.IBookService;
import org.docshare.springbootdemo5.util.Ret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yangtf
 * @since 2024-07-09
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private IBookService bookService;

    @RequestMapping("/list")
    public Ret list(){
        List<Book> list = bookService.list();
        return Ret.ok(list);
    }

    @RequestMapping("/adv_list")
    public Ret adv_list(@RequestBody Book book){
        QueryWrapper<Book> queryWrapper =new QueryWrapper<>();
        queryWrapper.setEntity(book);

        List<Book> list = bookService.list(queryWrapper);

        return Ret.ok(list);
    }

    @RequestMapping("/list2")
    public Ret list2(){
        MPJLambdaWrapper<Book> wrapper = new MPJLambdaWrapper<>();
        wrapper.selectAll();
                //.selectAs(Usr::getName,Book::getAuthorName)
                //.leftJoin(Usr.class,Usr::getId,Book::getAuthorId);


        List<Book> list = bookService.list(wrapper);

        return Ret.ok(list);

    }
}
