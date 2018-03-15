package com.jxcoop.fresh.mapper;

import com.jxcoop.fresh.entity.RightUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 管理员和权限的对应表，除非了用角色赋予功能，还可以直接赋予二级权限 Mapper 接口
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
public interface RightUserMapper extends BaseMapper<RightUser> {

}
