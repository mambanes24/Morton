package com.aspire.pxp.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
//import com.aspire.pxp.pages.common.SiteCommonElements;

@Page(name="ofccp",url="${pages.ofccp.url}")
public interface Ofccp {

	@CssSelector("${pages.ofccp.url}")
	public AspireWebElement url(); 

	@CssSelector("${pages.ofccp.ofccpTitle}")
	public AspireWebElement ofccpTitle(); 

	@CssSelector("${pages.ofccp.eeoInformation}")
	public AspireWebElement eeoInformation(); 

	@CssSelector("${pages.ofccp.eeoEthinicAndRacialDesignations}")
	public AspireWebElement eeoEthinicAndRacialDesignations(); 

	@CssSelector("${pages.ofccp.ethnicity}")
	public AspireWebElement ethnicity(); 

	@CssSelector("${pages.ofccp.hispanicorLatino}")
	public AspireWebElement hispanicorLatino(); 

	@CssSelector("${pages.ofccp.nothispanicorLatino}")
	public AspireWebElement nothispanicorLatino(); 

	@CssSelector("${pages.ofccp.idonotwishwtoprovidethisInformation}")
	public AspireWebElement idonotwishwtoprovidethisInformation(); 

	@CssSelector("${pages.ofccp.race}")
	public AspireWebElement race(); 

	@CssSelector("${pages.ofccp.logOutButton}")
	public AspireWebElement logOutButton(); 

	@CssSelector("${pages.ofccp.raceDropDownList}")
	public AspireWebElement raceDropDownList(); 

	@CssSelector("${pages.ofccp.americanIndianorAlaskaNative}")
	public AspireWebElement americanIndianorAlaskaNative(); 

	@CssSelector("${pages.ofccp.loasiangOutButton}")
	public AspireWebElement asian(); 

	@CssSelector("${pages.ofccp.gender}")
	public AspireWebElement gender(); 

	@CssSelector("${pages.ofccp.male}")
	public AspireWebElement male(); 

	@CssSelector("${pages.ofccp.female}")
	public AspireWebElement female(); 

	@CssSelector("${pages.ofccp.invitationtoSelfIdentifyasaProtectedVeteran}")
	public AspireWebElement invitationtoSelfIdentifyasaProtectedVeteran(); 
	
	@CssSelector("${pages.ofccp.notaProtectedVeteran}")
	public AspireWebElement notaProtectedVeteran();
	
	@CssSelector("${pages.ofccp.next}")
	public AspireWebElement next();
	
	@CssSelector("${pages.ofccp.voluntaryselfIndertificationofDisability}")
	public AspireWebElement voluntaryselfIndertificationofDisability();
	
	
	@CssSelector("${pages.ofccp.whyAreYoubeingAskedtoCompletethisForm}")
	public AspireWebElement whyAreYoubeingAskedtoCompletethisForm();
	
	@CssSelector("${pages.ofccp.howdoIknowifIhaveaDisability}")
	public AspireWebElement howdoIknowifIhaveaDisability();
	
	@CssSelector("${pages.ofccp.reasonableAccommodationNotice}")
	public AspireWebElement reasonableAccommodationNotice();
	
	@CssSelector("${pages.ofccp.pleaseCheckOneoftheBoxesBelow}")
	public AspireWebElement pleaseCheckOneoftheBoxesBelow();
	
	@CssSelector("${pages.ofccp.noiDontHaveaDisability}")
	public AspireWebElement noiDontHaveaDisability();
	
	@CssSelector("${pages.ofccp.yourNameInput}")
	public AspireWebElement yourNameInput();
	
	@CssSelector("${pages.ofccp.yourNameField}")
	public AspireWebElement yourNameField();
	
	@CssSelector("${pages.ofccp.todaysDate}")
	public AspireWebElement todaysDate();
	
	@CssSelector("${pages.ofccp.todaysDatepicker}")
	public AspireWebElement todaysDatepicker();
	
	@CssSelector("${pages.ofccp.currentDate}")
	public AspireWebElement currentDate();
	
	@CssSelector("${pages.ofccp.submit}")
	public AspireWebElement submit();
	
	@CssSelector("${pages.ofccp.yourApplicationforOfccphasbeenSuccessfullySubmitted}")
	public AspireWebElement yourApplicationforOfccphasbeenSuccessfullySubmitted();
	
	@CssSelector("${pages.ofccp.careersHome}")
	public AspireWebElement careersHome();
	
	@CssSelector("${pages.ofccp.ofccpLink}")
	public AspireWebElement ofccpLink();
	
		
}












