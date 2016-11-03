package com.arvato.thoroughly.model;

import java.util.Date;

public class JdpTbRefund {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.refund_id
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Long refundId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.seller_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private String sellerNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.buyer_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private String buyerNick;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.status
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.tid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Long tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.oid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Long oid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Date modified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.jdp_hashcode
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private String jdpHashcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.jdp_created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Date jdpCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.jdp_modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private Date jdpModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jdp_tb_refund.jdp_response
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    private String jdpResponse;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.refund_id
     *
     * @return the value of jdp_tb_refund.refund_id
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Long getRefundId() {
        return refundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.refund_id
     *
     * @param refundId the value for jdp_tb_refund.refund_id
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setRefundId(Long refundId) {
        this.refundId = refundId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.seller_nick
     *
     * @return the value of jdp_tb_refund.seller_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public String getSellerNick() {
        return sellerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.seller_nick
     *
     * @param sellerNick the value for jdp_tb_refund.seller_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick == null ? null : sellerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.buyer_nick
     *
     * @return the value of jdp_tb_refund.buyer_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public String getBuyerNick() {
        return buyerNick;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.buyer_nick
     *
     * @param buyerNick the value for jdp_tb_refund.buyer_nick
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick == null ? null : buyerNick.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.status
     *
     * @return the value of jdp_tb_refund.status
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.status
     *
     * @param status the value for jdp_tb_refund.status
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.created
     *
     * @return the value of jdp_tb_refund.created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.created
     *
     * @param created the value for jdp_tb_refund.created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.tid
     *
     * @return the value of jdp_tb_refund.tid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Long getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.tid
     *
     * @param tid the value for jdp_tb_refund.tid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setTid(Long tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.oid
     *
     * @return the value of jdp_tb_refund.oid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Long getOid() {
        return oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.oid
     *
     * @param oid the value for jdp_tb_refund.oid
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setOid(Long oid) {
        this.oid = oid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.modified
     *
     * @return the value of jdp_tb_refund.modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Date getModified() {
        return modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.modified
     *
     * @param modified the value for jdp_tb_refund.modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setModified(Date modified) {
        this.modified = modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.jdp_hashcode
     *
     * @return the value of jdp_tb_refund.jdp_hashcode
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public String getJdpHashcode() {
        return jdpHashcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.jdp_hashcode
     *
     * @param jdpHashcode the value for jdp_tb_refund.jdp_hashcode
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setJdpHashcode(String jdpHashcode) {
        this.jdpHashcode = jdpHashcode == null ? null : jdpHashcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.jdp_created
     *
     * @return the value of jdp_tb_refund.jdp_created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Date getJdpCreated() {
        return jdpCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.jdp_created
     *
     * @param jdpCreated the value for jdp_tb_refund.jdp_created
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setJdpCreated(Date jdpCreated) {
        this.jdpCreated = jdpCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.jdp_modified
     *
     * @return the value of jdp_tb_refund.jdp_modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public Date getJdpModified() {
        return jdpModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.jdp_modified
     *
     * @param jdpModified the value for jdp_tb_refund.jdp_modified
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setJdpModified(Date jdpModified) {
        this.jdpModified = jdpModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jdp_tb_refund.jdp_response
     *
     * @return the value of jdp_tb_refund.jdp_response
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public String getJdpResponse() {
        return jdpResponse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jdp_tb_refund.jdp_response
     *
     * @param jdpResponse the value for jdp_tb_refund.jdp_response
     *
     * @mbggenerated Tue Oct 25 20:18:36 CST 2016
     */
    public void setJdpResponse(String jdpResponse) {
        this.jdpResponse = jdpResponse == null ? null : jdpResponse.trim();
    }
}
