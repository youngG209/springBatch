package com.springbatch.dto.NTS;

import java.io.Serializable;

/**
 * 정렬조건
 */
public class Sort<SORT_COLUMN_TYPE extends Enum<SORT_COLUMN_TYPE>> implements Serializable {

    private static final long serialVersionUID = 6405189152130358327L;

    private SORT_COLUMN_TYPE id;
    private SortDirectionType direction;

    public SORT_COLUMN_TYPE getId() {
        return id;
    }

    public void setId(SORT_COLUMN_TYPE id) {
        this.id = id;
    }

    public SortDirectionType getDirection() {
        return direction;
    }

    public void setDirection(SortDirectionType direction) {
        this.direction = direction;
    }
}
