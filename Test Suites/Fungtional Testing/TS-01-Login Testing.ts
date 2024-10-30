<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS-01-Login Testing</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient>purwantonugro@gmail.com;</mailRecipient>
   <numberOfRerun>1</numberOfRerun>
   <pageLoadTimeout>20</pageLoadTimeout>
   <pageLoadTimeoutDefault>false</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>true</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>acd57906-3e75-44c1-a0e4-85d902c499be</testSuiteGuid>
   <testCaseLink>
      <guid>33ea1db2-fb57-41f2-8b33-5d7bca2da493</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC-01-Login/01-Login Success</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>a7b9b13b-f0f3-4977-ba5a-09b4cb195216</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/katalonData/validLogin</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>a7b9b13b-f0f3-4977-ba5a-09b4cb195216</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>716ccdb3-1292-4968-847c-8e35ff77a7ba</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a7b9b13b-f0f3-4977-ba5a-09b4cb195216</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>a02a0d43-29a7-4518-a3a7-d4201c52b7c4</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>158e25b6-8804-475a-9a51-c5aca3057d36</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC-01-Login/02-Login Password Empty</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>ad45caab-5f82-4b7e-9607-c5d1592f8c0c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC-01-Login/03-Login Username Empty</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>1a0dc14c-10ee-46e3-bf5e-28114b9f897a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC-01-Login/04-Login Password Incorrect</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>28bcfde6-92a9-429d-b14a-9ae44944fb71</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Scenario/TC-01-Login/05-Login Username Incorrect</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
