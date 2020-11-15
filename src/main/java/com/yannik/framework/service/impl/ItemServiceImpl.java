package com.yannik.framework.service.impl;

import com.yannik.annotation.YService;
import com.yannik.framework.service.ItemService;

/**
 * @author yannik
 * @date 2020/11/15
 * @describe
 */
@YService("itemServiceImpl_1")
public class ItemServiceImpl implements ItemService {

    public Object getBean(String name) {
        return "bean：" + name;
    }
}
