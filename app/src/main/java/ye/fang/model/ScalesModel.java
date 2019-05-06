package ye.fang.model;

public class ScalesModel {

    /**
     * ID : 07c5d286-d493-4929-9904-d8bc28c44246
     * MarketID : -
     * CommercialID : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * ScalesNo : 7
     * ScalesName : 7号秤
     * MachineCode : 00250031-34364713-32373838
     * Model : ADS-30E CC006 V1.26(连锁版)D
     * Identification : R0010563
     * CreateDate : 2018-10-22 20:53:24
     * CreateUserId : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * CreateUserName : 净月
     * ModifyDate : 2018-10-22 20:53:24
     * ModifyUserId : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * ModifyUserName : 净月
     * Account : null
     * Password : null
     * RealName : null
     * ManagerId : null
     * Manager : null
     * OrganizeId : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * DepartmentId : null
     * RoleId : null
     * DutyId : 1
     * DutyName : 忱晖生鲜超市
     * PostId : null
     * PostName : null
     * WorkGroupId : null
     * SecurityLevel : null
     * UserOnLine : 1
     * OpenId : null
     * Question : null
     * AnswerQuestion : null
     * CheckOnLine : null
     * AllowStartTime : null
     * AllowEndTime : null
     * LockStartDate : null
     * LockEndDate : null
     * FirstVisit : 2018-10-06 18:17:16
     * PreviousVisit : 2018-12-23 22:31:30
     * LastVisit : 2018-12-23 22:35:24
     * SortCode : null
     * DeleteMark : null
     * EnabledMark : null
     * Description : null
     * Appid : VTDBprdXuGTQMHi
     * AppSecret : h84eHzZfJRARAH2CqkywTVEkeSZzFkaS
     * ClassID : 7
     */

    private String ID;
    private String MarketID;
    private String CommercialID;
    private String ScalesNo;
    private String ScalesName;
    private String MachineCode;
    private String Model;
    private String Identification;
    private String CreateDate;
    private String CreateUserId;
    private String CreateUserName;
    private String ModifyDate;
    private String ModifyUserId;
    private String ModifyUserName;
    private Object Account;
    private Object Password;
    private Object RealName;
    private Object ManagerId;
    private Object Manager;
    private String OrganizeId;
    private Object DepartmentId;
    private Object RoleId;
    private String DutyId;
    private String DutyName;
    private Object PostId;
    private Object PostName;
    private Object WorkGroupId;
    private Object SecurityLevel;
    private int UserOnLine;
    private Object OpenId;
    private Object Question;
    private Object AnswerQuestion;
    private Object CheckOnLine;
    private Object AllowStartTime;
    private Object AllowEndTime;
    private Object LockStartDate;
    private Object LockEndDate;
    private String FirstVisit;
    private String PreviousVisit;
    private String LastVisit;
    private Object SortCode;
    private Object DeleteMark;
    private Object EnabledMark;
    private Object Description;
    private String Appid;
    private String AppSecret;
    private int ClassID;

