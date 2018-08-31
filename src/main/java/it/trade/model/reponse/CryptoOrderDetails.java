package it.trade.model.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CryptoOrderDetails {

    @SerializedName("estimatedTotalValue")
    @Expose
    public Double estimatedTotalValue;

    @SerializedName("orderQuantityType")
    @Expose
    public String orderQuantityType;

    @SerializedName("orderCommissionLabel")
    @Expose
    public String orderCommissionLabel;

    @SerializedName("orderExpiration")
    @Expose
    public String orderExpiration;

    @SerializedName("orderAction")
    @Expose
    public String orderAction;

    @SerializedName("orderPriceType")
    @Expose
    public String orderPriceType;

    @SerializedName("orderQuantity")
    @Expose
    public Double orderQuantity;

    @SerializedName("orderValueLabel")
    @Expose
    public String orderValueLabel;

    @SerializedName("estimatedOrderCommission")
    @Expose
    public Double estimatedOrderCommission;

    @SerializedName("estimatedOrderValue")
    @Expose
    public Double estimatedOrderValue;

    @SerializedName("orderPair")
    @Expose
    public String orderPair;

    @SerializedName("warnings")
    @Expose
    public List<Warning> warnings = new ArrayList<>();
}
