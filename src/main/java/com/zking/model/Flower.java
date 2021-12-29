package com.zking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class Flower {
    private Integer fid;

    private String fname;

    private Float fprice;

    private String fimg;


}