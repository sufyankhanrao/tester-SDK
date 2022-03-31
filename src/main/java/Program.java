import java.io.IOException;
import localhost3000.Environment;
import localhost3000.TesterClient;
import localhost3000.exceptions.ApiException;
import localhost3000.models.SuiteCode;

public class Program {
    public static void main(String[] args) throws ApiException, IOException {
        TesterClient client = new TesterClient.Builder()
                .httpClientConfig(configBuilder -> configBuilder
                        .timeout(0).isSkipSslCertVerification(true))
                .environment(Environment.TESTING)
                .port("80")
                .suites(SuiteCode.HEARTS)
                .build();
        
        
        System.out.println(client.getResponseTypesController().get1123DateTime());
    }
}
