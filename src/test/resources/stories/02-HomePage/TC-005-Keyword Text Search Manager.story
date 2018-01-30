Scenario: TC-005 - Home-Keyword Text Search Manager

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
And [1100-1340] User fills keywordField with `keywordmanager`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] managerKeyword text should contain `managerjobtitle`, Within 20 seconds
And [1111-1130] managerKeywordTwo text should contain `managerjobtitle`, Within 20 seconds
