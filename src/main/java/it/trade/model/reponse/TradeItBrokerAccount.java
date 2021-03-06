package it.trade.model.reponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TradeItBrokerAccount {
    @SerializedName("accountNumber")
    @Expose
    public String accountNumber;

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("accountBaseCurrency")
    @Expose
    public String accountBaseCurrency;

    @SerializedName("userCanDisableMargin")
    @Expose
    public boolean userCanDisableMargin;

    @SerializedName("accountIndex")
    @Expose
    public String accountIndex;

    @SerializedName("tradable")
    @Expose
    public boolean tradable;

    @SerializedName("orderCapabilities")
    @Expose
    public List<OrderCapability> orderCapabilities;

    @Override
    public String toString() {
        return "TradeItBrokerAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", accountBaseCurrency='" + accountBaseCurrency + '\'' +
                ", userCanDisableMargin='" + userCanDisableMargin + '\'' +
                ", accountIndex='" + accountIndex + '\'' +
                ", tradable='" + tradable + '\'' +
                ", orderCapabilities='" + orderCapabilities + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradeItBrokerAccount that = (TradeItBrokerAccount) o;

        if (userCanDisableMargin != that.userCanDisableMargin) return false;
        if (tradable != that.tradable) return false;
        if (accountNumber != null ? !accountNumber.equals(that.accountNumber) : that.accountNumber != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (accountBaseCurrency != null ? !accountBaseCurrency.equals(that.accountBaseCurrency) : that.accountBaseCurrency != null)
            return false;
        if (accountIndex != null ? !accountIndex.equals(that.accountIndex) : that.accountIndex != null) return false;
        return orderCapabilities != null ? orderCapabilities.equals(that.orderCapabilities) : that.orderCapabilities == null;
    }

    @Override
    public int hashCode() {
        int result = accountNumber != null ? accountNumber.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (accountBaseCurrency != null ? accountBaseCurrency.hashCode() : 0);
        result = 31 * result + (userCanDisableMargin ? 1 : 0);
        result = 31 * result + (accountIndex != null ? accountIndex.hashCode() : 0);
        result = 31 * result + (tradable ? 1 : 0);
        result = 31 * result + (orderCapabilities != null ? orderCapabilities.hashCode() : 0);
        return result;
    }
}
