package com.jxcoop.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  注入公共字段自动填充,任选注入方式即可
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    protected final static Logger logger = LoggerFactory.getLogger(MyMetaObjectHandler.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("新增的时候");
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("更新的时候");
    }
}