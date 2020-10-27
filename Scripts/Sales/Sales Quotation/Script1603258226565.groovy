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

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online/input_Sign In_username'), 'kaka.tori09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online/input_Sign In_password'), 
    'm9cofpLgdvKzmiJ3UoCGAA==')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  List Company/input_Choose Company_q'), 
    'JULI_TEST')

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  List Company/div_JULI_TEST'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Dashboard/button_Sales'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales/a_Sales Quotation'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/span_Create New'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Customer'))

WebUI.click(findTestObject('Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/span_expand_more'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note_field-line_items0.note'), 
    'N')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_N'), 
    'No')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_No'), 
    'Not')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Not'), 
    'Note')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note'), 
    'Note ')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note_1'), 
    'Note g')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note g'), 
    'Note ga')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note ga'), 
    'Note gar')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note gar'), 
    'Note garp')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note garp'), 
    'Note garpu')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Discount_field-line_items0.discount.value'), 
    ' 5')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Tax_field-line_items0.taxes'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_PPN (10)'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Other Cost_field-others0.amount_origin'), 
    'Rp 50')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/a_Sales Quotation'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/path'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/li_Detail'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Detail Sales Quotation/a_Sales Quotation'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/svg_finished_MuiSvgIcon-root'))

WebUI.closeBrowser()

