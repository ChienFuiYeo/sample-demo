General
-
Start SpringBoot application with the following jvm arguments: 
> **-Dspring.profiles.active=sit,tw,cn,hk,sg -Dregion=sg**


**region:** decided which Spring bean to be executed

**spring.profiles.active:** only to init the Spring bean, however if CreditCheck/DealAdd request get called, only the activated region's beans will be reacted to the request.