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

WebUI.callTestCase(findTestCase('Login Page/Login successful - Library'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OrangeHRM/b_PIM'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_OrangeHRM/b_PIM'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_Add Employee'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Add Employee'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h1_Add Employee'), 'Add Employee')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input__firstName'), 0)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__firstName'), 'deleteme')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input__lastName'), 0)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__lastName'), 'now')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/h1_deleteme now'), 'deleteme now')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Gender_personaloptGender'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --SingleMarriedOther'), 'Married', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Date of Birth_personalDOB'), '1980-08-08')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/li_Male'), ' Male')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/select_-- Select --SingleMarriedOther'), '-- Select --\nSingle\nMarried\nOther')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 'deleteme')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Sub Unit__search'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_deleteme'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_deleteme'), 'deleteme')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_now'), 'now')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_deleteme'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/input__personaltxtEmpFirstName'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/input__personaltxtEmpLastName'), '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/input_Date of Birth_personalDOB'), '')

WebUI.closeBrowser()

