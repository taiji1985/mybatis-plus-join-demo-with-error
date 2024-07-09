package org.docshare.springbootdemo5.mapper;

import com.github.yulichang.base.MPJBaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.docshare.springbootdemo5.entity.Usr;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yangtf
 * @since 2024-07-09
 */
@Mapper
public interface UsrMapper extends MPJBaseMapper<Usr> {

}
