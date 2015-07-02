A story is a collection of scenarios
 
Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
     
Scenario:  A scenario is a collection of executable steps of different type
 
!--Given step represents a precondition to an event
When Add a student with name ZhangSan, sex true and age 13
Then check student's name ZhangSan
 
Scenario:  Another scenario exploring different combination of events
 
!--Given a precondition
When Add a student with name Lisi, sex true and age 14
Then check student's name Lisi
Then check student's age 4

Scenario:  Another scenario exploring different combination of eventsd
When Add a student with name WangWu, sex true and age 15
Then check student's name WangWu
Then check the student's age is 15 years old