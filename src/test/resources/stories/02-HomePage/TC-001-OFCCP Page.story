
Scenario: TC-001 - Home-Verify Header links section

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
Then [1100-1340] User fills keywordField with `keyword`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] applyButton should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1100] ofccpTitle text should equal to `ofccpheader`, Within 20 seconds
And [1111-1100] eeoInformation text should equal to `ofccpheadertwo`, Within 20 seconds
And [1111-1100] eeoEthinicAndRacialDesignations text should equal to `ofccpheaderthree`, Within 20 seconds
And [1111-1100] ethnicity text should equal to `ethnicity`, Within 20 seconds
And [1100-1320] User scroll to the hispanicorLatino
And [1111-1000] hispanicorLatino should be clickable, Within 20 seconds
And [1100-0370] User move mouse to it and click it
And [1111-1100] race text should equal to `race`, Within 20 seconds
And [1100-1320] User scroll to the raceDropDownList
And [1111-1000] raceDropDownList should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the americanIndianorAlaskaNative
And [1111-1000] americanIndianorAlaskaNative should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1100] gender text should equal to `gender`, Within 20 seconds
And [1100-1320] User scroll to the male
And [1111-1000] male should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1100] invitationtoSelfIdentifyasaProtectedVeteran text should equal to `invitation`, Within 20 seconds
And [1100-1320] User scroll to the notaProtectedVeteran
And [1111-1000] notaProtectedVeteran should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the next
And [1111-1000] next should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] voluntaryselfIndertificationofDisability text should contain `voluntary`, Within 20 seconds
And [1111-1100] reasonableAccommodationNotice text should equal to `accomodationnotice`, Within 20 seconds
And [1111-1100] pleaseCheckOneoftheBoxesBelow text should equal to `checkboxesbelow`, Within 20 seconds
And [1100-1320] User scroll to the noiDontHaveaDisability
And [1111-1000] noiDontHaveaDisability should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1100] yourNameInput text should equal to `yourname`, Within 20 seconds
And [1100-1320] User scroll to the yourNameField
And [1100-1340] User fills yourNameField with `name`
And [1111-1130] todaysDate text should contain `todaysdate`, Within 20 seconds
And [1100-1320] User scroll to the todaysDatepicker
And [1111-1000] todaysDatepicker should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the currentDate
And [1111-1000] currentDate should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the submit
And [1111-1000] submit should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] yourApplicationforOfccphasbeenSuccessfullySubmitted text should contain `successfulsubmition`, Within 20 seconds