package com.ict.tms.script.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ict.tms.config.AbstractBaseTest;
import com.ict.tms.constants.AppConstants;

/**
 * 
 * @author Silosha
 *
 */
public class ProfileScripts extends AbstractBaseTest {

	@Test(dataProvider = "trainerLoginCredentials", dataProviderClass = com.ict.tms.config.TmsTestDataProvider.class)
	public void testProfilePage(String email, String pwd, String homeUrl) {

		// Navigates to home page
		Flow().navigateTo(homeUrl);

		// Clicks login link
		App().Page().ofHome().clickLoginLink();

		Flow().ofWebDriverWait(10L).until(ExpectedConditions.urlToBe(homeUrl + AppConstants.URL_LOGIN));

		// Sending trainer login credentials
		App().Page().ofLogin().sendEmailAddress(email);
		App().Page().ofLogin().sendPassword(pwd);
		App().Page().ofLogin().clickLogin();

		// Profile page will be rendered with edit profile button
		Flow().ofWebDriverWait(10L).until(ExpectedConditions.visibilityOfElementLocated(By.id("btnEditProfile")));

		Assert.assertNotNull(App().Page().ofProfile().getTrainerName());
		Assert.assertNotNull(App().Page().ofProfile().getTraineCompany());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerAddress());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerDesignation());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerEmail());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerPhone());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerQualification());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerSkillsets());
		Assert.assertNotNull(App().Page().ofProfile().getTrainerProfileImage());
		Assert.assertTrue(App().Page().ofProfile().isEditProfileButtonVisible());

		// Trainer logout
		App().Page().ofHeadSection().clickLogout();
	}

}
