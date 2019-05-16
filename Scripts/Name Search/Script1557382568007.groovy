import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://develop-curie.h1insights.com/welcome')

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/button_Log in with Okta'))

WebUI.click(findTestObject('Object Repository/Page_H1-dev-859455 - Sign In/span_Sign In_icon input-icon person-16-gray'))

WebUI.setText(findTestObject('Object Repository/Page_H1-dev-859455 - Sign In/input_Sign In_username'), 'admin2@h1insights.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_H1-dev-859455 - Sign In/input_Sign In_password'), 'CeXXbuXHh3rd9oWlMamFYA==')

WebUI.click(findTestObject('Object Repository/Page_H1-dev-859455 - Sign In/input_Remember me_okta-signin-submit'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_Name'))

WebUI.setText(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/input_Name_sc-kAzzGY fXHSOY sc-cSHVUG bVKDce'), 
    'Neal Benowitz')

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_Search'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/a_Neal L Benowitz'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_OVERVIEWCLINICAL TRIALSPUBLICATIONSCOLLABORATORS'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_CLINICAL TRIALS'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_OVERVIEWCLINICAL TRIALSPUBLICATIONSCOLLABORATORS'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_PUBLICATIONS'))

WebUI.click(findTestObject('Object Repository/Page_H1 Institution and Expert Profiles Opinion Leader Identification and Analysis and Scholarly Analytics/div_COLLABORATORS'))

