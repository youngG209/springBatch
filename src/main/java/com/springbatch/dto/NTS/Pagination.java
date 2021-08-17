package com.springbatch.dto.NTS;

import java.io.Serializable;

/**
 * 데이터그리드 페이지네이션 관련 클래스와 검색조건을 얻는 팩토리
 */
public class Pagination implements Serializable {


    private static final long serialVersionUID = -1083795121902564079L;

    private int pagingBlock = 5;

    /**
     * 페이지당 갯수.
     */
    private int countPerPage = 20;

    /**
     * 검색할 페이지
     */
    private int pageNo = 1;

    private int totalCount;

    public int getCountPerPage() {
        return countPerPage;
    }

    public void setCountPerPage(int countPerPage) {
        this.countPerPage = countPerPage;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPagingBlock() {
        return pagingBlock;
    }

    public void setPagingBlock(int pagingBlock) {
        this.pagingBlock = pagingBlock;
    }


    public int getMaxPage() {
        int maxPage = getTotalCount() / getCountPerPage();
        if (getTotalCount() % getCountPerPage() != 0)
            maxPage++;
        return maxPage;
    }

    public int getPagingStart() {
        return ((getPageNo() - 1) / getPagingBlock()) * getPagingBlock() + 1;
    }

    public int getPagingEnd() {
        int pagingEnd = getPagingStart() + getPagingBlock() - 1;
        return pagingEnd > getMaxPage() ? getMaxPage() : pagingEnd;
    }

    public int getStart() {
        return getEnd() - getCountPerPage() + 1;
    }

    public int getEnd() {
        return getPageNo() * getCountPerPage();
    }

	@Override
	public String toString() {
		return "Pagination [pagingBlock=" + pagingBlock + ", countPerPage=" + countPerPage + ", pageNo=" + pageNo
				+ ", totalCount=" + totalCount + "]";
	}
    
}
