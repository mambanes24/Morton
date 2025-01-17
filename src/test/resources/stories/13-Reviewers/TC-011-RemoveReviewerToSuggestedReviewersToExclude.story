Scenario: TC-011- Reviewers-Remove Reviewer to Suggested Reviewers to Exclude

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
And [1100-1340] User fills Exclude_Reviewer_FName with G.
And [1100-1340] User fills Exclude_Reviewer_LName with Alexe
And [1100-1340] User fills Exclude_Reviewer_Email with alexe@ifp.uni-bremen.de
And [1111-1000] Exclude_Reviewer_Country_Germany should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1100-1340] User fills Exclude_Reviewer_Institution with Universitht Bremen
And [1100-1340] User fills Exclude_Comments with Exclude Reviewer
And [1111-1000] Exclude_SaveHide_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] Exclude_Reviewer_Row should be displayed, Within 20 seconds
And [1111-1000] Exclude_Remove_Btn should be clickable, Within 20 seconds
And [1100-0300] User click on it
And [1111-1080] None_Assigned_Exclude_Reviewer_Msg should be displayed, Within 20 seconds
And [1101-0100] Text should equal to None assigned.