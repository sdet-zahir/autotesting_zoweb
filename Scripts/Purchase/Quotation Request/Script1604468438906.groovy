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

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online/input_Sign In_username'), 
    'kaka.tori09@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online/input_Sign In_password'), 
    'm9cofpLgdvKzmiJ3UoCGAA==')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online/button_Sign In'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  List Company/input_Choose Company_q'), 
    'JULI_TEST')

WebUI.doubleClick(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  List Company/div_JULI_TEST'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Dashboard/button_Purchase'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Purchases/a_Quotation RequestCreate Quotation To Supplier'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Purchase Quotation/a_Create New'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Supplier'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Supplier_field-supplier'), 
    'General Vendor')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_General Vendor'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Product'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Product_field-line_items[0].product'), 
    'Garpu')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Garpu'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input__field-line_items0.quantity'), 
    ' 5')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Supplier'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Supplier_field-supplier'), 
    'General Vendor')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_General Vendor'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Product'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Product_field-line_items0.product'), 
    'Garpu')

WebUI.doubleClick(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input__field-line_items0.quantity'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input__field-line_items0.quantity'), 
    ' 2')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/span_expand_more'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Discount_field-line_items0.discount.value'), 
    ' 5')

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Other Cost_field-others0.amount_origin'), 
    'Rp 500')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Supplier'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Supplier_field-supplier'), 
    'General Vendor')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_General Vendor'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_General Vendor_jss370'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Select Product'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input_Select Product_field-line_items0.product'), 
    'Garpu')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/div_Garpu'))

WebUI.setText(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/input__field-line_items0.quantity'), 
    ' 1')

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/button_Save'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Add Purchase Quotation/a_Quotation Request'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Purchase Quotation/span_account_circle'))

WebUI.click(findTestObject('Object Repository/Purchase/Quotation Request/Create Quotation Request/Page_Zahir Online  Purchase Quotation/p_Logout'))

WebUI.closeBrowser()

WebUI.closeBrowser()

