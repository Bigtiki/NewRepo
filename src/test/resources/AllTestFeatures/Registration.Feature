Feature: User Rgistration
As a new user I can register and log in

Background: User on HOme Page
    Given User is on MCT home page
    
 Scenario: User Can signUp
 When user go to sighnUp Page
 And Use can register as a new user
 Then User See profile name as Registered user
