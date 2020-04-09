package com.ehi.execl.easypoi.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * ClassName: s
 *
 * @Author: WangYiHai
 * @Date: 2020/4/9 11:55
 * @Description: TODO
 */

@TableName(value = "seckill")
public class DemoExcel {

    @TableId(value ="seckill_id" ,type = IdType.AUTO)
    @Excel(name = "id" ,orderNum = "0")
    private Long seckillId;

    @TableField(value = "name")
    @Excel(name = "姓名" ,orderNum = "1")
    private String name;

    @TableField(value = "number")
    @Excel(name = "数量" ,orderNum = "2")
    private int number;

    @TableField(value = "start_time")
    @Excel(name = "开始日期" ,orderNum = "3",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @TableField(value = "end_time")
    @Excel(name = "结束日期" ,orderNum = "4",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @TableField(value = "create_time")
    @Excel(name = "创建日期" ,orderNum = "5",importFormat = "yyyy-MM-dd HH:mm:ss")//exportFormat = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "DemoExcel{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }

}