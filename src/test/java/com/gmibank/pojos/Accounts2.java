package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Accounts2 {
    private String accounts;
    public String getAccounts() {
        return accounts;
    }
    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }
}
