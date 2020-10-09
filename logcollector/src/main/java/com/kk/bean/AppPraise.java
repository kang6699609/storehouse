package com.kk.bean;

import lombok.Data;

/**
 * @author yxk
 *  点赞
 */
@Data
public class AppPraise {
    private int id; //主键 id
    private int userid;//用户 id
    private int target_id;//点赞的对象 id
    private int type;//点赞类型 1 问答点赞 2 问答评论点赞 3 文章点赞数 4 评论点赞
    private String add_time;//添加时间
}
