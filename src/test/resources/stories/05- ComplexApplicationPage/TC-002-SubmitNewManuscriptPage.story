Scenario: TC-002 - Submit Manuscript-Submit new manuscript page

Given [1000-9000] User opens Login page
When [1000-3000] User maximize browser window
And [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Submit Manuscript should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [8101-0004] User Accepts dialog
And [1111-1000] Submit New Manuscript Button should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Submit New Manuscript should be displayed, Within 20 seconds
And [1101-0140] Text should contain New Manuscript Submission to Applied Physics Letters
And [1111-1080] Article should be displayed, Within 20 seconds
And [1111-1080] CommentResponse should be displayed, Within 20 seconds
And [1111-1080] Erratum should be displayed, Within 20 seconds
And [1111-1080] Type Continue should be displayed, Within 20 seconds