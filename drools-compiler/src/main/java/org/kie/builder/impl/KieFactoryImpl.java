package org.kie.builder.impl;

import org.drools.kproject.GAVImpl;
import org.drools.kproject.models.KieModuleModelImpl;
import org.kie.builder.GAV;
import org.kie.builder.KieBuilder;
import org.kie.builder.KieContainer;
import org.kie.builder.KieFactory;
import org.kie.builder.KieFileSystem;
import org.kie.builder.KieModuleModel;
import org.kie.builder.KieScanner;
import org.kie.util.ServiceRegistryImpl;

public class KieFactoryImpl implements KieFactory {

    public GAV newGav(String groupId, String artifactId, String version) {
        return new GAVImpl(groupId, artifactId, version);
    }

    public KieModuleModel newKieProject() {
        return new KieModuleModelImpl();
    }

    public KieFileSystem newKieFileSystem() {
        return new KieFileSystemImpl();
    }
        
    
}