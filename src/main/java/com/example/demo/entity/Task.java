package com.example.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

/**
 * description:任务实体类
 *
 * @package:com.example.demo.entity
 * @author:HP
 * @date:2019/7/8
 * @time:14:41
 */
@Document(collection = "task")
public class Task implements Serializable {
    @Id
    private String id;
    /**
     * 任务名
     */
    @Field("task_name")
    private String taskName;
    /**
     * 发布人
     */
    @Field("publisher")
    private String publisher;
    /**
     * 处理人
     */
    @Field("principal")
    private String principle;
    /**
     * 发布日期
     */
    @Field("publish_time")
    private Date publishTime;
    /**
     * 要求完成日期
     */
    @Field("expected_time")
    private Date expectedTime;
    /**
     * 任务概述
     */
    @Field("task_overview")
    private String taskOverview;
    /**
     * 任务详细描述
     */
    @Field("task_detail")
    private String taskDetail;
    /**
     * 完成任务需要知道的相关信息
     */
    @Field("premise")
    private String premise;
    /**
     * 当前进度
     */
    @Field("schedule")
    private String schedule;
    /**
     * 是否完成
     */
    @Field("accomplishment")
    private String accomplishment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getExpectedTime() {
        return expectedTime;
    }

    public void setExpectedTime(Date expectedTime) {
        this.expectedTime = expectedTime;
    }

    public String getTaskOverview() {
        return taskOverview;
    }

    public void setTaskOverview(String taskOverview) {
        this.taskOverview = taskOverview;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public String getPremise() {
        return premise;
    }

    public void setPremise(String premise) {
        this.premise = premise;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getAccomplishment() {
        return accomplishment;
    }

    public void setAccomplishment(String accomplishment) {
        this.accomplishment = accomplishment;
    }
}
