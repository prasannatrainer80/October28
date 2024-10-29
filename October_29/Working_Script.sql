/* **********************************************************
			      Creating Agent Table 
   **********************************************************
*/

SET NOCOUNT ON

if exists(select * from sysobjects where name='AgentPolicy')
Drop Table AgentPolicy 

if exists(select * from sysobjects where name='Agent')
Drop Table Agent 

create table Agent
(
   AgentID int Identity(1,1) 
   constraint pk_agent_agentid primary key,
   FirstName varchar(30) 
   constraint chk_Agent_FirstName 
   check(FirstName not LIKE '%[^a-zA-Z]%'),  
   MI varchar(1),
   LastName varchar(30)  
   constraint chk_Agent_LastName 
   check(LastName not LIKE '%[^a-zA-Z]%'),
   FullName varchar(80),
   Gender varchar(10) 
   constraint chk_Agent_Gender 
   check(Gender in('Male','Female')),
   DOB DateTime 
   constraint chk_Agent_DOB 
   check(Dob <= getdate()),
   SSN varchar(30) 
   constraint chk_Agent_SSN 
   check(SSN like '[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]'),
   MaritalStatus int 
   constraint chk_Agent_MaritalStatus
   check(MaritalStatus in(0,1)),
   Address1 varchar(30), 
   Address2 varchar(30), 
   City varchar(30),
   [STATE] varchar(30), 
   ZipCode varchar(30),
   Country varchar(30), 
   InsertedOn DateTime
   constraint def_Agent_Insertedon default getdate(),
   InsertedBy varchar(30) 
   constraint def_Agent_InsertedBy default system_user,
   UpdatedOn DateTime,
   UpdatedBy varchar(30),
   DeletedOn DateTime,
   DeletedBy varchar(30)
)   

/*   *********************************************************
	  		    Inserting into Agent Table
     *********************************************************
*/

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,STATE,ZipCode,Country)
values('Sunitha','P','Premjee','Female','1/2/1988','434-55-3323',
1,'5th Avenue','Near Church','Parlin','NJ','434554','USA')   

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,STATE,ZipCode,Country)
values('Pranitha','R','Reddy','Female','1/2/1986','324-55-2344',
1,'8th Mile','Sterling Heights','Detroit','MI','442345','USA')

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,STATE,ZipCode,Country)
values('Shavetha','D','Datta','Female','1/2/1980','643-34-4443',
0,'Dwaraka Nagar','5th Phase','NewDelhi','UP','438533','INDIA')

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,STATE,ZipCode,Country)
values('Shanthi','T','Tangvel','Female','12/03/1983','644-23-4534',
1,'Near Food Court','2nd Phase','Chicago','MI','483845','USA')

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,State,ZipCode,Country)
values('ashraf','V','Vahora','Male','1/1/1983','435-22-5212',
1,'8th Avenue','Church Road','Maywood','NJ','78434','USA') 

Insert into Agent(FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,
Address1,Address2,City,State,ZipCode,Country)
values('Ramesh','L','Gole','Male','1/2/1981','643-34-7373',
0,'5th Phase','Sterling Heights','Detroit','MI','477843','USA')

Insert Into Agent(FirstName,MI,LastName,Gender,DOB,SSN,
MaritalStatus,Address1,Address2,City,State,ZipCode,Country)
values('Lavanya','S','K','FeMale','12-12-1988','335-44-2344',
0,'LIG B87','ASRAO NR','SECBAD','AP','500062','INDIA')

Insert into Agent(FirstName,MI,LASTNAME,Gender,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,
ZipCode,Country)
values('Murali','S','Krishna','Male','09-03-1986',
'234-44-2335',1,'RK HOstel','Ameerpet','HYDBAD','AP',
'500042','INDIA')

Insert into Agent(FirstName,MI,LASTNAME,Gender,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,
ZipCode,Country)
values('Raj','S','kumar','Male','12-12-1987',
'345-23-4211',0,'MadhaPur','Nr Cyber Towers','HYDBAD','AP',
'509244','INDIA')

Insert into Agent(FirstName,MI,LASTNAME,Gender,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,
ZipCode,Country)
values('Srimukha','S','Manchu','FeMale','09-03-1986',
'231-44-2335',0,'NRS','Madhapur','HYDBAD','AP',
'500042','INDIA')

