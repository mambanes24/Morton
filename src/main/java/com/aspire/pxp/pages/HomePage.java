package com.aspire.pxp.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name="home",url="${pages.home.url}")
public interface HomePage  {
	
	
	@CssSelector("${pages.home.magnifyingGlassIcon}")
	public AspireWebElement magnifyingGlassIcon();

	@CssSelector("${pages.home.keywordField}")
	public AspireWebElement keywordField();
	
	@CssSelector("${pages.home.locationField}")
	public AspireWebElement locationField();
	
	@CssSelector("${pages.home.currentLocation}")
	public AspireWebElement currentLocation();
	
	@CssSelector("${pages.home.clearButton}")
	public AspireWebElement clearButton();
	
	@CssSelector("${pages.home.clearButtonTwo}")
	public AspireWebElement clearButtonTwo();
	
	@CssSelector("${pages.home.recentSearchesItems}")
	public AspireWebElement recentSearchesItems();
	
	@CssSelector("${pages.home.distanceContainer}")
	public AspireWebElement distanceContainer();
	
	@CssSelector("${pages.home.exact}")
	public AspireWebElement exact();
	
	@CssSelector("${pages.home.distanceFive}")
	public AspireWebElement distanceFive();
	
	@CssSelector("${pages.home.distanceTen}")
	public AspireWebElement distanceTen();
	
	@CssSelector("${pages.home.distanceTwentyFive}")
	public AspireWebElement distanceTwentyFive();
	
	@CssSelector("${pages.home.distanceFifty}")
	public AspireWebElement distanceFifty();
	
	@CssSelector("${pages.home.distanceOneHundred}")
	public AspireWebElement distanceOneHundred();
	
	@CssSelector("${pages.home.sortBy}")
	public AspireWebElement sortBy();
	
	@CssSelector("${pages.home.sortByTitle}")
	public AspireWebElement sortByTitle();
	
	@CssSelector("${pages.home.firstJobTitle}")
	public AspireWebElement firstJobTitle();
	
	@CssSelector("${pages.home.categoriesFilter}")
	public AspireWebElement categoriesFilter();
	
	@CssSelector("${pages.home.administration}")
	public AspireWebElement administration();
	
	@CssSelector("${pages.home.administrationPill}")
	public AspireWebElement administrationPill();
	
	@CssSelector("${pages.home.administrativeClerical}")
	public AspireWebElement administrativeClerical();
	
	@CssSelector("${pages.home.administrativeClericalPill}")
	public AspireWebElement administrativeClericalPill();
	
	@CssSelector("${pages.home.consumerPersonalCarePill}")
	public AspireWebElement consumerPersonalCarePill();
	
	@CssSelector("${pages.home.medicalDevicesPill}")
	public AspireWebElement medicalDevicesPill();
	
	@CssSelector("${pages.home.architecture}")
	public AspireWebElement architecture();
	
	@CssSelector("${pages.home.biology}")
	public AspireWebElement biology();
	
	@CssSelector("${pages.home.biostatistics}")
	public AspireWebElement biostatistics();
	
	@CssSelector("${pages.home.brandProductMgmt}")
	public AspireWebElement brandProductMgmt();
	
	@CssSelector("${pages.home.brands}")
	public AspireWebElement brands();
	
	@CssSelector("${pages.home.consumerPersonalCare}")
	public AspireWebElement consumerPersonalCare();
	
	@CssSelector("${pages.home.medicalDevices}")
	public AspireWebElement medicalDevices();
	
	@CssSelector("${pages.home.mortonRegressionBrand}")
	public AspireWebElement mortonRegressionBrand();
	
	@CssSelector("${pages.home.nonOperatingCompanies}")
	public AspireWebElement nonOperatingCompanies();
	
	@CssSelector("${pages.home.officeofStrategyGrowth}")
	public AspireWebElement officeofStrategyGrowth();
	
	@CssSelector("${pages.home.pharmaceuticals}")
	public AspireWebElement pharmaceuticals();

	@CssSelector("${pages.home.experienceLevel}")
	public AspireWebElement experienceLevel();
	
	@CssSelector("${pages.home.professional}")
	public AspireWebElement professional();
	
	@CssSelector("${pages.home.jobOne}")
	public AspireWebElement jobOne();
	
	@CssSelector("${pages.home.student}")
	public AspireWebElement student();
	
	@CssSelector("${pages.home.location}")
	public AspireWebElement location();
	
	@CssSelector("${pages.home.albuquerqueNewMexico}")
	public AspireWebElement albuquerqueNewMexico();
	
	@CssSelector("${pages.home.allentownPensylvania}")
	public AspireWebElement allentownPensylvania();
	
	@CssSelector("${pages.home.alpharettaGeorgia}")
	public AspireWebElement alpharettaGeorgia();
	
