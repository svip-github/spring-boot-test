package com.jxcoop.fresh.mapper;

import com.jxcoop.fresh.entity.RightActions;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 二级权限对应路由action,可以有多个actiond对应一个 二级权限（因为一个二级菜单可能包括查询 新增 等请求） Mapper 接口
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
public interface RightActionsMapper extends BaseMapper<RightActions> {

}
