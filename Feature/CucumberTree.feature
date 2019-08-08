Feature: Actitime Application

  Scenario Outline: Successful Login with Valid Credentials
    Given Launch the appilcation
    When enter the "<username>" and "<password>"
    Then Click on Login button

    Examples: 
      | username | password |
      | admin    | manager  | 
