package ru.level.qa.test.auto.autumn.api.soap;

import org.oorsprong.websamples.ArrayOftCountryCodeAndName;
import org.oorsprong.websamples.TCountryCodeAndName;
import org.oorsprong.websamples_countryinfo.CountryInfoService;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.samePropertyValuesAs;

public class SoapCxfGeneratedTest {

    @Test
    public void sampleTest() {
        CountryInfoService cis = new CountryInfoService();
        String capitalName = cis.getCountryInfoServiceSoap().capitalCity("RU");
        System.out.println(capitalName);
        assertThat(capitalName, equalTo("Moscow"));
    }

    @Test
    public void exampleTest() {
        CountryInfoService cis = new CountryInfoService();
        ArrayOftCountryCodeAndName countriesUsingCurrency = cis
                .getCountryInfoServiceSoap().countriesUsingCurrency("USD");
        TCountryCodeAndName us = new TCountryCodeAndName();
        us.setSISOCode("US");
        us.setSName("United States");

        TCountryCodeAndName tc = new TCountryCodeAndName();
        tc.setSISOCode("TC");
        tc.setSName("Turks And Caicos Islands");

        TCountryCodeAndName codeAndName = new TCountryCodeAndName();
        for (TCountryCodeAndName tCountryCodeAndName : countriesUsingCurrency.getTCountryCodeAndName()) {
            if (tCountryCodeAndName.getSISOCode().equals("US")) {
                codeAndName.setSISOCode(tCountryCodeAndName.getSISOCode());
                codeAndName.setSName(tCountryCodeAndName.getSName());
                break;
            }
        }

        System.out.println(codeAndName.getSISOCode() + " " + codeAndName.getSName());
        System.out.println(us.getSISOCode() + " " + us.getSName());
        assertThat(codeAndName, samePropertyValuesAs(us));

        assertThat(countriesUsingCurrency.getTCountryCodeAndName(),
                hasItems(samePropertyValuesAs(us), samePropertyValuesAs(tc)));
    }
}
