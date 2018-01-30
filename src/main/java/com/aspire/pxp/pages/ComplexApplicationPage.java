package com.aspire.pxp.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "complexApp", url="")
public interface ComplexApplicationPage {

	@CssSelector("${pages.complexApp.countryDropdownList}")
	public AspireWebElement countryDropdownList();
	
	@CssSelector("${pages.complexApp.countryDropdownListCountryA}")
	public AspireWebElement countryDropdownListCountryA();
	
	@CssSelector("${pages.complexApp.countryDropdownListState}")
	public AspireWebElement countryDropdownListState();
	
	@CssSelector("${pages.complexApp.countryDropdownListCountryAstateA}")
	public AspireWebElement countryDropdownListCountryAstateA();
	
	@CssSelector("${pages.complexApp.cityDropdownList}")
	public AspireWebElement cityDropdownList();
	
	@CssSelector("${pages.complexApp.countryAstateAcityA}")
	public AspireWebElement countryAstateAcityA();
	
	@CssSelector("${pages.complexApp.thisOptionARadioButton}")
	public AspireWebElement thisOptionARadioButton();
	
	@CssSelector("${pages.complexApp.thisOptionA}")
	public AspireWebElement thisOptionA();
	
	@CssSelector("${pages.complexApp.countryLoadedbyListIdentifier}")
	public AspireWebElement countryLoadedbyListIdentifier();
	
	@CssSelector("${pages.complexApp.countryA}")
	public AspireWebElement countryA();
	
	@CssSelector("${pages.complexApp.typeAheadCountry}")
	public AspireWebElement typeAheadCountry();
	
	@CssSelector("${pages.complexApp.nextButton}")
	public AspireWebElement nextButton();
	
	@CssSelector("${pages.complexApp.thisOptionACheckBox}")
	public AspireWebElement thisOptionACheckBox();
	
	@CssSelector("${pages.complexApp.pickoneFromtheDropdown}")
	public AspireWebElement pickoneFromtheDropdown();
	
	@CssSelector("${pages.complexApp.pleasepickOptionA}")
	public AspireWebElement pleasepickOptionA();
	
	@CssSelector("${pages.complexApp.countryloadedbyListIdentifier}")
	public AspireWebElement countryloadedbyListIdentifier();
	

	
	
	
}