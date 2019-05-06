package ye.fang.model;

import android.support.annotation.NonNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 18650 on 2019/1/20.
 */

public class DayReport implements Comparable<DayReport>{

    /**
     * Id : null
     * OrderDate : 2018-12-24 15:52:42
     * ScaleNumber : 4
     * CreateUserId : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * FID : null
     * SID : 8210
     * SubID : 1
     * MemberId : 13756862345
     * MemberName : null
     * ProductCode : 72
     * ProductName : 紫圆葱
     * UnitId : 3
     * Qty : 0.589999973773956
     * RealPrice : 3.16
     * Price : 3.16
     * Tax : 0.0
     * Amount : 1.9
     * OrganizeId : e54ac8c7-4ded-4baa-b7e2-f2964d029db0
     * Year : null
     * Month : null
     * Day : null
     * Count : null
     * SumAmount : 1.9
     * Per : null
     * RealMoney : 1.9
     * CashMoney : 0.0
     * CardMoney : 1.9
     * Type : 0
     * Payment : 1
     * PaymentState : null
     * CardMoney1 : 0.0
     * CardMoney2 : 0.0
     * CardMoney3 : 0.0
     * CardMoney4 : null
     * Other1 : null
     * StaffId : 0
     * StaffName : null
     * sumoverAmount : 9488.43
     * sumoverCardAmount : 0.0
     * sumoverCardMoney : 1276.5
     * sumoverCardMoney1 : 2361.2
     * sumoverCardMoney2 : 298.2
     * sumoverCardMoney3 : 0.0
     * sumoverCashMoney : 5552.53
     * sumoverQty : 83497.7189700816
     * Point : null
     * Reject : 0
     */

    private Object Id;
    private String OrderDate;
    private String ScaleNumber;
    private String CreateUserId;
    private Object FID;
    private String SID;
    private String SubID;
    private String MemberId;
    private Object MemberName;
    private String ProductCode;
    private String ProductName;
    private String UnitId;
    private double Qty;
    private double RealPrice;
    private double Price;
    private double Tax;
    private double Amount;
    private String OrganizeId;
    private Object Year;
    private Object Month;
    private Object Day;
    private Object Count;
    private double SumAmount;
    private Object Per;
    private double RealMoney;
    private double CashMoney;
    private double CardMoney;
    private String Type;
    private int Payment;
    private Object PaymentState;
    private double CardMoney1;
    private double CardMoney2;
    private double CardMoney3;
    private Object CardMoney4;
    private Object Other1;
    private String StaffId;
    private Object StaffName;
    private double sumoverAmount;
    private double sumoverCardAmount;
    private double sumoverCardMoney;
    private double sumoverCardMoney1;
    private double sumoverCardMoney2;
    private double sumoverCardMoney3;
    private double sumoverCashMoney;
    private double sumoverQty;
    private Object Point;
    private int Reject;

    public Object getId() {
        return Id;
    }

