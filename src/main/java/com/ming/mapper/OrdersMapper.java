package com.ming.mapper;

import com.ming.po.OrdersEx;

import java.util.List;

/**
 * @author epochong
 * @date 2019/8/10 14:50
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public interface OrdersMapper {

    List<OrdersEx> queryOrdersToUser() throws Exception;
}
