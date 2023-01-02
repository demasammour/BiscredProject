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

WebUI.click(findTestObject('User Management/Create User Elements/Create User button'))

WebUI.sendKeys(findTestObject('User Management/Create User Elements/User Name'), 'Test User')

dynamicemail = CustomKeywords.'defaultpakage.custome.randomString'('letters', 9)

String newdynamicemail = dynamicemail + '@cnn.com'

WebUI.setText(findTestObject('User Management/Create User Elements/Email field'), newdynamicemail)

WebUI.click(findTestObject('User Management/Create User Elements/Accounts List'))

accountname = WebUI.getText(findTestObject('User Management/Create User Elements/Accounts list first option'))

WebUI.click(findTestObject('User Management/Create User Elements/Accounts list first option'))

WebUI.click(findTestObject('User Management/Create User Elements/Roles DDL'))

WebUI.sendKeys(findTestObject('User Management/Create User Elements/Roles DDL'), 'Super Admin')

WebUI.sendKeys(findTestObject('User Management/Create User Elements/Roles DDL'), Keys.chord(Keys.ENTER))

WebUI.check(findTestObject('User Management/Create User Elements/Activted Checkbox'))

WebUI.check(findTestObject('Object Repository/User Management/Create User Elements/Download checkbox'))

WebUI.click(findTestObject('Object Repository/User Management/Create User Elements/Download Limit Cadence DDL'))

WebUI.click(findTestObject('Object Repository/User Management/Create User Elements/Download Limit Cadence-First option-weekly'))

WebUI.clearText(findTestObject('User Management/Create User Elements/Download Limit'))

WebUI.sendKeys(findTestObject('Object Repository/User Management/Create User Elements/Download Limit'), '1000000')

WebUI.click(findTestObject('User Management/Create User Elements/Create User- submit the adding of user'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('User Management/Users list/Search field'), newdynamicemail)

WebUI.delay(6)

WebUI.doubleClick(findTestObject('Object Repository/User Management/Users list/View Link'))

WebUI.verifyElementText(findTestObject('User Management/Users list/Email on View page'), newdynamicemail)

WebUI.verifyElementText(findTestObject('User Management/Users list/Active label'), 'Active')

WebUI.verifyElementText(findTestObject('User Management/Users list/Super admin label on view page'), 'Super Admin')

WebUI.verifyTextPresent('Account + Company', false)

