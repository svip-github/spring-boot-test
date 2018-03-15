package com.jxcoop.fresh.mapper;

import com.jxcoop.fresh.entity.CustomerAddress;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 客户提货地址表，一个人的提货地址可以有一个企业和多个合伙人地址随便选 Mapper 接口
 * </p>
 *
 * @author Zhouqiyong
 * @since 2018-03-08
 */
public interface CustomerAddressMapper extends BaseMapper<CustomerAddress> {

}
