Scenario: TC-006 - Keyword Text Search Account

Scenario: TC-005 - Home-Keyword Text Search Manager

Given [1000-9000] User opens home page
When [1000-3000] User maximize browser window
And [1100-1340] User fills keywordField with `keywordaccount`
And [1111-1000] magnifyingGlassIcon should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1130] accountKeyword text should contain `accountjobtitle`, Within 20 seconds
And [1111-1130] accountKeywordTwo text should contain `accountjobtitletwo`, Within 20 seconds
