package com.zhonghaijun.ssj.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "depot")
public class Depot extends BaseDomain {
    private String name;
    private BigDecimal maxCapacity;// 最大数量，参考值
    private BigDecimal currentCapacity;;// 当前数量，参考值
    private BigDecimal totalAmount;// 当前仓库里面的产品值多少钱


    public Depot(){}

    public Depot(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(BigDecimal maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public BigDecimal getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(BigDecimal currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
}