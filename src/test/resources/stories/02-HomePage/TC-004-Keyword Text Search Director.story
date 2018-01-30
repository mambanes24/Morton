Scenario: TC-004 - Home-Keyword Text Search Director

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
And [1100-1340] User fills keywordField with `keyworddirector`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] directorKeyword text should contain `directorjobtitle`, Within 20 seconds
And [1111-1130] directorKeywordTwo text should contain `directorjobtitle`, Within 20 seconds
