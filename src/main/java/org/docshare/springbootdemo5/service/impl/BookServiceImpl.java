package org.docshare.springbootdemo5.service.impl;

import org.docshare.springbootdemo5.entity.Book;
import org.docshare.springbootdemo5.mapper.BookMapper;
import org.docshare.springbootdemo5.service.IBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yangtf
 * @since 2024-07-09
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
