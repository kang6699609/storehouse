package com.kk.bean;

import lombok.Data;

/**
 * @author yxk
 *  错误日志
 */
@Data
public class AppErrorLog {
    private String errorBrief; //错误摘要
    private String errorDetail; //错误详情
}
