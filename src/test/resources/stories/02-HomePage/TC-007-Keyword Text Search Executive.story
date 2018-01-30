Scenario: TC-007 - Keyword Text Search Executive

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
And [1100-1340] User fills keywordField with `keywordexecutive`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] executiveKeyword text should contain `executivejobtitle`, Within 20 seconds
And [1111-1130] executiveKeywordTwo text should contain `executivejobtitle`, Within 20 seconds