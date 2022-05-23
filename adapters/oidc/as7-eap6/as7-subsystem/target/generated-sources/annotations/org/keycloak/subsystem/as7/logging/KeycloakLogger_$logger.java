
package org.keycloak.subsystem.as7.logging;

import java.io.Serializable;
import javax.annotation.Generated;
import org.jboss.logging.BasicLogger;
import org.jboss.logging.DelegatingBasicLogger;
import org.jboss.logging.Logger;


/**
 * Warning this class consists of generated code.
 * 
 */
@Generated(value = "org.jboss.logging.processor.model.MessageLoggerImplementor", date = "2021-04-16T08:12:07+0500")
public class KeycloakLogger_$logger
    extends DelegatingBasicLogger
    implements Serializable, BasicLogger, KeycloakLogger
{

    private final static long serialVersionUID = 1L;
    private final static String projectCode = "KEYCLOAK";
    private final static String FQCN = KeycloakLogger_$logger.class.getName();
    private final static String deploymentSecured = "Keycloak subsystem override for deployment %s";
    private final static String warSecured = "Keycloak has overriden and secured deployment %s";

    public KeycloakLogger_$logger(final Logger log) {
        super(log);
    }

    @Override
    public final void deploymentSecured(final String deployment) {
        super.log.logf(FQCN, (Logger.Level.INFO), null, deploymentSecured$str(), deployment);
    }

    protected String deploymentSecured$str() {
        return deploymentSecured;
    }

    @Override
    public final void warSecured(final String deployment) {
        super.log.logf(FQCN, (Logger.Level.DEBUG), null, warSecured$str(), deployment);
    }

    protected String warSecured$str() {
        return warSecured;
    }

}
