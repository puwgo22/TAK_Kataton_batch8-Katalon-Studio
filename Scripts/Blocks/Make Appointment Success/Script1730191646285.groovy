import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Step 1 - Facility'
WebUI.selectOptionByValue(findTestObject('TC-02-Make Appointment/select_facility'), facility, true)

//WebUI.click(findTestObject('TC-02-Make Appointment/check_hospital_readmission'))
'Step 2 - Checkbox'
if (hospital_readmission == true) {
    WebUI.click(findTestObject('TC-02-Make Appointment/check_hospital_readmission'))
}

//WebUI.click(findTestObject('TC-02-Make Appointment/radio_Medicaid_programs'))
'Step 3 - RadioBox'
def select_radio = healthcare_program

switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Make Appointment/radio_Medicare_programs'))

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Make Appointment/radio_Medicaid_programs'))

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Make Appointment/radio_None_programs'))

        break
    default:
        println(select_radio)

        WebUI.click(findTestObject('TC-02-Make Appointment/radio_None_programs'))

        break
}

'Step 4 - Date'
WebUI.setText(findTestObject('TC-02-Make Appointment/input_visit_date'), visit_date)

'Step 5 - Comment'
WebUI.setText(findTestObject('TC-02-Make Appointment/textarea_comment'), comment)

'Step 6 - Button'
WebUI.click(findTestObject('TC-02-Make Appointment/button_Book Appointment'))

'Step 7 - Delay'
WebUI.delay(5)

'Step 8'
WebUI.verifyElementVisible(findTestObject('Appointment Confirmation/h2_Appointment Confirmation'))

'Step 9'
WebUI.verifyElementVisible(findTestObject('Appointment Confirmation/p_Please be informed'))

'Step 10 - Statement Facility'
WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_facility'), facility)

//WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Yes'), hospital_readmission)
'Step 11 - Statement Hospital Readmission'
if (hospital_readmission == true) {
    WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Yes'), 'Yes')
} else {
    WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Yes'), 'No')
}

//WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), healthcare_program)
'Step 12 - Statement Healthcare Program'
switch (select_radio) {
    case select_radio = 'Medicare':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'Medicare')

        break
    case select_radio = 'Medicaid':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'Medicaid')

        break
    case select_radio = 'None':
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'None')

        break
    default:
        println(select_radio)

        WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_Healthcare Program'), 'None')

        break
}

'Step 14 - Statement Comment'
WebUI.verifyElementText(findTestObject('Appointment Confirmation/p_comment'), comment)