Insert into Agent(FirstName,MI,LASTNAME,Gender,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,
ZipCode,Country)
values('Lalitha','S','B','FeMale','12-11-1987',
'341-23-4211',0,'KondaPur','Nr Stadium','HYDBAD','AP',
'509244','INDIA')

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,FULLNAME,GENDER,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,ZipCode,
Country)
Values('Rakesh','K','Chowdary','R K Chowdary','Male',
'1/2/1986','123-23-2444',1,'8th Mile','Church Road','Detroit',
'MI','484555','USA')

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,FULLNAME,GENDER,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,ZipCode,
Country)
Values('Rama','U','Rao','Rama Rao U','Male',
'1/2/1983','223-43-1444',1,'5th Mile','Ford Street','Chicago',
'NY','2484555','USA')

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,FULLNAME,GENDER,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,ZipCode,
Country)
Values('Madhuri','S','M','S M Madhuri','FeMale',
'12/12/1989','423-33-2444',1,'Beach Street','Univ Road','NewYork',
'CT','5484555','USA')

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,FULLNAME,GENDER,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,ZipCode,
Country)
Values('Prafulla','U','Rao','Prafulla U Rao','FeMale',
'1/2/1987','523-22-2644',1,'8th Mile','IBM Road','Detroit',
'MI','484555','USA')

INSERT INTO AGENT(FIRSTNAME,MI,LASTNAME,FULLNAME,GENDER,
DOB,SSN,MaritalStatus,Address1,Address2,City,State,ZipCode,
Country)
Values('Prasanna','P','Kumar','P Prasanna Kumar','Male',
'09/03/1980','423-23-1444',1,'ASRAO NR','Good Luck Cafe','SECBAD',
'AP','500 062','INDIA') 


/*  *********************************************************
			     Creating Policy Table
	*********************************************************
*/

if exists(select * from sysobjects where name='Policy') 
Drop Table Policy 

Create Table Policy
(
  PolicyID int Identity(1,1) 
  constraint pk_policy_policyID primary key,
  AppNumber varchar(30),
  AppDate datetime,
  PolicyNumber varchar(30),
  AnnualPremium numeric(9,2),
  PaymentModeID int,
  ModalPremium numeric(9,2),
  InsertedOn DateTime
  constraint def_Policy_InsertedOn default getdate(),
  InsertedBy varchar(30) 
  constraint def_policy_InsertedBy default system_user,	
  UpdatedOn DateTime,
  UpdatedBy varchar(30),
  Deletedon DateTime,
  DeletedBy varchar(30) 
)

/*  *********************************************************
		   Inserting Data into Policy Table  
	*********************************************************
*/ 

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A001','12/12/2010','C001',12000,2,2000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A002','12/12/2010','C002',20000,1,12000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A003','12/12/2010','C003',150000,1,20000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A004','01/02/2005','P001',22000,1,1000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A005','03/09/2009','S231',122000,2,22000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A006','02/12/2010','A131',232000,2,21000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A007','09/12/2007','P231',212000,2,23000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A008','03/09/2009','S231',122000,2,22000)

INSERT INTO POLICY(APPNUMBER,APPDATE,POLICYNUMBER,
ANNUALPREMIUM,PAYMENTMODEID,MODALPREMIUM)
VALUES('A009','03/09/2009','I231',192000,1,24000)	

/* **********************************************************
			Creating AgentPolicy Table
   **********************************************************
*/

if exists(select * from sysobjects where name='AgentPolicy')
Drop Table AgentPolicy 

Create Table AgentPolicy
(
   AgentID int 
   constraint fk_AgentPolicy_AgentID references Agent(AgentID),
   PolicyID int 
   constraint fk_AgentPolicy_PolicyID references Policy(PolicyID) 
   constraint pk_AgentPolicy_AgentIDPolicyID 
   primary key(AgentID,PolicyID),
   IsSplitAgent int
   constraint chk_AgentPolicy_IsSplitAgent 
   check(IsSplitAgent in(1,2)),
   InsertedOn DateTime
   constraint def_AgentPolicy_InsertedOn 
   default getdate(),
   InsertedBy varchar(30) 
   constraint def_AgentPolicy_InsertedBy 
   default system_user,
   UpdatedOn DateTime,
   UpdatedBy varchar(30),
   DeletedOn DateTime,
   DeletedBy varchar(30)
)
/*  *****************************************************
		 Inserting Data into AgentPolicy Table
	*****************************************************
*/

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(1,1,2)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(1,3,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(2,3,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(2,1,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(2,4,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(2,5,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(4,1,2)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(4,3,1)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(5,1,2)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(5,2,1)

	