package StepDefinitions;

import Pages.NavigatePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _06_DataTable {
    NavigatePage np=new NavigatePage();

    @And("Click on Element Navigate")
    public void clickOnElementNavigate(DataTable linkler) {
        List<String> listLinkler=linkler.asList();

        for (int i = 0; i < listLinkler.size(); i++) {
           np.myClick( np.getWebElement(listLinkler.get(0)));
        }

    }
}
