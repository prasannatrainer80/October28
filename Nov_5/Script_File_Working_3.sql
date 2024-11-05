use hexapracticeoctober;

drop table if exists agentpolicy;
drop table if exists agent;
drop table if exists policy;

create table Agent
(
   AgentId INT auto_increment,
   FirstName varchar(20),
   LastName varchar(20),
   Mi varchar(1),
   FullName varchar(20),
   Gender ENUM('MALE','FEMALE'),
   constraint pk_agent_agentId primary key(AgentId)
);

Create Table Policy
(
	PolicyId INT auto_increment,
    ModalPremium numeric(9,2),
    Annualpremium numeric(9,2),
    paymentMode INT,
    constraint pk_policy_policyId primary key(policyId)
);

create table AgentPolicy
(
    AgentId INT,
    PolicyId INT,
    isSplitAgent INT,
    constraint fk_agentPolicy_policyId foreign key(policyID) references policy(policyID),
    constraint fk_agentpolicy_agentId foreign key(agentId) references agent(agentId),
    constraint pk_agentPolicy_agpid primary key(agentId,policyId)
);