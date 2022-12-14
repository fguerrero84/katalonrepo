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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

WebUI.verifyElementVisible(findTestObject('Object Repository/Record and Play/span_Username'))

WebUI.click(findTestObject('Object Repository/Record and Play/span_Username'))

WebUI.setText(findTestObject('Object Repository/Record and Play/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Record and Play/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Record and Play/input_Password_Submit'), 0)

WebUI.click(findTestObject('Object Repository/Record and Play/input_Password_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Record and Play/a_Welcome Paul'), 0)

WebUI.click(findTestObject('Object Repository/Record and Play/a_Welcome Paul'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Record and Play/a_Logout'), 0)

