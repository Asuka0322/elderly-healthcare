package com.budailad.controller;

import com.budailad.entity.DailyTask;
import com.budailad.service.DailyTaskService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (DailyTask)表控制层
 *
 * @author makejava
 * @since 2022-03-24 15:53:59
 */
@RestController
@RequestMapping("/api/healthcare/dailyTask")
public class DailyTaskController {
    /**
     * 服务对象
     */
    @Resource
    private DailyTaskService dailyTaskService;

    /**
     * 分页查询
     *
     * @param dailyTask   筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping("/page")
    public ResponseEntity<Page<DailyTask>> queryByPage(DailyTask dailyTask, PageRequest pageRequest) {
        return ResponseEntity.ok(this.dailyTaskService.queryByPage(dailyTask, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get")
    public ResponseEntity<DailyTask> queryById(@RequestParam("id") String id) {
        return ResponseEntity.ok(this.dailyTaskService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param dailyTask 实体
     * @return 新增结果
     */
    @PostMapping("/add")
    public ResponseEntity<DailyTask> add(DailyTask dailyTask) {
        return ResponseEntity.ok(this.dailyTaskService.insert(dailyTask));
    }

    /**
     * 编辑数据
     *
     * @param dailyTask 实体
     * @return 编辑结果
     */
    @PostMapping("/update")
    public ResponseEntity<DailyTask> edit(DailyTask dailyTask) {
        return ResponseEntity.ok(this.dailyTaskService.update(dailyTask));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @PostMapping("/delete")
    public ResponseEntity<Boolean> deleteById(String id) {
        return ResponseEntity.ok(this.dailyTaskService.deleteById(id));
    }

}

