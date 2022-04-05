import java.io.IOException;
import tech.fortis.sandbox.api.Environment;
import tech.fortis.sandbox.api.FortisAPIClient;
import tech.fortis.sandbox.api.exceptions.ApiException;
import tech.fortis.sandbox.api.models.Page;

public class Program {
    public static void main(String[] args) throws ApiException, IOException {
        FortisAPIClient client = new FortisAPIClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder.timeout(0))
                .customHeaderAuthenticationCredentials("11ec32a6aea0e78ea5638a19",
                        "11ec8d9bdf472c4aba3adfc9", "260eJswa")
                .environment(Environment.SANDBOX).build();
//         System.out.println(client.getRecurringController()
//         .listAllRecurringRecord(new Page.Builder().number(5).size(5).build(), null, null));
        // System.out.println(client.getBatchesController()
        // .listAllBatches(new Page.Builder().number(5).size(5).build(), null, null));
//        System.out.println(client.getContactsController()
//                .listAllContacts(new Page.Builder().number(5).size(5).build(), null, null));
//        System.out.println(client.getContactsController()
//                .listAllContacts(new Page.Builder().number(5).size(5).build(), null, null));
        System.out.println(client.getTransactionsReadController()
                .listTransactions(new Page.Builder().number(5).size(5).build(), null, null));
    }
}
