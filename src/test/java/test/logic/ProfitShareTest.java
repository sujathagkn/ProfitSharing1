package test.logic;


import com.test.logic.ProfitShare;
import org.junit.jupiter.api.Test;
import com.test.model.Subsidiary;

import java.util.LinkedList;

public class ProfitShareTest {

    @Test
    public void testWithNoDistrubutors() {
        ProfitShare profitShare = new ProfitShare();
        Subsidiary subsidiary = new Subsidiary();
        subsidiary.setSubsidiaryId(1);
        subsidiary.setSubsidiaryName("Local1");
        subsidiary.setSharePercent(0.3);

        Subsidiary subsidiary1 = new Subsidiary();
        subsidiary1.setSubsidiaryId(1);
        subsidiary1.setSubsidiaryName("Local_PostOffice");
        subsidiary1.setSharePercent(0.7);

        LinkedList<Subsidiary> subSubsidiaries = new LinkedList<Subsidiary>();

        Subsidiary subSubsidiary1 = new Subsidiary();
        subSubsidiary1.setSubsidiaryId(1);
        subSubsidiary1.setSubsidiaryName("test1");
        subSubsidiary1.setSharePercent(0.7);
        subSubsidiaries.add(subSubsidiary1);

        Subsidiary subSubsidiary2 = new Subsidiary();
        subSubsidiary2.setSubsidiaryId(1);
        subSubsidiary2.setSubsidiaryName("test2");
        subSubsidiary2.setSharePercent(0.3);

        subSubsidiaries.add(subSubsidiary2);
        subsidiary.setSubSubsidiaries(subSubsidiaries);
        LinkedList<Subsidiary> subsidiaries = new LinkedList<Subsidiary>();
        subsidiaries.add(subsidiary);
        subsidiaries.add(subsidiary1);

        profitShare.distribute(100, subsidiaries);
    }

    @Test
    public void testWithSubDistrubutors() {
        ProfitShare profitShare = new ProfitShare();
        Subsidiary subsidiary1 = new Subsidiary();
        subsidiary1.setSubsidiaryId(1);
        subsidiary1.setSubsidiaryName("Local_PostOffice");
        subsidiary1.setSharePercent(1);

        LinkedList<Subsidiary> subsidiaries = new LinkedList<Subsidiary>();

        subsidiaries.add(subsidiary1);

        profitShare.distribute(2000, subsidiaries);
    }
}
