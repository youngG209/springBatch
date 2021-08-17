package com.springbatch.dto.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class BatchInfo implements Serializable {
    private static final long serialVersionUID = -7250747252989622320L;

    private int jobInstanceId;
}
