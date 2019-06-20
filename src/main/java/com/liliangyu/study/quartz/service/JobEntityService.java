package com.liliangyu.study.quartz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liliangyu.study.quartz.entity.JobEntity;
import org.quartz.SchedulerException;

/**
 * @author liliangyu
 * @date 2019/6/18
 */
public interface JobEntityService extends IService<JobEntity> {


    /**
     * 新增job
     * @param quartz
     * @return
     */

    void saveJob(JobEntity quartz)throws ClassNotFoundException,SchedulerException;

    /**
     * 手动触发
     * @param id
     * @throws SchedulerException 任务触发失败
     * @return
     */
    void triggerJob(Long id)throws SchedulerException;

    /**
     * 暂停job
     * @param id
     * @return
     */
    void pauseJob(Long  id) throws SchedulerException;

    /**
     * 恢复job
     * @param id
      * @throws SchedulerException 任务触发失败
     * @return
     */
    void resumeJob(Long  id)throws SchedulerException;

    /**
     * 移除job
     * @param id
     * @return
     */
    void removeJob(Long  id)throws SchedulerException;



    void updateJob(JobEntity quartz);

    /**
     *
     * @param job
     */
     void schedulerJob(JobEntity job)throws ClassNotFoundException,SchedulerException ;

}
