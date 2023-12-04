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

WebUI.navigateToUrl('https://cis.del.ac.id/user/login')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_LoginFormusername'), username)

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Password_LoginFormpassword'), password)

WebUI.click(findTestObject('Object Repository/Page_Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Data Induk Mahasiswa'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Data Diri'))

WebUI.click(findTestObject('Object Repository/Page_11321069 Maria Fransiska Giawa/button_Home_btn btn-default btn-flat btn-se_c60d60'))

WebUI.click(findTestObject('Object Repository/Page_11321069 Maria Fransiska Giawa/a_Edit Data Induk'))

WebUI.click(findTestObject('Object Repository/Page_Edit 11321069 Maria Fransiska Giawa/a_Profile Mahasiswa'))

WebUI.setText(findTestObject('Object Repository/Page_Edit 11321069 Maria Fransiska Giawa/input_NIK_Dimnik'), '1271115711030002')

WebUI.click(findTestObject('Object Repository/Page_Edit 11321069 Maria Fransiska Giawa/ins_B_iCheck-helper'))

WebUI.setText(findTestObject('Object Repository/Page_Edit 11321069 Maria Fransiska Giawa/input_Hp2_Dimhp2'), '08126531959')

WebUI.click(findTestObject('Object Repository/Page_Edit 11321069 Maria Fransiska Giawa/button_Save'))

