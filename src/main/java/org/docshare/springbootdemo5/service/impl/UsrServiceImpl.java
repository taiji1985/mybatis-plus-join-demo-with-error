package org.docshare.springbootdemo5.service.impl;

import org.docshare.springbootdemo5.entity.Usr;
import org.docshare.springbootdemo5.mapper.UsrMapper;
import org.docshare.springbootdemo5.service.IUsrService;
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
public class UsrServiceImpl extends ServiceImpl<UsrMapper, Usr> implements IUsrService {

}