    public void setId(Object Id) {
        this.Id = Id;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getScaleNumber() {
        return ScaleNumber;
    }

    public void setScaleNumber(String ScaleNumber) {
        this.ScaleNumber = ScaleNumber;
    }

    public String getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(String CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    public Object getFID() {
        return FID;
    }

    public void setFID(Object FID) {
        this.FID = FID;
    }

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSubID() {
        return SubID;
    }

    public void setSubID(String SubID) {
        this.SubID = SubID;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public Object getMemberName() {
        return MemberName;
    }

    public void setMemberName(Object MemberName) {
        this.MemberName = MemberName;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public double getQty() {
        return Qty;
    }

    public void setQty(double Qty) {
        this.Qty = Qty;
    }

    public double getRealPrice() {
        return RealPrice;
    }

    public void setRealPrice(double RealPrice) {
        this.RealPrice = RealPrice;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double Tax) {
        this.Tax = Tax;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double Amount) {
        this.Amount = Amount;
    }

    public String getOrganizeId() {
        return OrganizeId;
    }

    public void setOrganizeId(String OrganizeId) {
        this.OrganizeId = OrganizeId;
    }

    public Object getYear() {
        return Year;
    }

    public void setYear(Object Year) {
        this.Year = Year;
    }

    public Object getMonth() {
        return Month;
    }

    public void setMonth(Object Month) {
        this.Month = Month;
    }

    public Object getDay() {
        return Day;
    }

    public void setDay(Object Day) {
        this.Day = Day;
    }

    public Object getCount() {
        return Count;
    }

    public void setCount(Object Count) {
        this.Count = Count;
    }

    public double getSumAmount() {
        return SumAmount;
    }

    public void setSumAmount(double SumAmount) {
        this.SumAmount = SumAmount;
    }

    public Object getPer() {
        return Per;
    }

    public void setPer(Object Per) {
        this.Per = Per;
    }

    public double getRealMoney() {
        return RealMoney;
    }

    public void setRealMoney(double RealMoney) {
        this.RealMoney = RealMoney;
    }

    public double getCashMoney() {
        return CashMoney;
    }

    public void setCashMoney(double CashMoney) {
        this.CashMoney = CashMoney;
    }

    public double getCardMoney() {
        return CardMoney;
    }

    public void setCardMoney(double CardMoney) {
        this.CardMoney = CardMoney;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getPayment() {
        return Payment;
    }

    public void setPayment(int Payment) {
        this.Payment = Payment;
    }

    public Object getPaymentState() {
        return PaymentState;
    }

    public void setPaymentState(Object PaymentState) {
        this.PaymentState = PaymentState;
    }

    public double getCardMoney1() {
        return CardMoney1;
    }

    public void setCardMoney1(double CardMoney1) {
        this.CardMoney1 = CardMoney1;
    }

    public double getCardMoney2() {
        return CardMoney2;
    }

    public void setCardMoney2(double CardMoney2) {
        this.CardMoney2 = CardMoney2;
    }

    public double getCardMoney3() {
        return CardMoney3;
    }

    public void setCardMoney3(double CardMoney3) {
        this.CardMoney3 = CardMoney3;
    }

    public Object getCardMoney4() {
        return CardMoney4;
    }

    public void setCardMoney4(Object CardMoney4) {
        this.CardMoney4 = CardMoney4;
    }

    public Object getOther1() {
        return Other1;
    }

    public void setOther1(Object Other1) {
        this.Other1 = Other1;
    }

    public String getStaffId() {
        return StaffId;
    }

    public void setStaffId(String StaffId) {
        this.StaffId = StaffId;
    }

    public Object getStaffName() {
        return StaffName;
    }

    public void setStaffName(Object StaffName) {
        this.StaffName = StaffName;
    }

    public double getSumoverAmount() {
        return sumoverAmount;
    }

    public void setSumoverAmount(double sumoverAmount) {
        this.sumoverAmount = sumoverAmount;
    }

    public double getSumoverCardAmount() {
        return sumoverCardAmount;
    }

    public void setSumoverCardAmount(double sumoverCardAmount) {
        this.sumoverCardAmount = sumoverCardAmount;
    }

    public double getSumoverCardMoney() {
        return sumoverCardMoney;
    }

    public void setSumoverCardMoney(double sumoverCardMoney) {
        this.sumoverCardMoney = sumoverCardMoney;
    }

    public double getSumoverCardMoney1() {
        return sumoverCardMoney1;
    }

    public void setSumoverCardMoney1(double sumoverCardMoney1) {
        this.sumoverCardMoney1 = sumoverCardMoney1;
    }

    public double getSumoverCardMoney2() {
        return sumoverCardMoney2;
    }

    public void setSumoverCardMoney2(double sumoverCardMoney2) {
        this.sumoverCardMoney2 = sumoverCardMoney2;
    }

    public double getSumoverCardMoney3() {
        return sumoverCardMoney3;
    }

    public void setSumoverCardMoney3(double sumoverCardMoney3) {
        this.sumoverCardMoney3 = sumoverCardMoney3;
    }

    public double getSumoverCashMoney() {
        return sumoverCashMoney;
    }

    public void setSumoverCashMoney(double sumoverCashMoney) {
        this.sumoverCashMoney = sumoverCashMoney;
    }

    public double getSumoverQty() {
        return sumoverQty;
    }

    public void setSumoverQty(double sumoverQty) {
        this.sumoverQty = sumoverQty;
    }

    public Object getPoint() {
        return Point;
    }

    public void setPoint(Object Point) {
        this.Point = Point;
    }

    public int getReject() {
        return Reject;
    }

    public void setReject(int Reject) {
        this.Reject = Reject;
    }

    @Override
    public int compareTo(@NonNull DayReport dayReport) {
        SimpleDateFormat format =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        Date date1 = new Date();
        Date date2 = new Date();
        try {
            date1 = format.parse(this.OrderDate);
            date2 = format.parse(dayReport.getOrderDate());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(date2.getTime()==date1.getTime()){
            return 0;
        }else if(date2.getTime()>date1.getTime()){
            return -1;
        }else if(date2.getTime()<date1.getTime()){
            return 1;
        }
        return 0;
    }
}
