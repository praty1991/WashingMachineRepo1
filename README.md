# WashingMachineRepo1
#There are 2 modal classes :- 
  1. WashingMachineEntity (Washing Machine Entities)
  2. StartWM (Washing Machine input Entities)
# There are 2 service classes :-  
  1. Washer :- Washing machine functions are written in this class
  2. WashingMachineImpl :- Washing Machines inbuild databse Api written inside this class
# Controller Class :- 
  1. WashingMachineController
  # Controller class has below Api :-
    # 1. getWMMachineDetails (Fetch all Washing Machines)
         URL : http://localhost:8080/washingMachine/allWachingMachine
    # 2. addWMMachine(Adding new Washing Machine). it takes WashingMachineEntity as RequestBody
         URL : http://localhost:8080/washingMachine/add
    # 3. repairWMMachine (Repairing Washing Machine). it takes WashingMachineEntity as RequestBody
         URL : http://localhost:8080/washingMachine/repair
    # 4. startWMMachine (Start washing clothes). it takes StartWM as RequestBody
         URL : http://localhost:8080/washingMachine/start
         
# RestfulWebServicesApplication :- Application start from this point.
# There are 4 error and exception halding classes.
 1. CustomExceptionHandler
 2. MissingHeaderInfoException
 3. RecordNotFoundException
 4. ErrorResponse
 
# There are 2 Test classes have been written as below.
 1. WasherTest (Testing fuctionality of washing Machine)
 2. WashingMachineImplTest (Testing functionality of Storage Api)
 
         
