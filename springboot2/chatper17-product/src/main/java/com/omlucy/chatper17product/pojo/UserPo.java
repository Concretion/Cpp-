package com.omlucy.chapteruser.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lucy
 * @date 2021/11/28
 */
@Data
public class UserPo implements Serializable {
    private Long id;
    private String username;
    private String note;
    private Integer level;
}

