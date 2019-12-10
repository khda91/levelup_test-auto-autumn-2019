package ru.level.qa.test.auto.autumn.api.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyResponse {

    private String type;

    @JsonProperty("id_company")
    private String idCompany;

    private Company company;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(String idCompany) {
        this.idCompany = idCompany;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "CopmpanyResponse{" +
                "type='" + type + '\'' +
                ", idCompany='" + idCompany + '\'' +
                ", company=" + company +
                '}';
    }
}
