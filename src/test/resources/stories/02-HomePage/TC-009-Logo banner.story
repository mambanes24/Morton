Scenario: TC-009 - Home-Verify Clicking on the logo banner

Given [1000-9000] User opens Login page
When [1000-3000] User maximize browser window
And [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] logo Banner should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1000-4000] User switchs to tab 1
Then [1111-1080] Scitation Home Page should be displayed, Within 20 seconds
And [1101-0100] Text should equal to Applied Physics Letters
And [1000-3050] User close the active window