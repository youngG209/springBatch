package com.springbatch.dto.NTS;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

/**
 * Company
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Company extends Pagination implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2473086732411199008L;

	private long   id                  ; //사업자 고유일련번호
	private String registNum           ; //사업자 등록번호
	private String name                ; //상호·법인명
	private String pwd                 ; //비밀번호
	private String type                ; //사업자 유형
	private String subType             ; //사업자 유형(Sub Type)
	private String subTypeDesc		   ; //사업자 유형
	private String state               ; //진행 상태 코드
	private String stateDesc           ; //진행 상태
	private String manageNo            ; //관리번호
	private String useYn               ; //사용여부
	private String privateAgreeYn      ; //개인정보 약관 동의 여부
	private String representName       ; //대표자명
	private String managerName         ; //담당자명
	private String managerTel          ; //담당자 전화번호
	private String managerHp           ; //담당자 휴대폰번호
	private String managerEmail        ; //담당자 이메일
	private String zipCode            ; //우편번호
	private String addrMain            ; //주소1 필수
	private String addrDetail          ; //주소2 상세
	private String addr                ; //전체 주소
	private double gpsX                ; //GPS X좌표
	private double gpsY                ; //GPS Y좌표
	private int    viewCount           ; //조회수
	private String startDate           ; //시작일
	private String endDate             ; //종료일
	private String sdd           ; //시작일
	private String edd             ; //종료일
	private String authCode            ; //인증 번호
	private String authExpireDate      ; //인증 유효기간
	private String tempPwd             ; //임시 패스워드
	private String tempExpireDate      ; //임시 패스워드 유효기간
	private String companyRegDate      ; //회사 등록일시. 접수일자
	private String companyUpdateDate   ; //회사 수정일시
	private String adminUpdateUser     ; //관리자 수정자
	private String adminUpdateDate     ; //관리자 수정일시
	private String uniqueNumber        ; //인증서 번호

	private String busiType            ; //사업자구분
	private String receiptType         ; //접수구분
//	private String recpDate            ; //접수일자
	private String contents            ; //비고
	private String museumGallery       ; //운영박물관 / 미술관명
	
	private String offlineYn             ; //사업자 구분 : 오프라인 여부
	private String onlineYn              ; //사업자 구분 : 온라인 여부
	private String offlineAllYn          ; // 오프라인 사업자 : 카드현금결제
	private String offlineEnterYn        ; // 오프라인 사업자 : 현금결제
	private String onlineSaleYn          ; //온라인 사업자 : 판매업자 여부
	private String onlineCommissionYn    ; //온라인 사업자 : 판매중개업자 여부
	private String onlineEnterYn         ; //온라인 사업자 : 판매중개 플랫폼에 입점한 사업자 여부
	private String receiptBookYn         ; //접수 구분 : 도서 여부
	private String receiptConcertYn      ; //접수 구분 : 공연 여부
	private String receiptMuseumYn       ; //접수 구분 : 박물관 여부
	private String receiptGalleryYn      ; //접수 구분 : 미술관 여부
	private String receiptNewsPaperYn    ; //접수 구분 : 신문 여부
	private String receiptDeductionEtcYn ; //접수 구분 : 문화비 소득공제 대상 품목+이외 재화 판매 여부
	private String receiptDeductionEtcYnOrg ;
	
	private String storeName             ; //가맹점명
	private String pccName               ; //카드사/PG사
	private String num                   ; //가맹점번호
	private String modCode               ; //변경유형
	private String sido                  ; //광역시/도
	
	private String yearTaxAmt            ; //1년치 매출 과세 표준 금액
	
	private List<String> museumGalleryNames; //박물관/미술관 명
	
    private String regGubun         ; //등록주체 구분

	private String privateYn    ;
	
    /**
     * 가맹점정보 목록
     */
    private List<CompanyStore> companyStore;

	private long   tempId              ; //사업자 임시 고유일련번호(변경요청 Sequence ID)
	
	private long   rowNum              ; //Row number
    private String status              ;
    private String msg                 ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRegistNum() {
		return registNum;
	}

	public void setRegistNum(String registNum) {
		this.registNum = registNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateDesc() {
		return stateDesc;
	}

	public void setStateDesc(String stateDesc) {
		this.stateDesc = stateDesc;
	}

	public String getManageNo() {
		return manageNo;
	}

	public void setManageNo(String manageNo) {
		this.manageNo = manageNo;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getPrivateAgreeYn() {
		return privateAgreeYn;
	}

	public void setPrivateAgreeYn(String privateAgreeYn) {
		this.privateAgreeYn = privateAgreeYn;
	}

	public String getRepresentName() {
		return representName;
	}

	public void setRepresentName(String representName) {
		this.representName = representName;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerTel() {
		return managerTel;
	}

	public void setManagerTel(String managerTel) {
		this.managerTel = managerTel;
	}

	public String getManagerHp() {
		return managerHp;
	}

	public void setManagerHp(String managerHp) {
		this.managerHp = managerHp;
	}

	public String getManagerEmail() {
		return managerEmail;
	}

	public void setManagerEmail(String managerEmail) {
		this.managerEmail = managerEmail;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddrMain() {
		return addrMain;
	}

	public void setAddrMain(String addrMain) {
		this.addrMain = addrMain;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public double getGpsX() {
		return gpsX;
	}

	public void setGpsX(double gpsX) {
		this.gpsX = gpsX;
	}

	public double getGpsY() {
		return gpsY;
	}

	public void setGpsY(double gpsY) {
		this.gpsY = gpsY;
	}

	public int getViewCount() {
		return viewCount;
	}

	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
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

	public String getAuthCode() {
		return authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthExpireDate() {
		return authExpireDate;
	}

	public void setAuthExpireDate(String authExpireDate) {
		this.authExpireDate = authExpireDate;
	}

	public String getTempPwd() {
		return tempPwd;
	}

	public void setTempPwd(String tempPwd) {
		this.tempPwd = tempPwd;
	}

	public String getTempExpireDate() {
		return tempExpireDate;
	}

	public void setTempExpireDate(String tempExpireDate) {
		this.tempExpireDate = tempExpireDate;
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

	public String getUniqueNumber() {
		return uniqueNumber;
	}

	public void setUniqueNumber(String uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}

	public String getBusiType() {
		return busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	public String getReceiptType() {
		return receiptType;
	}

	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

//	public String getRecpDate() {
//		return recpDate;
//	}
//
//	public void setRecpDate(String recpDate) {
//		this.recpDate = recpDate;
//	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getMuseumGallery() {
		return museumGallery;
	}

	public void setMuseumGallery(String museumGallery) {
		this.museumGallery = museumGallery;
	}

	
	public String getOfflineYn() {
		return offlineYn;
	}

	public void setOfflineYn(String offlineYn) {
		this.offlineYn = offlineYn;
	}

	public String getOnlineYn() {
		return onlineYn;
	}

	public void setOnlineYn(String onlineYn) {
		this.onlineYn = onlineYn;
	}

	public String getOnlineSaleYn() {
		return onlineSaleYn;
	}

	public void setOnlineSaleYn(String onlineSaleYn) {
		this.onlineSaleYn = onlineSaleYn;
	}

	public String getOnlineCommissionYn() {
		return onlineCommissionYn;
	}

	public void setOnlineCommissionYn(String onlineCommissionYn) {
		this.onlineCommissionYn = onlineCommissionYn;
	}

	public String getOnlineEnterYn() {
		return onlineEnterYn;
	}

	public void setOnlineEnterYn(String onlineEnterYn) {
		this.onlineEnterYn = onlineEnterYn;
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

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getPccName() {
		return pccName;
	}

	public void setPccName(String pccName) {
		this.pccName = pccName;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}


	public String getModCode() {
		return modCode;
	}

	public void setModCode(String modCode) {
		this.modCode = modCode;
	}

	public String getSido() {
		return sido;
	}

	public void setSido(String sido) {
		this.sido = sido;
	}

	public String getYearTaxAmt() {
		return yearTaxAmt;
	}

	public void setYearTaxAmt(String yearTaxAmt) {
		this.yearTaxAmt = yearTaxAmt;
	}

	public List<String> getMuseumGalleryNames() {
		return museumGalleryNames;
	}

	public void setMuseumGalleryNames(List<String> museumGalleryNames) {
		this.museumGalleryNames = museumGalleryNames;
	}

	public List<CompanyStore> getCompanyStore() {
		return companyStore;
	}

	public void setCompanyStore(List<CompanyStore> companyStore) {
		this.companyStore = companyStore;
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

	public String getRegGubun() {
		return regGubun;
	}

	public void setRegGubun(String regGubun) {
		this.regGubun = regGubun;
	}

	public String getSdd() {
		return sdd;
	}

	public void setSdd(String sdd) {
		this.sdd = sdd;
	}

	public String getEdd() {
		return edd;
	}

	public void setEdd(String edd) {
		this.edd = edd;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", registNum=" + registNum + ", name=" + name + ", pwd=" + pwd + ", type=" + type
				+ ", subType=" + subType + ", state=" + state + ", stateDesc=" + stateDesc + ", manageNo=" + manageNo
				+ ", useYn=" + useYn + ", privateAgreeYn=" + privateAgreeYn + ", representName=" + representName
				+ ", managerName=" + managerName + ", managerTel=" + managerTel + ", managerHp=" + managerHp
				+ ", managerEmail=" + managerEmail + ", zipCode=" + zipCode + ", addrMain=" + addrMain + ", addrDetail="
				+ addrDetail + ", addr=" + addr + ", gpsX=" + gpsX + ", gpsY=" + gpsY + ", viewCount=" + viewCount
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", authCode=" + authCode + ", authExpireDate="
				+ authExpireDate + ", tempPwd=" + tempPwd + ", tempExpireDate=" + tempExpireDate + ", companyRegDate="
				+ companyRegDate + ", companyUpdateDate=" + companyUpdateDate + ", adminUpdateUser=" + adminUpdateUser
				+ ", adminUpdateDate=" + adminUpdateDate + ", uniqueNumber=" + uniqueNumber + ", busiType=" + busiType
				+ ", receiptType=" + receiptType + ", contents=" + contents + ", museumGallery=" + museumGallery
				+ ", offlineYn=" + offlineYn + ", onlineYn=" + onlineYn + ", onlineSaleYn=" + onlineSaleYn
				+ ", onlineCommissionYn=" + onlineCommissionYn + ", onlineEnterYn=" + onlineEnterYn + ", receiptBookYn="
				+ receiptBookYn + ", receiptConcertYn=" + receiptConcertYn + ", receiptMuseumYn=" + receiptMuseumYn
				+ ", receiptGalleryYn=" + receiptGalleryYn + ", receiptDeductionEtcYn=" + receiptDeductionEtcYn
				+ ", storeName=" + storeName + ", pccName=" + pccName + ", num=" + num + ", modCode=" + modCode
				+ ", sido=" + sido + ", yearTaxAmt=" + yearTaxAmt + ", museumGalleryNames=" + museumGalleryNames
				+ ", regGubun=" + regGubun + ", companyStore=" + companyStore + ", tempId=" + tempId + ", rowNum="
				+ rowNum + ", status=" + status + ", msg=" + msg + "]";
	}

	public String getSubTypeDesc() {
		return subTypeDesc;
	}

	public void setSubTypeDesc(String subTypeDesc) {
		this.subTypeDesc = subTypeDesc;
	}

	public String getReceiptDeductionEtcYnOrg() {
		return receiptDeductionEtcYnOrg;
	}

	public void setReceiptDeductionEtcYnOrg(String receiptDeductionEtcYnOrg) {
		this.receiptDeductionEtcYnOrg = receiptDeductionEtcYnOrg;
	}

	public String getOfflineAllYn() {
		return offlineAllYn;
	}

	public void setOfflineAllYn(String offlineAllYn) {
		this.offlineAllYn = offlineAllYn;
	}

	public String getOfflineEnterYn() {
		return offlineEnterYn;
	}

	public void setOfflineEnterYn(String offlineEnterYn) {
		this.offlineEnterYn = offlineEnterYn;
	}

	public String getReceiptNewsPaperYn() {
		return receiptNewsPaperYn;
	}

	public void setReceiptNewsPaperYn(String receiptNewsPaperYn) {
		this.receiptNewsPaperYn = receiptNewsPaperYn;
	}

	public String getPrivateYn() {
		return privateYn;
	}

	public void setPrivateYn(String privateYn) {
		this.privateYn = privateYn;
	}
}
