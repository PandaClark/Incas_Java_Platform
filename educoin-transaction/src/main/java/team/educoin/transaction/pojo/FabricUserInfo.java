package team.educoin.transaction.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * description:
 *
 * @author: chenzhou04
 * @create: 2019-04-16
 */
public class FabricUserInfo {

    @JsonProperty(value = "$class")
    private String className;
    private String email;
    private Double accountBalance;

    public FabricUserInfo() {
    }

    public FabricUserInfo(String className, String email, Double accountBalance) {
        this.className = className;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
