package com.idwxy.clock.common;

// 返回封装数据
public class ResultObject {

    // 结果
    private double result;
    // 状态
    private String status;
    // 原因
    private String reason;

    // 构造函数
    public ResultObject() {
        super();
    }

    public ResultObject(double result, String status, String reason) {
        super();
        this.result = result;
        this.status = status;
        this.reason = reason;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "ResultObject [result=" + result + ",status=" + status + ",reason=" + reason + "]";
    }
}
