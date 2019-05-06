package ye.fang.model;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.Comparator;

/**
 * Created by 18650 on 2019/1/20.
 */

public class DayCheck implements MultiItemEntity {

    /**
     * ID : 28828ceb-91f9-4bb7-9db3-a9ef82cd25ae
     * PNumber : 2341431
     * MID : f75fb9c7-816d-40b8-96c2-204ce72b3c29
     * MName : 熟食店
     * CCategory : 熟食
     * Remark : 00071
     * CName : 茴香
     * Quantity : 12
     * Unit : 3
     * Origin : 阿凡达
     * PDateBatch : 123313414
     * Supplier : 789789
     * Contact : 12331231231
     * Dpurchase : null
     * MarketName : 金时代农贸市场
     * BillData : 2019-01-01 00:00:00
     * Rate : 90%
     * Project : 农药残留
     * Result : 合格
     * Permit : 76878787987
     * CreateDate : 2019-01-21 13:27:03
     * CreateUserId : 72fbbfea-2e3b-4f97-adc6-0668cd5312ee
     * CreateUserName : 郑州金时代农贸
     * ModifyDate : null
     * ModifyUserId : null
     * ModifyUserName : null
     * MarketID : c2022251-15cb-458f-9eff-837f5af580a9
     */
    private String checkDate;
    private String ID;
    private String PNumber;
    private String MID;
    private String MName;
    private String CCategory;
    private String Remark;
    private String CName;
    private int Quantity;
    private String Unit;
    private String Origin;
    private String PDateBatch;
    private String Supplier;
    private String Contact;
    private Object Dpurchase;
    private String MarketName;
    private String BillData;
    private String Rate;
    private String Project;
    private String Result;
    private String Permit;
    private String CreateDate;
    private String CreateUserId;
    private String CreateUserName;
    private Object ModifyDate;
    private Object ModifyUserId;
    private Object ModifyUserName;
    private String MarketID;
    private int type=0;

    public void setType(int type){
        this.type=type;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPNumber() {
        return PNumber;
    }

    public void setPNumber(String PNumber) {
        this.PNumber = PNumber;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getMName() {
        if(TextUtils.isEmpty(MName)){
         return "";
        }
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getCCategory() {
        return CCategory;
    }

    public void setCCategory(String CCategory) {
        this.CCategory = CCategory;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    public String getPDateBatch() {
        return PDateBatch;
    }

    public void setPDateBatch(String PDateBatch) {
        this.PDateBatch = PDateBatch;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public Object getDpurchase() {
        return Dpurchase;
    }

    public void setDpurchase(Object Dpurchase) {
        this.Dpurchase = Dpurchase;
    }

    public String getMarketName() {
        return MarketName;
    }

    public void setMarketName(String MarketName) {
        this.MarketName = MarketName;
    }

    public String getBillData() {
        return BillData;
    }

    public void setBillData(String BillData) {
        this.BillData = BillData;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String Project) {
        this.Project = Project;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }

    public String getPermit() {
        return Permit;
    }

    public void setPermit(String Permit) {
        this.Permit = Permit;
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

    public String getMarketID() {
        return MarketID;
    }

    public void setMarketID(String MarketID) {
        this.MarketID = MarketID;
    }

    @Override
    public int getItemType() {
        return type;
    }

}
