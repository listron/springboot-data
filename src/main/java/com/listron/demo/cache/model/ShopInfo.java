package com.listron.demo.cache.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopInfo {
    private Long id;
    private String name;
    private Integer level;
    private Double goodCommentRate;
}
