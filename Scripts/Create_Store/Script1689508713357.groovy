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

WebUI.openBrowser('https://partners.shopify.com/3044597/stores/new?store_type=test_store&data_type=static_data')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/Login/input_email'), 'huynhthi0503@gmail.com')
WebUI.click(findTestObject('Object Repository/Login/button_continue_email'))
WebUI.setText(findTestObject('Object Repository/Login/input_password'), '12341234')
WebUI.click(findTestObject('Object Repository/Login/button_login'))
WebUI.click(findTestObject('Object Repository/Create_Store/radio_button_for_a_client'))
WebUI.setText(findTestObject('Object Repository/Create_Store/input_store_name'), 'Thilearn1')// (run test case create store -> chạy dòng code này)
//WebUI.setText(findTestObject('Object Repository/Create_Store/input_store_name'), store_name) //(run test suites create_store_B8 -> chạy dòng code này)
WebUI.click(findTestObject('Object Repository/Create_Store/radio_button_yes'))
WebUI.click(findTestObject('Object Repository/Create_Store/button_create_store'))



