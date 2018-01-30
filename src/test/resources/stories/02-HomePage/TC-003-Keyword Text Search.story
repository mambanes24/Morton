Scenario: TC-003 - Keyword Text Search Page

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
And [1100-1340] User fills keywordField with `keywordsales`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] salesKeyword text should contain `salesjobtitle`, Within 20 seconds
And [1111-1130] salesKeywordTwo text should contain `salesjobtitletwo`, Within 20 seconds
