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

Mobile.startApplication('C:\\Users\\ACER\\Videos\\Android-MyDemoAppRN.1.2.0.build-231.apk', false)

Mobile.tap(findTestObject('Object Repository/Login/Navbar-Menu'), 0)

Mobile.tap(findTestObject('Login/TextView - Log In'), 0)

Mobile.tap(findTestObject('Login/Username-Field'), 0)

Mobile.setText(findTestObject('Object Repository/Login/Username-Field'), 'bob@example.com', 0)

Mobile.tap(findTestObject('Login/field-Password'), 0)

Mobile.setText(findTestObject('Login/field-Password'), '10203040', 0)

Mobile.tap(findTestObject('Object Repository/Login/Login-btn'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Product-detail/product-Backpack'), 0)

Mobile.tap(findTestObject('Product-detail/Backpack-add to cart'), 0)

Mobile.tap(findTestObject('Product-detail/cart'), 0)

Mobile.tap(findTestObject('My Cart/btn-proceed To Checkout'), 0)

//Mobile.tap(findTestObject('Shipping Address/Fullname-field'), 0)
Mobile.setText(findTestObject('Shipping Address/Fullname-field'), 'Rebecca Winter', 0)

//Mobile.tap(findTestObject('Shipping Address/addressLine1-field'), 0)
Mobile.setText(findTestObject('Shipping Address/addressLine1-field'), 'Mandorley 112', 0)

//Mobile.tap(findTestObject('Shipping Address/City-field'), 0)
Mobile.setText(findTestObject('Shipping Address/City-field'), 'Truro', 0)

//Mobile.tap(findTestObject('Shipping Address/ZipCode-field'), 0)
Mobile.setText(findTestObject('Shipping Address/ZipCode-field'), '89750', 0)

//Mobile.tap(findTestObject('Shipping Address/Country-field'), 0)
Mobile.setText(findTestObject('Shipping Address/Country-field'), 'United Kingdom', 0)

Mobile.tap(findTestObject('Shipping Address/btn-ToPayment'), 0)

WebUI.delay(10)

//Mobile.tap(findTestObject('Payment Method/field-Name'), 0)
Mobile.setText(findTestObject('Payment Method/android.widget.EditText - Rebecca Winter (1)'), 'Rebecca Winter', 0)

Mobile.setText(findTestObject('Payment Method/android.widget.EditText - 3258 1265 7568 789 (1)'), '325812657568789', 0)

Mobile.setText(findTestObject('Payment Method/android.widget.EditText - 0325 (1)'), '0325', 0)

Mobile.setText(findTestObject('Payment Method/android.widget.EditText - 123 (1)'), '123', 0)

Mobile.tap(findTestObject('Payment Method/btn-ReviewOrder'), 0)

Mobile.tap(findTestObject('Payment Method/btn-PlaceOrder'), 0)

Mobile.delay(2)

Mobile.tap(findTestObject('Payment Method/btn-ContinueShopping'), 0)

