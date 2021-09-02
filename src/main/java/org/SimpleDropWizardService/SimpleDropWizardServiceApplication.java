package org.SimpleDropWizardService;

import com.codahale.metrics.servlets.AdminServlet;
import com.codahale.metrics.servlets.HealthCheckServlet;
import com.codahale.metrics.servlets.MetricsServlet;
import io.dropwizard.Application;
import io.dropwizard.jetty.NonblockingServletHolder;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.SimpleDropWizardService.resources.HelloWorldResource;

public class SimpleDropWizardServiceApplication extends Application<SimpleDropWizardServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SimpleDropWizardServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "SimpleDropWizardService";
    }

    @Override
    public void initialize(final Bootstrap<SimpleDropWizardServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SimpleDropWizardServiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(new HelloWorldResource());
        //environment.addResource(new HelloWorldResource());
        /*environment.getApplicationContext().setAttribute(
                MetricsServlet.METRICS_REGISTRY,
                environment.metrics());
        environment.getApplicationContext().setAttribute(
                HealthCheckServlet.HEALTH_CHECK_REGISTRY,
                environment.healthChecks());
        environment.getApplicationContext().addServlet(
                new NonblockingServletHolder(new AdminServlet()), "/admin/*");*/
    }

}
