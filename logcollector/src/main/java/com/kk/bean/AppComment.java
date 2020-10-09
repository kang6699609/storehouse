package com.kk.bean;

import lombok.Data;

/**
 * @author yxk
 *  评论
 */
@Data
public class AppComment {
    private int comment_id;//评论表
    private int userid;//用户 id
    private int p_comment_id;//父级评论 id(为 0 则是一级评论,不为 0 则是回复)
    private String content;//评论内容
    private String addtime;//创建时间
    private int other_id;//评论的相关 id
    private int praise_count;//点赞数量
    private int reply_count;//回复数量
}
