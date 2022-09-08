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

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Employee List'))

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1')

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/a_'), '>')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Name_empsearchemployee_nameempName'), 'deleteme')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_Sub Unit__search'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Sub Unit__search'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/a_deleteme'), 0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Supervisor_chkSelectRow'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_OrangeHRM/input_Sub Unit_btnDelete'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Sub Unit_btnDelete'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/p_Delete records'), 'Delete records?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_OrangeHRM - Confirmation Required_dia_9fc7db'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_OrangeHRM/td_No Records Found'), 'No Records Found')

WebUI.closeBrowser()

