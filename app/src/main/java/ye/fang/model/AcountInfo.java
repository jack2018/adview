package ye.fang.model;

import com.google.gson.Gson;

public class AcountInfo {

    /**
     * ID : d954703f-dcc3-4030-88e7-c9f739980d84
     * Photo : ../../Resource/DocumentFile/System/20181205/01.png
     * Photo1 : ../../Resource/DocumentFile/System/20181226/head.jpg
     * Photo2 : ../../Resource/DocumentFile/System/20181226/head.jpg
     * Photo3 : ../../Resource/DocumentFile/System/20181224/QQ截图20181220004453.png
     * Description : null
     * Boothid : dt030
     * MName : 一号
     * SBusiness : 淡水鱼类
     * ODuration : 12.0
     * CRating : A
     * Relationship : 群众
     * RSchooling : 大学
     * Contact : 123
     * MarketName : 斗潭农贸市场
     * AgeID : null
     * Age : 1213
     * Sex : 男
     * MarketID : 0001
     * OrganizeId : null
     * CreateDate : null
     * CreateUserId : null
     * CreateUserName : null
     * ModifyDate : null
     * ModifyUserId : null
     * ModifyUserName : null
     */

    private String ID;
    private String Photo;
    private String Photo1;
    private String Photo2;
    private String Photo3;
    private Object Description;
    private String Boothid;
    private String MName;
    private String SBusiness;
    private double ODuration;
    private String CRating;
    private String Relationship;
    private String RSchooling;
    private String Contact;
    private String MarketName;
    private Object AgeID;
    private String Age;
    private String Sex;
    private String MarketID;
    private Object OrganizeId;
    private Object CreateDate;
    private Object CreateUserId;
    private Object CreateUserName;
    private Object ModifyDate;
    private Object ModifyUserId;
    private Object ModifyUserName;

    public static AcountInfo objectFromData(String str) {

        return new Gson().fromJson(str, AcountInfo.class);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getPhoto1() {
        return Photo1;
    }

    public void setPhoto1(String Photo1) {
        this.Photo1 = Photo1;
    }

    public String getPhoto2() {
        return Photo2;
    }

    public void setPhoto2(String Photo2) {
        this.Photo2 = Photo2;
    }

    public String getPhoto3() {
        return Photo3;
    }

    public void setPhoto3(String Photo3) {
        this.Photo3 = Photo3;
    }

    public Object getDescription() {
        return Description;
    }

    public void setDescription(Object Description) {
        this.Description = Description;
    }

    public String getBoothid() {
        return Boothid;
    }

    public void setBoothid(String Boothid) {
        this.Boothid = Boothid;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getSBusiness() {
        return SBusiness;
    }

    public void setSBusiness(String SBusiness) {
        this.SBusiness = SBusiness;
    }

    public double getODuration() {
        return ODuration;
    }

    public void setODuration(double ODuration) {
        this.ODuration = ODuration;
    }

    public String getCRating() {
        return CRating;
    }

    public void setCRating(String CRating) {
        this.CRating = CRating;
    }

    public String getRelationship() {
        return Relationship;
    }

    public void setRelationship(String Relationship) {
        this.Relationship = Relationship;
    }

    public String getRSchooling() {
        return RSchooling;
    }

    public void setRSchooling(String RSchooling) {
        this.RSchooling = RSchooling;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getMarketName() {
        return MarketName;
    }

    public void setMarketName(String MarketName) {
        this.MarketName = MarketName;
    }

    public Object getAgeID() {
        return AgeID;
    }

    public void setAgeID(Object AgeID) {
        this.AgeID = AgeID;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getMarketID() {
        return MarketID;
    }

    public void setMarketID(String MarketID) {
        this.MarketID = MarketID;
    }

    public Object getOrganizeId() {
        return OrganizeId;
    }

    public void setOrganizeId(Object OrganizeId) {
        this.OrganizeId = OrganizeId;
    }

    public Object getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Object CreateDate) {
        this.CreateDate = CreateDate;
    }

    public Object getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(Object CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    public Object getCreateUserName() {
        return CreateUserName;
    }

    public void setCreateUserName(Object CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    public Object getModifyDate() {
        return ModifyDate;
    }

    public void setModifyDate(Object ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    public Object getModifyUserId() {
        return ModifyUserId;
    }

    public void setModifyUserId(Object ModifyUserId) {
        this.ModifyUserId = ModifyUserId;
    }

    public Object getModifyUserName() {
        return ModifyUserName;
    }

    public void setModifyUserName(Object ModifyUserName) {
        this.ModifyUserName = ModifyUserName;
    }
}
