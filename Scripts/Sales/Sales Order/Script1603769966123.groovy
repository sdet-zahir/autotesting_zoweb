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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.zahir.dev/auth')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online/input_Sign In_username'), 'kaka.tori09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online/input_Sign In_password'), 'm9cofpLgdvKzmiJ3UoCGAA==')

WebUI.sendKeys(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online/input_Sign In_password'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  List Company/input_Choose Company_q'), 
    'JULI_')

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  List Company/div_JULI_TEST'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Dashboard/button_Sales'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Sales/a_Sales Order'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Sales Order/a_Create New'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_Select Product'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_P004Garpu5,413,354Rp 1,000'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/span_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/input_Select Quotation No._jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Order/Page_Zahir Online  Add Sales Order/a_Sales Order'))

WebUI.closeBrowser()

