Feature: User Subscription
 Ensure that user see 3 subscription Options with different prices and names in our subscription website.
 
 Scenario: User Subscription
 Given  User open Subscription Page
 When   User check subscription options
 Then   User find 3 subscription options light , main and premium subscription options
