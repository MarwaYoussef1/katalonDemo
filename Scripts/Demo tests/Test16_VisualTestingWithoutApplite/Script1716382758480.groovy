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

WebUI.navigateToUrl('https://uat.saudiesports.sa/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), 'admin@saudiesports.sa')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), 'RMK5tS1XWFX2SZ5cJYBO/w==')

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__login'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Clubs Management'))

WebUI.takeScreenshotAsCheckpoint('club management screen')

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Teams Management'))

WebUI.takeScreenshotAsCheckpoint('club management screen')

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Members'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Teams'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_My Teams'))

WebUI.click(findTestObject('Object Repository/Page_Esports/a_Add New Team'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Back To Teams'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_CRM'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_AutoooJxoLcmehAX  Completed RQ000001859_5810c8'))

