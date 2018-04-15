package com.dqgjk.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable> {
    /**
     * 集合查询
     *
     * @param pageNum  页码
     * @param pageSize 每页的查询数量
     * @return
     */
    List<T> findAll(int pageNum, int pageSize);
}