package com.springbatch.dto.NTS;

import com.springbatch.type.CompanyOrderType;
import com.springbatch.type.CompanySortType;

import java.io.Serializable;
import java.util.List;

public class CompanySearchParam extends SortableSearchParam<CompanySortType> implements Serializable {

	private static final long serialVersionUID = -7605193353970543215L;
	private CompanyOrderType orderType = CompanyOrderType.COMPANY_REG_DATE;
    /**
     * 등록관리 > 신청현황 검색조건
     */
	
    private long id;

    private String searchType;
    private String searchKeyword;
	private List<String> receiptStatusCds;
	private List<String> receiptTypeCds;

    private String searchDateType;
    private DateRange searchDateRange;
    private String searchBusinessType;
    private String searchBusinessSubType;
    private String searchOnOffline;
    
    private List<String> searchHistoryTables;
    private String searchHistoryGubun;
    
    private String startDate;
    private String endDate;
    
    private String receiptBookYn;
    private String receiptConcertYn;
    private String receiptMuseumYn;
    private String receiptGalleryYn;
	private String receiptNewsPaperYn;
    private String receiptDeductionEtcYn;
    
    private String searchState;
    
    private String searchAll;

	private long   tempId; //사업자 임시 고유일련번호(변경요청 Sequence ID)
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public CompanyOrderType getOrderType() {
		return orderType;
	}
	public void setOrderType(CompanyOrderType orderType) {
		this.orderType = orderType;
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

	public List<String> getReceiptStatusCds() {
		return receiptStatusCds;
	}
	public void setReceiptStatusCds(List<String> receiptStatusCds) {
		this.receiptStatusCds = receiptStatusCds;
	}

	public List<String> getReceiptTypeCds() {
		return receiptTypeCds;
	}
	public void setReceiptTypeCds(List<String> receiptTypeCds) {
		this.receiptTypeCds = receiptTypeCds;
	}
	public String getSearchDateType() {
		return searchDateType;
	}
	public void setSearchDateType(String searchDateType) {
		this.searchDateType = searchDateType;
	}
	public DateRange getSearchDateRange() {
		return searchDateRange;
	}
	public void setSearchDateRange(DateRange searchDateRange) {
		this.searchDateRange = searchDateRange;
	}

	public String getSearchBusinessType() {
		return searchBusinessType;
	}
	public void setSearchBusinessType(String searchBusinessType) {
		this.searchBusinessType = searchBusinessType;
	}
	
	public String getSearchBusinessSubType() {
		return searchBusinessSubType;
	}
	public void setSearchBusinessSubType(String searchBusinessSubType) {
		this.searchBusinessSubType = searchBusinessSubType;
	}
	public String getSearchOnOffline() {
		return searchOnOffline;
	}
	public void setSearchOnOffline(String searchOnOffline) {
		this.searchOnOffline = searchOnOffline;
	}

	public List<String> getSearchHistoryTables() {
		return searchHistoryTables;
	}
	public void setSearchHistoryTables(List<String> searchHistoryTables) {
		this.searchHistoryTables = searchHistoryTables;
	}
	public String getSearchHistoryGubun() {
		return searchHistoryGubun;
	}
	public void setSearchHistoryGubun(String searchHistoryGubun) {
		this.searchHistoryGubun = searchHistoryGubun;
	}
	public long getTempId() {
		return tempId;
	}

	public void setTempId(long tempId) {
		this.tempId = tempId;
	}
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getReceiptBookYn() {
		return receiptBookYn;
	}
	public void setReceiptBookYn(String receiptBookYn) {
		this.receiptBookYn = receiptBookYn;
	}
	public String getReceiptConcertYn() {
		return receiptConcertYn;
	}
	public void setReceiptConcertYn(String receiptConcertYn) {
		this.receiptConcertYn = receiptConcertYn;
	}
	public String getReceiptMuseumYn() {
		return receiptMuseumYn;
	}
	public void setReceiptMuseumYn(String receiptMuseumYn) {
		this.receiptMuseumYn = receiptMuseumYn;
	}
	public String getReceiptGalleryYn() {
		return receiptGalleryYn;
	}
	public void setReceiptGalleryYn(String receiptGalleryYn) {
		this.receiptGalleryYn = receiptGalleryYn;
	}
	public String getReceiptDeductionEtcYn() {
		return receiptDeductionEtcYn;
	}
	public void setReceiptDeductionEtcYn(String receiptDeductionEtcYn) {
		this.receiptDeductionEtcYn = receiptDeductionEtcYn;
	}

	public String getReceiptNewsPaperYn() {
		return receiptNewsPaperYn;
	}

	public void setReceiptNewsPaperYn(String receiptNewsPaperYn) {
		this.receiptNewsPaperYn = receiptNewsPaperYn;
	}

	@Override
	public String toString() {
		return "CompanySearchParam [orderType=" + orderType + ", id=" + id + ", searchType=" + searchType
				+ ", searchKeyword=" + searchKeyword + ", receiptStatusCds=" + receiptStatusCds + ", receiptTypeCds="
				+ receiptTypeCds + ", searchDateType=" + searchDateType + ", searchDateRange=" + searchDateRange
				+ ", searchBusinessType=" + searchBusinessType + ", searchBusinessSubType=" + searchBusinessSubType
				+ ", searchOnOffline=" + searchOnOffline + ", searchHistoryTables=" + searchHistoryTables
				+ ", searchHistoryGubun=" + searchHistoryGubun + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", receiptBookYn=" + receiptBookYn + ", receiptConcertYn=" + receiptConcertYn + ", receiptMuseumYn="
				+ receiptMuseumYn + ", receiptGalleryYn=" + receiptGalleryYn + ", receiptDeductionEtcYn="
				+ receiptDeductionEtcYn + ", receiptNewsPaperYn=" + receiptNewsPaperYn +  ", tempId=" + tempId + "]";
	}
	public String getSearchAll() {
		return searchAll;
	}
	public void setSearchAll(String searchAll) {
		this.searchAll = searchAll;
	}
	public String getSearchState() {
		return searchState;
	}
	public void setSearchState(String searchState) {
		this.searchState = searchState;
	}


}
