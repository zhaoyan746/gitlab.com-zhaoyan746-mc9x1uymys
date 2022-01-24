package com.zy.mapper;

import com.zy.model.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Owen
 * @since 2022-01-23
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
