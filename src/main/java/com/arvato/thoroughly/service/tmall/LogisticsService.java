package com.arvato.thoroughly.service.tmall;


import com.taobao.api.request.LogisticsCompaniesGetRequest;
import com.taobao.api.request.LogisticsDummySendRequest;
import com.taobao.api.request.LogisticsOfflineSendRequest;
import com.taobao.api.request.LogisticsOnlineSendRequest;
import com.taobao.api.request.LogisticsOrdersDetailGetRequest;
import com.taobao.api.request.WlbOrderJzConsignRequest;
import com.taobao.api.request.WlbOrderJzQueryRequest;
import com.taobao.api.request.WlbOrderJzpartnerQueryRequest;
import com.taobao.api.request.WlbOrderJzwithinsConsignRequest;
import com.taobao.api.response.LogisticsCompaniesGetResponse;
import com.taobao.api.response.LogisticsDummySendResponse;
import com.taobao.api.response.LogisticsOfflineSendResponse;
import com.taobao.api.response.LogisticsOnlineSendResponse;
import com.taobao.api.response.LogisticsOrdersDetailGetResponse;
import com.taobao.api.response.WlbOrderJzConsignResponse;
import com.taobao.api.response.WlbOrderJzQueryResponse;
import com.taobao.api.response.WlbOrderJzpartnerQueryResponse;
import com.taobao.api.response.WlbOrderJzwithinsConsignResponse;


/**
 * Created by ZHAO130 on 2016/10/28.
 */

public interface LogisticsService {

    /**
     * 线上发货
     * 发货接口
     * taobao.logistics.online.send
     * @param request
     * @return
     */
    public LogisticsOnlineSendResponse logisticsOnlineSend(LogisticsOnlineSendRequest request);

    /**
     * 线下发货
     * 发货接口
     * taobao.logistics.offline.send
     * @param request
     * @return
     */
    public LogisticsOfflineSendResponse logisticsOfflineSend(LogisticsOfflineSendRequest request);
    /**
     * 虚拟发货
     * taobao.logistics.dummy.send (无需物流（虚拟）发货处理)
     * @param request
     * @return
     */
    public LogisticsDummySendResponse dummySend(LogisticsDummySendRequest request);
    /**
     * 获取物流公司
     * taobao.logistics.companies.get
     * @param req
     * @return
     */
    public LogisticsCompaniesGetResponse getCompanies(LogisticsCompaniesGetRequest req);

    /**
     * 为支持家装类目的商家，对绑定家装物流服务的订单可以在商家的ERP中发货、批量发货，
     * 因此开发根据服务类型查询所有的服务商列表的接口
     * taobao.wlb.order.jzpartner.query
     * @param req
     * @return
     */
    public WlbOrderJzpartnerQueryResponse queryJzpartner(WlbOrderJzpartnerQueryRequest req);

    /**
     * 为支持家装类目的商家，对绑定家装物流服务的订单可以在商家的ERP中发货、批量发货，
     * 因此开发带安装服务商的发货接口
     * taobao.wlb.order.jswithins.consign
     *@param req
     * @return
     */
    public WlbOrderJzwithinsConsignResponse consignJswithins(WlbOrderJzwithinsConsignRequest req);

    /**
     *家装业务查询物流公司api
     * taobao.wlb.order.jz.query
     * @return
     */
    public WlbOrderJzQueryResponse queryJzWlCompany(WlbOrderJzQueryRequest req);

    /**
     *家装类订单使用该接口发货
     * taobao.wlb.order.jz.consign
     * @return
     */
    public WlbOrderJzConsignResponse consignJzSend(WlbOrderJzConsignRequest req);
    /**
     * 查询物流订单的详细信息，涉及用户隐私字段。
     */
    public LogisticsOrdersDetailGetResponse logisticsOrdersDetail(LogisticsOrdersDetailGetRequest req);

}
