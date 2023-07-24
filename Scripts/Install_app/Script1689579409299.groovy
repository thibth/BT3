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

WebUI.openBrowser('https://alireviews-fe.onecommerce.io/install')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Install_app/input_store_name'), 'thilearn')
WebUI.click(findTestObject('Object Repository/Install_app/button_login'))
WebUI.setText(findTestObject('Object Repository/Login/input_email'), 'huynhthi0503@gmail.com')
WebUI.click(findTestObject('Object Repository/Login/button_continue_email'))
WebUI.setText(findTestObject('Object Repository/Login/input_password'), '12341234')
WebUI.click(findTestObject('Object Repository/Login/button_login'))
WebUI.click(findTestObject('Object Repository/Install_app/button_install'))
WebUI.click(findTestObject('Object Repository/Install_app/choose_account_partner'))
WebUI.delay(100)
WebUI.takeScreenshot("Evidence/Img_install/install_app.png")

