package methods-backend;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class methods backendApplication extends Application<methods backendConfiguration> {

    public static void main(final String[] args) throws Exception {
        new methods backendApplication().run(args);
    }

    @Override
    public String getName() {
        return "methods backend";
    }

    @Override
    public void initialize(final Bootstrap<methods backendConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final methods backendConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
