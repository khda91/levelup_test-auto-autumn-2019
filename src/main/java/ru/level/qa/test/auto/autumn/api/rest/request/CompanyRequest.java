package ru.level.qa.test.auto.autumn.api.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

public class CompanyRequest {

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("company_type")
    private String companyType;

    @JsonProperty("company_users")
    private List<String> companyUsers;

    @JsonProperty("email_owner")
    private String emailOwner;

    public CompanyRequest() {
    }

    public CompanyRequest(String companyName, String companyType, List<String> companyUsers, String emailOwner) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.companyUsers = companyUsers;
        this.emailOwner = emailOwner;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public List<String> getCompanyUsers() {
        return companyUsers;
    }

    public void setCompanyUsers(List<String> companyUsers) {
        this.companyUsers = companyUsers;
    }

    public String getEmailOwner() {
        return emailOwner;
    }

    public void setEmailOwner(String emailOwner) {
        this.emailOwner = emailOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyRequest that = (CompanyRequest) o;
        return Objects.equals(companyName, that.companyName) &&
                Objects.equals(companyType, that.companyType) &&
                Objects.equals(companyUsers, that.companyUsers) &&
                Objects.equals(emailOwner, that.emailOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, companyType, companyUsers, emailOwner);
    }

    @Override
    public String toString() {
        return "CompanyRequest{" +
                "company_name='" + companyName + '\'' +
                ", company_type='" + companyType + '\'' +
                ", company_users='" + companyUsers + '\'' +
                ", email_owner='" + emailOwner + '\'' +
                '}';
    }
}
