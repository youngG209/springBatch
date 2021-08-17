package com.springbatch.dto.NTS;

import java.io.Serializable;

/**
 * 조회 조건
 */
public class SearchParam extends Pagination implements Serializable {


    private static final long serialVersionUID = -7250747252989622320L;

    private String searchType;

    private String searchKeyword;

    /**
     * 데이터테이블이 보내는 시작 row number
     */
    private Integer startRowNumber;

    /**
     * 데이터테이블이 보내는 페이지당 rows
     */
    private Integer rowsCountPerPage;

    public Integer getEndRowNumber(){
        return (startRowNumber == null ? 0 : startRowNumber) + (rowsCountPerPage == null ? 1 : rowsCountPerPage) - 1;
    }

    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getSearchKeyword() {
        return searchKeyword;
    }

    public void setSearchKeyword(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    public Integer getStartRowNumber() {
        return startRowNumber;
    }

    public void setStartRowNumber(Integer startRowNumber) {
        this.startRowNumber = startRowNumber;
    }

    public Integer getRowsCountPerPage() {
        return rowsCountPerPage;
    }

    public void setRowsCountPerPage(Integer rowsCountPerPage) {
        this.rowsCountPerPage = rowsCountPerPage;
    }
}
