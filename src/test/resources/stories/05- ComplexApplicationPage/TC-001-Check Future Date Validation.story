Scenario: TC-001- Check Future Date Validation 

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
Then [1100-1340] User fills keywordField with `complexapplicationkeyword`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] applyButton should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryDropdownList should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryDropdownListCountryA should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryDropdownListState should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryDropdownListCountryAstateA should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] cityDropdownList should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryAstateAcityA should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the nextButton
And [1111-1000] nextButton should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] thisOptionARadioButton should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the thisOptionACheckBox
And [1111-1000] thisOptionACheckBox should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1101-1080] thisOptionACheckBox should be displayed
And [1100-1320] User scroll to the pickoneFromtheDropdown
And [1100-1300] User clicks on the pickoneFromtheDropdown
And [1111-1000] pleasepickOptionA should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1320] User scroll to the countryloadedbyListIdentifier
And [1111-1000] countryloadedbyListIdentifier should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] countryA should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1100-1340] User fills typeAheadCountry with `typeahead`
And [1111-1000] next should be clickable, Within 20 seconds
And [1100-0300] User click on it