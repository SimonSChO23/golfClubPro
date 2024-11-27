Feature: GolfClub Operations

  Scenario: Search for a golf course
	Given I have the golfClubPro application
	When I enter Stuttgart as a location
	Then the result should be that I can see all golf courses in Stuttgart

  Scenario: Add golf course “FancyGolfCourse”
	Given I have the golfClubPro application
	When I add the “FancyGolfCourse” golf course in Stuttgart
	Then the result should be that “FancyGolfCourse” will show up

  Scenario: Update “FancyGolfCourse” to a different hole layout
	Given I have the golfClubPro application
	When I update the hole layout to 18-holes for the “FancyGolfCourse”
	Then the result should be that the hole layout is changed to 18 holes for the course
