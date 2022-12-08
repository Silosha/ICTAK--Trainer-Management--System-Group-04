package com.ict.tms.script.profile;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.tms.config.AbstractBaseTest;
import com.ict.tms.constants.AppConstants;
import com.ict.tms.util.AppUtil;
import com.ict.tms.util.ExcelUtil;

/**
 * 
 * @author Silosha
 *
 */
public class EditProfileScript extends AbstractBaseTest{

	@Test(dataProvider = "trainerLoginCredentials", dataProviderClass = com.ict.tms.config.TmsTestDataProvider.class)
	public void testEditProfile(String emailId, String pwd, String url) {
		
		// Navigates to home page
		Flow().navigateTo(url);
		
		// Clicks login link
		App().Page().ofHome().clickLoginLink();
		
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.urlToBe(url+AppConstants.URL_LOGIN));
		
		// Sending trainer login credentials
		App().Page().ofLogin().sendEmailAddress(emailId);
		App().Page().ofLogin().sendPassword(pwd);
		App().Page().ofLogin().clickLogin();
		
		//Profile page will be rendered with edit profile button
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.visibilityOfElementLocated(By.id("btnEditProfile")));
		
		// Clicks edit profile button
		App().Page().ofProfile().clickEditProfileButton();
		
		//Edit profile page will rendered with Edit profile form
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.urlToBe(url+AppConstants.URL_EDITPROFILE));
		
		// Reading trainer test data from excel file
		ExcelUtil excelUtil = new ExcelUtil(AppConstants.TRAINER_TEST_DATA_EXCEL_FILE);
		
		String tdAddress = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_ADDRESS);
		String tdCompany = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_COMPANY);
		String tdDesignation = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_DESIGNATION);
		String tdEmail = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_EMAIL);
		String tdName = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_NAME);
		String tdPhoneNo = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_PHONENO);
		String tdQualification = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_QUALIFICATION);
		String tdSkills = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_SKILLSETS);
		String tdProfileImage = excelUtil.getCellData(0, 1, AppConstants.EXL_COL_PROFILEIMAGE);
		
		//Sending trainer profile details
		App().Page().ofEditProfilePage().sendAddress(tdAddress);
		App().Page().ofEditProfilePage().sendCompany(tdCompany);
		App().Page().ofEditProfilePage().sendDesignation(tdDesignation);
		App().Page().ofEditProfilePage().sendEmail(tdEmail);
		App().Page().ofEditProfilePage().sendName(tdName);
		App().Page().ofEditProfilePage().sendPhone(tdPhoneNo);
		App().Page().ofEditProfilePage().sendQualification(tdQualification);
		App().Page().ofEditProfilePage().sendSkillSets(tdSkills);
		App().Page().ofEditProfilePage().sendProfileImage(AppUtil.getTrainerProfileImagePath(tdProfileImage));
		
		// Clicks Edit button 
		App().Page().ofEditProfilePage().clickEditButton();
		
		// Trainer profile page will be rendered
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.urlToBe(url+AppConstants.URL_PROFILE));		
		
		// Asserting the trainer profile details
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerName(), tdName);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTraineCompany(), tdCompany);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerAddress(), tdAddress);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerDesignation(), tdDesignation);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerEmail(), tdEmail);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerPhone(), tdPhoneNo);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerProfileImage(), tdProfileImage);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerQualification(), tdQualification);
		AssertJUnit.assertEquals(App().Page().ofProfile().getTrainerSkillsets(), tdSkills);
		
		// Trainer logout
		App().Page().ofHeadSection().clickogout();
		
		//Home page will be rendered
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.urlToBe(url));
	}
}
