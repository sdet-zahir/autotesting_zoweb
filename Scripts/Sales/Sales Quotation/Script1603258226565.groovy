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

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online/div_Sign Up_MuiGrid-root MuiGrid-item MuiGr_6e6cba'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  List Company/div_JULI_TEST'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  List Company/div_JULI_TEST'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Dashboard/button_Sales'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales/a_Sales QuotationCreate Sales Quotation To _6f6747'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/a_Create New'))

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

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/span_expand_more'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Note_field-line_items0.note'), 
    'P')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_P'), 
    'Pe')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pe'), 
    'Pes')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pes'), 
    'Pesa')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesa'), 
    'Pesan')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan'), 
    'Pesan ')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan_1'), 
    'Pesan G')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan G'), 
    'Pesan Ga')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan Ga'), 
    'Pesan Gar')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan Gar'), 
    'Pesan Garp')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/textarea_Pesan Garp'), 
    'Pesan Garpu')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Discount_field-line_items0.discount.value'), 
    ' 5')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/svg_Tax_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_PPN (10)'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Department'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_A'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Project'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Project A'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Other Cost_field-others0.amount_origin'), 
    'Rp 2,000')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Customer'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Product'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_General Customer_jss370'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Document Number_field-document.number'), 
    'SQ101')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_Select Salesman'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/div_General Employee'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/span_keyboard_arrow_down'))

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Discount Days_field-term_of_payments0_63b595'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Discount Days_field-term_of_payments0_63b595'), 
    ' 3')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Due Days_field-term_of_payments0.due_days'), 
    ' 30')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Early Dicsount_field-term_of_payments_79a15f'), 
    ' 20')

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Late Charge_field-term_of_payments0.l_acb8b9'), 
    ' 31')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Early Dicsount_field-term_of_payments_79a15f'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Early Dicsount_field-term_of_payments_79a15f'), 
    ' 5')

WebUI.doubleClick(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Late Charge_field-term_of_payments0.l_acb8b9'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/input_Late Charge_field-term_of_payments0.l_acb8b9'), 
    ' 2.5')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save Template'))

WebUI.setText(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Recurring Transaction/input_Name_field-name'), 
    'SQT101')

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Recurring Transaction/div_Unset'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Recurring Transaction/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Add Sales Quotation/a_Sales Quotation'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/svg_finished_MuiSvgIcon-root'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Sales Quotation/li_Detail'))

WebUI.click(findTestObject('Object Repository/Sales/Sales Quotation/Page_Zahir Online  Detail Sales Quotation/a_Sales Quotation'))

WebUI.closeBrowser()

