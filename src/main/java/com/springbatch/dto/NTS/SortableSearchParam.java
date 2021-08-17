package com.springbatch.dto.NTS;

public class SortableSearchParam<COLUMN_TYPE extends Enum<COLUMN_TYPE>> extends SearchParam{

    private static final long serialVersionUID = -2631993039167658903L;

    /**
     * 정렬 목적의 컬럼값
     */
    private Sort<COLUMN_TYPE> sort;

    public Sort<COLUMN_TYPE> getSort() {
        return sort;
    }

    public void setSort(Sort<COLUMN_TYPE> sort) {
        this.sort = sort;
    }
}
