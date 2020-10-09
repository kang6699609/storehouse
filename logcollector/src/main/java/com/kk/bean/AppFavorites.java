package com.kk.bean;

import lombok.Data;

/**
 * @author yxk
 *  收藏
 */
@Data
public class AppFavorites {
    private int id;//主键
    private int course_id;//商品 id
    private int userid;//用户 ID
    private String add_time;//创建时间
}
