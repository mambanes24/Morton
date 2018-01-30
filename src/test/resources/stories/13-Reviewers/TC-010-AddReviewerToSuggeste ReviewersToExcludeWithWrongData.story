Scenario: TC-010- Reviewers-Add Reviewer to Suggested Reviewers to Exclude with wrong data

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
And [1111-1000] Article should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Type Continue should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Reviewers_Tab should be clickable, Within 20 seconds
And [1100-0300] User click on it
Then [1111-1080] Reviewers_Header should be displayed, Within 20 seconds
And [1101-0140] Text should contain Reviewers
And [1111-1000] Exclude_Add_Reviewer_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] Exclude_Reviewer_FName should be displayed, Within 20 seconds
And [1100-1340] User fills Exclude_Reviewer_FName with `empty`
And [1100-1340] User fills Exclude_Reviewer_LName with z
And [1100-1340] User fills Exclude_Reviewer_Email with `empty`
And [1100-1340] User fills Exclude_Comments with `empty`
And [1111-1000] Exclude_SaveHide_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Next should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1000] Previous should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] Include_Reviewer_NameError_Msg should be displayed, Within 20 seconds
And [1101-0100] Text should equal to First and Last Names are required.
And [1101-1200] Include_Reviewer_EmailError_Msg value should equal to A valid Email response is required.
And [1101-1200] Include_Reviewer_InstitutionError_Msg value should equal to Institution response is required.
And [1101-1200] Include_Reviewer_CountryError_Msg value should equal to Country response is required.

