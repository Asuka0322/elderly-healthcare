package com.budailad.service;

import com.budailad.entity.WarehoseStorage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (WarehoseStorage)表服务接口
 *
 * @author Budai
 * @since 2022-03-11 16:21:05
 */
public interface WarehoseStorageService {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsId 主键
     * @return 实例对象
     */
    WarehoseStorage queryById(String goodsId);

    /**
     * 条件查询
     *
     * @param warehoseStorage 筛选条件
     * @return 查询结果
     */
    List<WarehoseStorage> queryAll(WarehoseStorage warehoseStorage);

    /**
     * 分页查询
     *
     * @param warehoseStorage 筛选条件
     * @param pageRequest     分页对象
     * @return 查询结果
     */
    Page<WarehoseStorage> queryByPage(WarehoseStorage warehoseStorage, PageRequest pageRequest);

    /**
     * 非分页查询
     *
     * @return
     */
    List<WarehoseStorage> queryAll();

    /**
     * 新增数据
     *
     * @param warehoseStorage 实例对象
     * @return 实例对象
     */
    WarehoseStorage insert(WarehoseStorage warehoseStorage);

    /**
     * 修改数据
     *
     * @param warehoseStorage 实例对象
     * @return 实例对象
     */
    WarehoseStorage update(WarehoseStorage warehoseStorage);

    /**
     * 通过主键删除数据
     *
     * @param goodsId 主键
     * @return 是否成功
     */
    boolean deleteById(String goodsId);

}
