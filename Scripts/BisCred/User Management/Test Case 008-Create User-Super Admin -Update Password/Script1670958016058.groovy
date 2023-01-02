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

WebUI.callTestCase(findTestCase('BisCred/Login/Test Case 001-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Main Header elements/User Management Main Menu'))

WebUI.click(findTestObject('User Management/Users list/Search field'))

WebUI.sendKeys(findTestObject('User Management/Users list/Search field'), 'pilik31390@areosur.com')

WebUI.delay(6)

WebUI.doubleClick(findTestObject('User Management/Users list/Edit Link'))

WebUI.scrollToElement(findTestObject('User Management/Users list/Update Password Section'), 0)

WebUI.sendKeys(findTestObject('User Management/Edit User Page/New Password'), 'Abc@123456789')

WebUI.sendKeys(findTestObject('User Management/Edit User Page/Confirm New Password'), 'Abc@123456789')

WebUI.click(findTestObject('User Management/Edit User Page/Update Password button'))

WebUI.click(findTestObject('Main Header elements/Profile icon'))

WebUI.click(findTestObject('Main Header elements/Logout icon'))

WebUI.sendKeys(findTestObject('Login Page Elements/Email text field'), 'pilik31390@areosur.com')

WebUI.sendKeys(findTestObject('Login Page Elements/Password text field'), 'Abc@123456789')

WebUI.click(findTestObject('Login Page Elements/Sign in button'))

