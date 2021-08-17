package com.springbatch.dto.NTS;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * CompanyStore
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CompanyStore extends Pagination implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 340922791171366576L;
	
	private long   id         ; //사업자 가맹점 정보 고유일련번호
	private long   companyId  ; //사업자 고유일련번호
	private String type       ; //가맹점 유형
	private String pccGroupCd ; //공통그룹코드(PG, CARD, CASH 그룹코드)
	private String pccCd      ; //카드사코드, 공통코드(PG, CARD, CASH 그룹코드)
	private String pccName    ; //카드사명
	private String directName ; //직접입력명
	private String num        ; //가맹점번호
	private String startDate  ; //시작일
	private String endDate    ; //종료일
	

	private String companyRegDate   ; //사업자 등록일시
	private String companyUpdateDate; //사업자 수정일시
	private String adminRegUser     ; //등록 관리자 ID
	private String adminRegDate     ; //관리자 등록일시
	private String adminUpdateUser  ; //업데이트 관리자 ID
	private String adminUpdateDate  ; //관리자 업데이트 일시

	private String storeName        ; //가맹점명
	private String storeTypeName    ; //가맹점타입명
	private String offlineStoreName ; //오프라인 가맹점명
	private String pgStoreName      ; //PG 가맹점명

	private long   tempId           ; //사업자 임시 고유일련번호(변경요청 Sequence ID)
	
	private long   rowNum           ; //Row number
    private String status           ;
    private String msg              ;
    private String workType         ;
    private String displayType      ;
    
    private String regGubun         ; //등록주체 구분      

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPccGroupCd() {
		return pccGroupCd;
	}

	public void setPccGroupCd(String pccGroupCd) {
		this.pccGroupCd = pccGroupCd;
	}

	public String getPccCd() {
		return pccCd;
	}

	public void setPccCd(String pccCd) {
		this.pccCd = pccCd;
	}

	public String getPccName() {
		return pccName;
	}

	public void setPccName(String pccName) {
		this.pccName = pccName;
	}

	public String getDirectName() {
		return directName;
	}

	public void setDirectName(String directName) {
		this.directName = directName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public String getCompanyRegDate() {
		return companyRegDate;
	}

	public void setCompanyRegDate(String companyRegDate) {
		this.companyRegDate = companyRegDate;
	}

	public String getCompanyUpdateDate() {
		return companyUpdateDate;
	}

	public void setCompanyUpdateDate(String companyUpdateDate) {
		this.companyUpdateDate = companyUpdateDate;
	}

	public String getAdminRegUser() {
		return adminRegUser;
	}

	public void setAdminRegUser(String adminRegUser) {
		this.adminRegUser = adminRegUser;
	}

	public String getAdminRegDate() {
		return adminRegDate;
	}

	public void setAdminRegDate(String adminRegDate) {
		this.adminRegDate = adminRegDate;
	}

	public String getAdminUpdateUser() {
		return adminUpdateUser;
	}

	public void setAdminUpdateUser(String adminUpdateUser) {
		this.adminUpdateUser = adminUpdateUser;
	}

	public String getAdminUpdateDate() {
		return adminUpdateDate;
	}

	public void setAdminUpdateDate(String adminUpdateDate) {
		this.adminUpdateDate = adminUpdateDate;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getOfflineStoreName() {
		return offlineStoreName;
	}

	public void setOfflineStoreName(String offlineStoreName) {
		this.offlineStoreName = offlineStoreName;
	}

	public String getPgStoreName() {
		return pgStoreName;
	}

	public void setPgStoreName(String pgStoreName) {
		this.pgStoreName = pgStoreName;
	}

	public long getTempId() {
		return tempId;
	}

	public void setTempId(long tempId) {
		this.tempId = tempId;
	}

	public long getRowNum() {
		return rowNum;
	}

	public void setRowNum(long rowNum) {
		this.rowNum = rowNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getWorkType() {
		return workType;
	}

	public void setWorkType(String workType) {
		this.workType = workType;
	}

	public String getDisplayType() {
		return displayType;
	}

	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	public String getRegGubun() {
		return regGubun;
	}

	public void setRegGubun(String regGubun) {
		this.regGubun = regGubun;
	}

	@Override
	public String toString() {
		return "CompanyStore [id=" + id + ", companyId=" + companyId + ", type=" + type + ", pccGroupCd=" + pccGroupCd
				+ ", pccCd=" + pccCd + ", pccName=" + pccName + ", directName=" + directName + ", num=" + num
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", companyRegDate=" + companyRegDate
				+ ", companyUpdateDate=" + companyUpdateDate + ", adminRegUser=" + adminRegUser + ", adminRegDate="
				+ adminRegDate + ", adminUpdateUser=" + adminUpdateUser + ", adminUpdateDate=" + adminUpdateDate
				+ ", storeName=" + storeName + ", offlineStoreName=" + offlineStoreName + ", pgStoreName=" + pgStoreName
				+ ", tempId=" + tempId + ", rowNum=" + rowNum + ", status=" + status + ", msg=" + msg + ", workType="
				+ workType + ", displayType=" + displayType + ", regGubun=" + regGubun + "]";
	}

	public String getStoreTypeName() {
		return storeTypeName;
	}

	public void setStoreTypeName(String storeTypeName) {
		this.storeTypeName = storeTypeName;
	}

}
