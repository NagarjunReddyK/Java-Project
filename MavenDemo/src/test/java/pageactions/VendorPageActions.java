package pageactions;

import base.Reusable;
import base.Setup;

public class VendorPageActions {
	public void navigateToAddVendor() {
		Reusable.click(Setup.login.getProperty("menuVendors"));
		Reusable.click(Setup.login.getProperty("lnkVendors"));
		Reusable.click(Setup.login.getProperty("tabAddVendor"));
	}

	public String getSuccessMessage() {
		return Reusable.getText(Setup.login.getProperty("msgVendorCreated"));
	}

}