    public static ScalesModel objectFromData(String str) {

        return new com.google.gson.Gson().fromJson(str, ScalesModel.class);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMarketID() {
        return MarketID;
    }

    public void setMarketID(String MarketID) {
        this.MarketID = MarketID;
    }

    public String getCommercialID() {
        return CommercialID;
    }

    public void setCommercialID(String CommercialID) {
        this.CommercialID = CommercialID;
    }

    public String getScalesNo() {
        return ScalesNo;
    }

    public void setScalesNo(String ScalesNo) {
        this.ScalesNo = ScalesNo;
    }

    public String getScalesName() {
        return ScalesName;
    }

    public void setScalesName(String ScalesName) {
        this.ScalesName = ScalesName;
    }

    public String getMachineCode() {
        return MachineCode;
    }

    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String Identification) {
        this.Identification = Identification;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    public String getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(String CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    public String getCreateUserName() {
        return CreateUserName;
    }

    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    public String getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    public String getModifyUserId() {
        return ModifyUserId;
    }

    public void setModifyUserId(String ModifyUserId) {
        this.ModifyUserId = ModifyUserId;
    }

    public String getModifyUserName() {
        return ModifyUserName;
    }

    public void setModifyUserName(String ModifyUserName) {
        this.ModifyUserName = ModifyUserName;
    }

    public Object getAccount() {
        return Account;
    }

    public void setAccount(Object Account) {
        this.Account = Account;
    }

    public Object getPassword() {
        return Password;
    }

    public void setPassword(Object Password) {
        this.Password = Password;
    }

    public Object getRealName() {
        return RealName;
    }

    public void setRealName(Object RealName) {
        this.RealName = RealName;
    }

    public Object getManagerId() {
        return ManagerId;
    }

    public void setManagerId(Object ManagerId) {
        this.ManagerId = ManagerId;
    }

    public Object getManager() {
        return Manager;
    }

    public void setManager(Object Manager) {
        this.Manager = Manager;
    }

    public String getOrganizeId() {
        return OrganizeId;
    }

    public void setOrganizeId(String OrganizeId) {
        this.OrganizeId = OrganizeId;
    }

    public Object getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(Object DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    public Object getRoleId() {
        return RoleId;
    }

    public void setRoleId(Object RoleId) {
        this.RoleId = RoleId;
    }

    public String getDutyId() {
        return DutyId;
    }

    public void setDutyId(String DutyId) {
        this.DutyId = DutyId;
    }

    public String getDutyName() {
        return DutyName;
    }

    public void setDutyName(String DutyName) {
        this.DutyName = DutyName;
    }

    public Object getPostId() {
        return PostId;
    }

    public void setPostId(Object PostId) {
        this.PostId = PostId;
    }

    public Object getPostName() {
        return PostName;
    }

    public void setPostName(Object PostName) {
        this.PostName = PostName;
    }

    public Object getWorkGroupId() {
        return WorkGroupId;
    }

    public void setWorkGroupId(Object WorkGroupId) {
        this.WorkGroupId = WorkGroupId;
    }

    public Object getSecurityLevel() {
        return SecurityLevel;
    }

    public void setSecurityLevel(Object SecurityLevel) {
        this.SecurityLevel = SecurityLevel;
    }

    public int getUserOnLine() {
        return UserOnLine;
    }

    public void setUserOnLine(int UserOnLine) {
        this.UserOnLine = UserOnLine;
    }

    public Object getOpenId() {
        return OpenId;
    }

    public void setOpenId(Object OpenId) {
        this.OpenId = OpenId;
    }

    public Object getQuestion() {
        return Question;
    }

    public void setQuestion(Object Question) {
        this.Question = Question;
    }

    public Object getAnswerQuestion() {
        return AnswerQuestion;
    }

    public void setAnswerQuestion(Object AnswerQuestion) {
        this.AnswerQuestion = AnswerQuestion;
    }

    public Object getCheckOnLine() {
        return CheckOnLine;
    }

    public void setCheckOnLine(Object CheckOnLine) {
        this.CheckOnLine = CheckOnLine;
    }

    public Object getAllowStartTime() {
        return AllowStartTime;
    }

    public void setAllowStartTime(Object AllowStartTime) {
        this.AllowStartTime = AllowStartTime;
    }

    public Object getAllowEndTime() {
        return AllowEndTime;
    }

    public void setAllowEndTime(Object AllowEndTime) {
        this.AllowEndTime = AllowEndTime;
    }

    public Object getLockStartDate() {
        return LockStartDate;
    }

    public void setLockStartDate(Object LockStartDate) {
        this.LockStartDate = LockStartDate;
    }

    public Object getLockEndDate() {
        return LockEndDate;
    }

    public void setLockEndDate(Object LockEndDate) {
        this.LockEndDate = LockEndDate;
    }

    public String getFirstVisit() {
        return FirstVisit;
    }

    public void setFirstVisit(String FirstVisit) {
        this.FirstVisit = FirstVisit;
    }

    public String getPreviousVisit() {
        return PreviousVisit;
    }

    public void setPreviousVisit(String PreviousVisit) {
        this.PreviousVisit = PreviousVisit;
    }

    public String getLastVisit() {
        return LastVisit;
    }

    public void setLastVisit(String LastVisit) {
        this.LastVisit = LastVisit;
    }

    public Object getSortCode() {
        return SortCode;
    }

    public void setSortCode(Object SortCode) {
        this.SortCode = SortCode;
    }

    public Object getDeleteMark() {
        return DeleteMark;
    }

    public void setDeleteMark(Object DeleteMark) {
        this.DeleteMark = DeleteMark;
    }

    public Object getEnabledMark() {
        return EnabledMark;
    }

    public void setEnabledMark(Object EnabledMark) {
        this.EnabledMark = EnabledMark;
    }

    public Object getDescription() {
        return Description;
    }

    public void setDescription(Object Description) {
        this.Description = Description;
    }

    public String getAppid() {
        return Appid;
    }

    public void setAppid(String Appid) {
        this.Appid = Appid;
    }

    public String getAppSecret() {
        return AppSecret;
    }

    public void setAppSecret(String AppSecret) {
        this.AppSecret = AppSecret;
    }

    public int getClassID() {
        return ClassID;
    }

    public void setClassID(int ClassID) {
        this.ClassID = ClassID;
    }
}