	@CssSelector("${pages.home.annArborMichigan}")
	public AspireWebElement annArborMichigan();
	
	@CssSelector("${pages.home.athensGeorgia}")
	public AspireWebElement athensGeorgia();
	
	@CssSelector("${pages.home.jobTwo}")
	public AspireWebElement jobTwo();
	
	@CssSelector("${pages.home.jobThree}")
	public AspireWebElement jobThree();
	
	@CssSelector("${pages.home.dropDownOne}")
	public AspireWebElement dropDownOne();
	
	@CssSelector("${pages.home.dropDownTwo}")
	public AspireWebElement dropDownTwo();
	
	@CssSelector("${pages.home.dropDownThree}")
	public AspireWebElement dropDownThree();
	
	@CssSelector("${pages.home.dropDown4}")
	public AspireWebElement dropDown4();
	
	@CssSelector("${pages.home.readMoreOne}")
	public AspireWebElement readMoreOne();
	
	@CssSelector("${pages.home.readMoreTwo}")
	public AspireWebElement readMoreTwo();
	
	@CssSelector("${pages.home.readMoreThree}")
	public AspireWebElement readMoreThree();
	
	@CssSelector("${pages.home.facebook}")
	public AspireWebElement facebook();
	
	@CssSelector("${pages.home.twitter}")
	public AspireWebElement twitter();
	
	@CssSelector("${pages.home.linkedIn}")
	public AspireWebElement linkedIn();
	
	@CssSelector("${pages.home.emailButton}")
	public AspireWebElement emailButton();
	
	@CssSelector("${pages.home.complexApplication}")
	public AspireWebElement complexApplication();
	
	@CssSelector("${pages.home.ofccp}")
	public AspireWebElement ofccp();
	
	@CssSelector("${pages.home.applyButton}")
	public AspireWebElement applyButton();
	
	@CssSelector("${pages.home.salesKeyword}")
	public AspireWebElement salesKeyword();
	
	@CssSelector("${pages.home.salesKeywordTwo}")
	public AspireWebElement salesKeywordTwo();
	
	@CssSelector("${pages.home.directorKeyword}")
	public AspireWebElement directorKeyword();
	
	@CssSelector("${pages.home.directorKeywordTwo}")
	public AspireWebElement directorKeywordTwo();
	
	@CssSelector("${pages.home.managerKeyword}")
	public AspireWebElement managerKeyword();
	
	@CssSelector("${pages.home.managerKeywordTwo}")
	public AspireWebElement managerKeywordTwo();
	
	@CssSelector("${pages.home.accountKeyword}")
	public AspireWebElement accountKeyword();
	
	@CssSelector("${pages.home.accountKeywordTwo}")
	public AspireWebElement accountKeywordTwo();
	
	@CssSelector("${pages.home.executiveKeyword}")
	public AspireWebElement executiveKeyword();
	
	@CssSelector("${pages.home.executiveKeywordTwo}")
	public AspireWebElement executiveKeywordTwo();
	
	@CssSelector("${pages.home.locationPresence}")
	public AspireWebElement locationPresence();
	
	@CssSelector("${pages.home.firstJobGridLocation}")
	public AspireWebElement firstJobGridLocation();
	
	@CssSelector("${pages.home.secondJobGridLocation}")
	public AspireWebElement secondJobGridLocation();
	
	@CssSelector("${pages.home.thirdJobGridLocation}")
	public AspireWebElement thirdJobGridLocation();
	
	@CssSelector("${pages.home.fourthJobGridLocation}")
	public AspireWebElement fourthJobGridLocation();
	
	@CssSelector("${pages.home.searchResults}")
	public AspireWebElement searchResults();
	
	@CssSelector("${pages.home.categoryPresence}")
	public AspireWebElement categoryPresence();
	
	@CssSelector("${pages.home.firstCategoryJobGrid}")
	public AspireWebElement firstCategoryJobGrid();
	
	@CssSelector("${pages.home.secondCategoryJobFrid}")
	public AspireWebElement secondCategoryJobFrid();
	
	@CssSelector("${pages.home.thirdCategoryJobGrid}")
	public AspireWebElement thirdCategoryJobGrid();
	
	@CssSelector("${pages.home.fourthCategoryJobGrid}")
	public AspireWebElement fourthCategoryJobGrid();
	
	@CssSelector("${pages.home.jobDescriptionConsumerPerosnalCareText}")
	public AspireWebElement jobDescriptionConsumerPerosnalCareText();
	
	@CssSelector("${pages.home.secondJobDescriptionMedicalDevicesText}")
	public AspireWebElement secondJobDescriptionMedicalDevicesText();
	
	@CssSelector("${pages.home.usemyCurrentLocation}")
	public AspireWebElement usemyCurrentLocation();
	
	@CssSelector("${pages.home.noSearchResults}")
	public AspireWebElement noSearchResults();
	
	
	
	
}